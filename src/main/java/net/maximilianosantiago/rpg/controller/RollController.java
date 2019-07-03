package net.maximilianosantiago.rpg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.maximilianosantiago.rpg.model.Roll;

@RestController
@RequestMapping("api/v1/")
public class RollController {


	@RequestMapping(value = "rolls", method = RequestMethod.POST)
	public Roll create(@RequestBody Roll roll) {
		return RollStub.create(roll);
	}

	@RequestMapping(value= "rolls", method = RequestMethod.GET)
	public List<Roll> list(){
		return RollStub.list();
	}
	
}
