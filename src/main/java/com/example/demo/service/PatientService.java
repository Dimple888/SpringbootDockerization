package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PatientDto;
import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientService {

	@Autowired
	private PatientRepository patientRepository;

	public List<Patient> getAllPatients() {

		return patientRepository.findAll();
	}

	public Patient savePatient(PatientDto patient) {

		Patient patientEntity = Patient.builder().name(patient.getName()).roomNo(patient.getRoomNo()).build();
		return patientRepository.save(patientEntity);
	}

}
