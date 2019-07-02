package net.maximilianosantiago.rpg.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.maximilianosantiago.rpg.model.Session;

@RestController
@RequestMapping("api/v1/")
public class SessionController {

	@RequestMapping(value= "sessions", method = RequestMethod.GET)
	public List<Session> list(){
		return SessionStub.list();
	}

	@RequestMapping(value = "sessions", method = RequestMethod.POST)
	public Session create(@RequestBody Session session) {
		return SessionStub.create(session);
	}

	@RequestMapping(value = "sessions/{id}", method = RequestMethod.GET)
	public Session get(@PathVariable Long id) {
		return SessionStub.get(id);
	}

	@RequestMapping(value = "sessions/{id}", method = RequestMethod.PUT)
	public Session update(@PathVariable Long id, @RequestBody Session session) {
		return SessionStub.update(id, session);
	}

	@RequestMapping(value = "sessions/{id}", method = RequestMethod.DELETE)
	public Session delete(@PathVariable Long id) {
		return SessionStub.delete(id);
	}
	
}
