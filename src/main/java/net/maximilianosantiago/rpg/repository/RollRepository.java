package net.maximilianosantiago.rpg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.maximilianosantiago.rpg.model.Roll;

public interface RollRepository extends JpaRepository<Roll, Long>{
	
	@Query("SELECT r FROM Roll r WHERE r.sessionId = ?1")
    List<Roll> findBySessionId(Long sessionId);

}