package com.csys.stage.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csys.stage.domaine.Doctor;
import com.csys.stage.domaine.Patient;

public interface PatientRepository extends JpaRepository<Patient , Long> {
	List<Patient> findByDoctor(Doctor doctor);
}
