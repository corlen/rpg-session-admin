package net.maximilianosantiago.rpg.utils;

import java.security.SecureRandom;

public class Utils {
	
	public static Integer rollDice(Integer face) {
		SecureRandom sr = new SecureRandom();
		return sr.nextInt(face)+1;
	}
	
	
	
}
