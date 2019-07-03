package net.maximilianosantiago.rpg.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.maximilianosantiago.rpg.model.Roll;
import net.maximilianosantiago.rpg.service.RollService;

public class RollStub {
	private static Map<Long, Roll> rolls = new HashMap<Long, Roll>();
	private static Long idIndex = 5L;

	//populate initial wrecks
	static {
		Roll a = new Roll(1L, 4, 3, 0, 1L, 1L, 6, 1562913213586L);
		rolls.put(1L, a);
		Roll b = new Roll(2L, 8, 2, 0, 2L, 1L, 12, 1562183213586L);
		rolls.put(2L, b);
		Roll c = new Roll(3L, 20, 1, 0, 3L, 1L, 16, 1562116213586L);
		rolls.put(3L, c);
		Roll d = new Roll(4L, 6, 4, 0, 4L, 1L, 18, 1562113214586L);
		rolls.put(4L, d);
	}

	public static List<Roll> list() {
		return new ArrayList<Roll>(rolls.values());
	}

	public static Roll create(Roll roll) {
		idIndex += idIndex;
		roll.setId(idIndex);
		roll.setSum(RollService.rollDice());
		roll.setDateRolled(System.currentTimeMillis());
		rolls.put(idIndex, roll);
		return roll;
	}


}
