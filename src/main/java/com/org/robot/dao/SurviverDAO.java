package com.org.robot.dao;

import java.util.List;
import java.util.Optional;

import com.org.robot.model.Surviver;


public interface SurviverDAO {

	public Surviver saveSurviver(Surviver surviver);
	
	public Surviver updateSurviver(Surviver surviver);
	
	public Optional<Surviver> findById(Long id) throws Exception;
	
	public List<Surviver> findAllSurviver();
}
