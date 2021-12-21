package com.tejoma.service;

import java.util.List;
import java.util.Optional;

import com.tejoma.model.Trainer;

public interface TrainerService {
	Trainer saveTrainer(Trainer entity);
	List<Trainer>showAllTrainers();
	Optional<Trainer>showTrainerByEmailId(String emailId);
}
