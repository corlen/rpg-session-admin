package net.maximilianosantiago.rpg;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import net.maximilianosantiago.rpg.controller.RollController;
import net.maximilianosantiago.rpg.model.Roll;
import net.maximilianosantiago.rpg.repository.RollRepository;

public class RollControllerTest {

	@InjectMocks
	private RollController rc;
	
	@Mock
	private RollRepository rollRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testRollList() {
		Roll r1 = new Roll();
		r1.setId(1l);
		Roll r2 = new Roll();
		r2.setId(2l);
		List<Roll> rollList = new ArrayList<Roll>();
		rollList.add(r1);
		rollList.add(r2);
		when(rollRepository.findAll()).thenReturn(rollList);
		
		List<Roll> rolls = rc.list();
		
		verify(rollRepository).findAll();
		
		assertThat(rolls.size(), is(2));
		
	}
	
}
