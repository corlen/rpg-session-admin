package net.maximilianosantiago.rpg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.maximilianosantiago.rpg.model.Roll;
import net.maximilianosantiago.rpg.repository.RollRepository;

@RestController
@RequestMapping("api/v1/")
public class RollController {

	@Autowired
	private RollRepository rollRepository;

	@RequestMapping(value = "rolls", method = RequestMethod.POST)
	public Roll create(@RequestBody Roll roll) {
		return rollRepository.saveAndFlush(roll);
	}

	@RequestMapping(value= "rolls", method = RequestMethod.GET)
	public List<Roll> list(){
		return rollRepository.findAll();
	}
	
}
