package net.maximilianosantiago.rpg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.maximilianosantiago.rpg.model.Player;

@RestController
@RequestMapping("api/v1/")
public class PlayerController {

	@RequestMapping(value= "players", method = RequestMethod.GET)
	public List<Player> list(){
		return PlayerStub.list();
	}

	@RequestMapping(value = "players", method = RequestMethod.POST)
	public Player create(@RequestBody Player player) {
		return PlayerStub.create(player);
	}

	@RequestMapping(value = "players/{id}", method = RequestMethod.GET)
	public Player get(@PathVariable Long id) {
		return PlayerStub.get(id);
	}

	@RequestMapping(value = "players/{id}", method = RequestMethod.PUT)
	public Player update(@PathVariable Long id, @RequestBody Player player) {
		return PlayerStub.update(id, player);
	}

	@RequestMapping(value = "players/{id}", method = RequestMethod.DELETE)
	public Player delete(@PathVariable Long id) {
		return PlayerStub.delete(id);
	}
	
}
