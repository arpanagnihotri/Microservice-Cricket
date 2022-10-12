package com.player.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.player.service.*;
import com.player.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player,Integer> {


	public List<Player> findByTid(int tid);
	



}
