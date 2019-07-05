package net.maximilianosantiago.rpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.maximilianosantiago.rpg.model.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{

}