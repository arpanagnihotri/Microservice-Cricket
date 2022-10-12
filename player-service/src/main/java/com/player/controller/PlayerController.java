package com.player.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.player.entity.*;
import com.player.service.*;

@RestController
@RequestMapping("/player")
public class PlayerController {
	
	@Autowired
	private PlayerService ps;
	
	@GetMapping("/get")
	public List<Player> getAllPlayers(){
		return ps.getAllPlayers();
	}
	
	@PostMapping("/insert")
	public Player savePlayer(@RequestBody Player player) {
		return ps.savePlayer(player);
	}
	
	@GetMapping("/get/{tname}")
	public List<Player> getByTeam(@PathVariable String tname) {
		return ps.getPlayerWithTeam(tname);
	}
	
	@PutMapping("/{id}")
	public Player updatePlayer(@PathVariable("id") int p_id,@RequestBody Player player) {
		return ps.updatePlayer(p_id,player);
	}

}
