package net.maximilianosantiago.rpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.maximilianosantiago.rpg.model.Roll;

public interface RollRepository extends JpaRepository<Roll, Long>{

}