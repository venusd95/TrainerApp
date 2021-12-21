package com.tejoma.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tejoma.model.Trainer;
import com.tejoma.service.TrainerService;

@RestController
@RequestMapping("/api/trainer/")
@CrossOrigin(origins="*")
public class TrainerController {
	@Autowired
	private TrainerService service;
	@PostMapping("/signup")
public String registerTrainer(@RequestBody Trainer trainer)
{
Trainer trainerOb=service.saveTrainer(trainer);
return trainerOb.getName()+" Ur Registration is completed";
}
	@GetMapping("/all")
	public List<Trainer>displayAllTrainers()
	{
		return service.showAllTrainers();
		
	}
	@GetMapping("/findbyemail/{email}")
	public Optional<Trainer> displayTrainerByEmail(@PathVariable String email)
	{
		return service.showTrainerByEmailId(email);
		
	}
}
