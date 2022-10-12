package com.team.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tid;
	private String tname;
	private Long budget;
	

	public Team() {
		super();
	}

	public Team(int tid, String tname, Long budget) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.budget = budget;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Long getBudget() {
		return budget;
	}

	public void setBudget(Long budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Team [tid=" + tid + ", tname=" + tname + ", budget=" + budget + "]";
	}

}
