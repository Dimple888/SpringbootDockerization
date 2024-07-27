package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PatientDto;
import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/docker")
public class DockerController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/fetch")
	public String testDocker() {

		return "I am up and Running";
	}

	@GetMapping("/fetch/patients")
	public List<Patient> getAllPatients() {

		return patientService.getAllPatients();

	}

	@PostMapping("/savePatient")
	public Patient savePatient(@RequestBody PatientDto patient) {

		return patientService.savePatient(patient);
	}

}
