package com.player.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.player.entity.Player;
import com.player.repository.PlayerRepository;


@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository pr;
	
	@Autowired
	private RestTemplate restTemplate;

	public List<Player> getAllPlayers() {
		return (List<Player>) pr.findAll();
		
	}

	public Player savePlayer(Player player) {
		return pr.save(player);
	}

	public Player updatePlayer(int p_id, Player player) {
		return pr.save(player);
	}

	public List<Player> getPlayerWithTeam(String tname) {
		Team team=restTemplate.getForObject("http://localhost:3001/team/"+tname,Team.class);
		return pr.findByTid(team.getTid());
	}

}
