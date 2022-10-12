package com.team.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team.entity.Team;
import com.team.repository.TeamRepository;


@Service
public class TeamService {

	@Autowired
	private TeamRepository tr;

	public List<Team> getAllTeams() {
		return tr.findAll();
	}

	public Team findTeamByName(String tname) {
		return tr.findByTname(tname);
	}

	public Team saveTeam(Team team) {
		return tr.save(team);
	}

}
