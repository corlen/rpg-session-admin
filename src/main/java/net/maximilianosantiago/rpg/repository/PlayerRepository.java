package net.maximilianosantiago.rpg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.maximilianosantiago.rpg.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Long>{

}