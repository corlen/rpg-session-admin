package net.maximilianosantiago.rpg.utils;

import java.security.SecureRandom;

public class Utils {
	
	public static Integer rollDice(Integer face) {
		Integer result = 0;
		SecureRandom randomRolls = new SecureRandom();
		result += randomRolls.nextInt(face)+1;
		result += randomRolls.nextInt(face)+1;
		result += randomRolls.nextInt(face)+1;
		result += randomRolls.nextInt(face)+1;
		return result/4;
	}
	
}
