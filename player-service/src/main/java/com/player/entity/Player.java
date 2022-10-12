package com.player.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int p_id;
	private String p_name;
	private int age;
	private String p_type;
	private long biddingAmount;
	
	private int tid;
	public Player() {
		super();
	}
	
	public Player(int p_id, String p_name, int age, String p_type, long biddingAmount, int tid) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.age = age;
		this.p_type = p_type;
		this.biddingAmount = biddingAmount;
		this.tid = tid;
	}

	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public long getBiddingAmount() {
		return biddingAmount;
	}
	public void setBiddingAmount(long biddingAmount) {
		this.biddingAmount = biddingAmount;
	}
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Player [p_id=" + p_id + ", p_name=" + p_name + ", age=" + age + ", p_type=" + p_type
				+ ", biddingAmount=" + biddingAmount + ", tid=" + tid + "]";
	}

	
	
	
	
}
