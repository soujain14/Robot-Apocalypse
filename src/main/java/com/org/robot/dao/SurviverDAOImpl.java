package com.org.robot.dao;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.org.robot.model.Surviver;
import com.org.robot.repository.SurviverRepository;

@Repository
public class SurviverDAOImpl implements SurviverDAO {

	@Autowired
	private SurviverRepository surviverRepository;
	
	public Surviver saveSurviver(Surviver surviver){
		Set<String> resources = new HashSet<>();
		resources.addAll(surviver.getResources());
		return surviverRepository.save(new Surviver(surviver.getName(), surviver.getAge(),
				surviver.getGender(), surviver.getLocation(), resources, false));
	}
	
	public Surviver updateSurviver(Surviver surviver){
		return surviverRepository.save(surviver);
	}

	@Override
	public Optional<Surviver> findById(Long id) throws Exception {
		return surviverRepository.findById(id);
	}

	@Override
	public List<Surviver> findAllSurviver() {
		return surviverRepository.findAll();
	}
}
