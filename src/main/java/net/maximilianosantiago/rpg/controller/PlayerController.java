package net.maximilianosantiago.rpg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import net.maximilianosantiago.rpg.model.Player;
import net.maximilianosantiago.rpg.repository.PlayerRepository;

@RestController
@RequestMapping("api/v1/")
public class PlayerController {
	
	@Autowired
	private PlayerRepository playerRepository;

	@RequestMapping(value= "players", method = RequestMethod.GET)
	public List<Player> list(){
		return playerRepository.findAll();
	}

	@RequestMapping(value = "players", method = RequestMethod.POST)
	public Player create(@Valid @RequestBody Player player) {
		return playerRepository.saveAndFlush(player);
	}
	
	@RequestMapping(value = "players/{id}", method = RequestMethod.GET)
	public Player get(@PathVariable Long id) {
		return playerRepository.findOne(id);
	}

	@RequestMapping(value = "players/{id}", method = RequestMethod.PUT)
	public Player update(@PathVariable Long id, @RequestBody Player player) {
		Player existingPlayer = playerRepository.findOne(id);
		BeanUtils.copyProperties(player, existingPlayer);
		return playerRepository.saveAndFlush(existingPlayer);
	}

	@RequestMapping(value = "players/{id}", method = RequestMethod.DELETE)
	public Player delete(@PathVariable Long id) {
		Player existingPlayer = playerRepository.findOne(id);
		playerRepository.delete(existingPlayer);
		return existingPlayer;
		
	}
	
}
