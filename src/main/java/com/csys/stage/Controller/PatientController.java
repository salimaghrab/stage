package com.csys.stage.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csys.stage.Service.PatientService;
import com.csys.stage.domaine.Doctor;
import com.csys.stage.domaine.Patient;
@RestController
	@RequestMapping("/api")
public class PatientController {
		@Autowired
		private PatientService patientService;
		@GetMapping("/patient")
		public List<Patient> allPatient(){
			return patientService.getAll();
		}
//add new  patient 
	@RequestMapping(value="/patient",method=RequestMethod.POST)
	public void  AddPatient( @RequestBody Patient patient){
		patientService.addpatient(patient);
	}
	//DELETE
	@RequestMapping(value = "/patient/{id}", method = RequestMethod.DELETE)
	 public void deletepatient(@PathVariable Long id) {
	     patientService.deletepatient(id);
	 }
	//find by doctor
	@RequestMapping(value="/patient/{doctor}" ,method= RequestMethod.GET)
	public List<Patient> findBydoctor(Doctor doctor){
		return patientService.findByDoctor(doctor);
	}
}
