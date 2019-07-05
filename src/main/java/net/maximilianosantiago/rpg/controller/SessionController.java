package net.maximilianosantiago.rpg.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.maximilianosantiago.rpg.model.Session;
import net.maximilianosantiago.rpg.repository.SessionRepository;

@RestController
@RequestMapping("api/v1/")
public class SessionController {

	@Autowired
	private SessionRepository sessionRepository;
	
	@RequestMapping(value= "sessions", method = RequestMethod.GET)
	public List<Session> list(){
		return sessionRepository.findAll();
	}

	@RequestMapping(value = "sessions", method = RequestMethod.POST)
	public Session create(@RequestBody Session session) {
		session.setCreatedDate(System.currentTimeMillis());
		return sessionRepository.saveAndFlush(session);
	}

	@RequestMapping(value = "sessions/{id}", method = RequestMethod.GET)
	public Session get(@PathVariable Long id) {
		return sessionRepository.findOne(id);
	}

	@RequestMapping(value = "sessions/{id}", method = RequestMethod.PUT)
	public Session update(@PathVariable Long id, @RequestBody Session session) {
		Session existingSession = sessionRepository.findOne(id);
		BeanUtils.copyProperties(session, existingSession);
		return sessionRepository.saveAndFlush(existingSession);
	}

	@RequestMapping(value = "sessions/{id}", method = RequestMethod.DELETE)
	public Session delete(@PathVariable Long id) {
		Session existingSession = sessionRepository.findOne(id);
		sessionRepository.delete(existingSession);
		return existingSession;
	}
	
}
