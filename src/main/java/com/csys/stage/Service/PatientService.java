package com.csys.stage.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csys.stage.Repository.PatientRepository;
import com.csys.stage.domaine.Doctor;
import com.csys.stage.domaine.Patient;


@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getAll(){
		
		return patientRepository.findAll();
	}

	public void addpatient(Patient patient) {
		patientRepository.save(patient);
	}
	public void deletepatient(Long id) {
		patientRepository.deleteById(id);
	}
	public List<Patient> findByDoctor(Doctor doctor){
		return patientRepository.findByDoctor(doctor);
	}
}