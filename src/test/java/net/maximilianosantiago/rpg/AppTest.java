package net.maximilianosantiago.rpg;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import net.maximilianosantiago.rpg.controller.HomeController;

public class AppTest {
	
	@Test
	public void testApp() {
		HomeController hc = new HomeController();
		String result = hc.index();
		assertEquals(result, "index.html");
    }
}