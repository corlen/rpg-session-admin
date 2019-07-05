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

import net.maximilianosantiago.rpg.controller.SessionController;
import net.maximilianosantiago.rpg.model.Session;
import net.maximilianosantiago.rpg.repository.SessionRepository;

public class SessionControllerTest {

	@InjectMocks
	private SessionController sc;
	
	@Mock
	private SessionRepository sessionRepository;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testSessionGet() {
		Session s = new Session();
		s.setId(1l);
		when(sessionRepository.findOne(1l)).thenReturn(s);
		
		Session session = sc.get(1l);
		
		verify(sessionRepository).findOne(1l);
		
		assertThat(session.getId(), is(1l));
		
	}
	
}
