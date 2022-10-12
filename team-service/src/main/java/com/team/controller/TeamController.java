package com.team.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team.entity.Team;
import com.team.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@Autowired
	private TeamService ts;
	
	@PostMapping("/insert")
	public Team saveTeam(@RequestBody Team team) {
		return ts.saveTeam(team);
	}
	
	@GetMapping("/{tname}")
	public Team getAllTeams(@PathVariable String tname) {
		return ts.findTeamByName(tname);
	}
	
	@GetMapping("/")
	public List<Team> getAllTeams(){
		return ts.getAllTeams();
	}
}
