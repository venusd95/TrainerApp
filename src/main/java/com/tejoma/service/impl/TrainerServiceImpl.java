package com.tejoma.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tejoma.model.Trainer;
import com.tejoma.repo.TrainerRepo;
import com.tejoma.service.TrainerService;
@Service

public class TrainerServiceImpl implements TrainerService {
    
	@Autowired
	private TrainerRepo trainerRepo;
	@Override
	@Transactional
	public Trainer saveTrainer(Trainer entity) {
		// TODO Auto-generated method stub
		return trainerRepo.save(entity);
	}

	@Override
	public List<Trainer> showAllTrainers() {
		// TODO Auto-generated method stub
		return trainerRepo.findAll();
	}

	@Override
	public Optional<Trainer> showTrainerByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return trainerRepo.findByEmail(emailId);
	}

}
