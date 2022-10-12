package com.team.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team.entity.*;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer>  {

	public Team findByTname(String tname);


}
