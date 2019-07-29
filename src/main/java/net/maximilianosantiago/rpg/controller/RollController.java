package net.maximilianosantiago.rpg.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.maximilianosantiago.rpg.model.Roll;
import net.maximilianosantiago.rpg.repository.RollRepository;
import net.maximilianosantiago.rpg.utils.Utils;

@RestController
@RequestMapping("api/v1/")
public class RollController {

	@Autowired
	private RollRepository rollRepository;

	@RequestMapping(value = "rolls", method = RequestMethod.POST)
	public Roll create(@RequestBody Roll roll) {
		roll.setRolledDate(System.currentTimeMillis());
		final Integer[] rolledDice = rollDice(roll.getDieFace(), roll.getQuantity());
		roll.setRolledDice(rolledDice);
		roll.setSum(getSum(rolledDice, roll.getBonusIncrement()));
		roll.setMaxValue(getMaxValue(rolledDice));
		roll.setMinValue(getMinValue(rolledDice));
		return rollRepository.saveAndFlush(roll);
	}

	@RequestMapping(value= "rolls", method = RequestMethod.GET)
	public List<Roll> list(){
		return rollRepository.findAll();
	}
	
	@RequestMapping(value= "rolls/{sessionId}", method = RequestMethod.GET)
	public List<Roll> listFromSession(@PathVariable Long sessionId){
		return rollRepository.findBySessionId(sessionId);
	}
	
	private Integer[] rollDice(Integer face, Integer qty) {
		List<Integer> rolls = new ArrayList<Integer>();
		for (int i = 0; i < qty; i++) {
			rolls.add(Utils.rollDice(face));
		}
		return rolls.toArray(new Integer[qty]);
	}
	
	private Integer getMaxValue(Integer[] rolledDice) {
		List<Integer> rolledValues = new ArrayList<Integer>(Arrays.asList(rolledDice));
		return Collections.max(rolledValues);
	}
	
	private Integer getMinValue(Integer[] rolledDice) {
		List<Integer> rolledValues = new ArrayList<Integer>(Arrays.asList(rolledDice));
		return Collections.min(rolledValues);
	}
	
	private Integer getSum(Integer[] rolledDice, Integer bonusIncrement) {
		Integer sumResult = 0;
		
		for (int i = 0; i < rolledDice.length; i++) {
			sumResult += rolledDice[i];
		}	
		
		return sumResult + bonusIncrement;
	}
	
	
}
