package net.maximilianosantiago.rpg;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import net.maximilianosantiago.rpg.controller.PlayerController;
import net.maximilianosantiago.rpg.model.Player;
import net.maximilianosantiago.rpg.repository.PlayerRepository;

public class PlayerControllerTest {

	@InjectMocks
	private PlayerController pc;
	
	@Mock
	private PlayerRepository playerRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testPlayerGet() {
		Player p = new Player();
		p.setId(1l);
		when(playerRepository.findOne(1l)).thenReturn(p);
		
		Player player = pc.get(1l);
		
		verify(playerRepository).findOne(1l);
		
		assertThat(player.getId(), is(1l));
		
	}
	
}
