package net.maximilianosantiago.rpg.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.maximilianosantiago.rpg.model.Session;

public class SessionStub {
	private static Map<Long, Session> sessions = new HashMap<Long, Session>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	static {
		Session a = new Session(1L, "Sessao de Star Wars", new Date(1530400094262L));
		sessions.put(1L, a);
		Session b = new Session(2L, "Sessao de GoT", new Date(1496300066262L));
		sessions.put(2L, b);
		Session c = new Session(3L, "Sessao de Legends", new Date(1483319860002L));
		sessions.put(3L, c);
	}

	public static List<Session> list() {
		return new ArrayList<Session>(sessions.values());
	}

	public static Session create(Session session) {
		idIndex += idIndex;
		session.setId(idIndex);
		sessions.put(idIndex, session);
		return session;
	}

	public static Session get(Long id) {
		return sessions.get(id);
	}

	public static Session update(Long id, Session session) {
		sessions.put(id, session);
		return session;
	}

	public static Session delete(Long id) {
		return sessions.remove(id);
	}
}
