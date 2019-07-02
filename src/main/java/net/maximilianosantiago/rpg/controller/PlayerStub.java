package net.maximilianosantiago.rpg.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.maximilianosantiago.rpg.model.Player;

public class PlayerStub {
	private static Map<Long, Player> players = new HashMap<Long, Player>();
	private static Long idIndex = 5L;

	//populate initial wrecks
	static {
		Player a = new Player(1L, "Max");
		players.put(1L, a);
		Player b = new Player(2L, "Bergson");
		players.put(2L, b);
		Player c = new Player(3L, "Bahia");
		players.put(3L, c);
		Player d = new Player(4L, "Pedro");
		players.put(4L, d);
		Player e = new Player(5L, "Janio");
		players.put(5L, e);
	}

	public static List<Player> list() {
		return new ArrayList<Player>(players.values());
	}

	public static Player create(Player player) {
		idIndex += idIndex;
		player.setId(idIndex);
		players.put(idIndex, player);
		return player;
	}

	public static Player get(Long id) {
		return players.get(id);
	}

	public static Player update(Long id, Player player) {
		players.put(id, player);
		return player;
	}

	public static Player delete(Long id) {
		return players.remove(id);
	}
}
