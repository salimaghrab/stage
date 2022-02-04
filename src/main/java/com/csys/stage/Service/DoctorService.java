package com.csys.stage.Service;

import java.util.List;

import com.csys.stage.DTO.DoctorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.csys.stage.Repository.DoctorRepository;
import com.csys.stage.domaine.Doctor;
import com.csys.stage.domaine.Speciality;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	//LIST OF DOCTORS
	public List<Doctor> getAll(){
		
		return doctorRepository.findAll();
	}
	public Doctor getDoctorById(Long id)   
	{  
	return doctorRepository.findById(id).get();  
	}
	//ADD
	public void addDoctor(Doctor doctor) {
		doctorRepository.save(doctor);
	}
//DELETE
public void deletedoctor(Long id) {
		doctorRepository.deleteById(id);
	}
	
	//UPDATE
		
	public Doctor  updateDoctor(long id, DoctorDTO doctorDTO) {
		Doctor doctor = doctorRepository.findById(id).get();
		
		doctor.setName(doctorDTO.getName());
		//doctor.setId(doctor.getId());
                doctor.setPrixConslt(doctorDTO.getPrixConslt());

				Speciality specite =
                //doctor.setSpeciality(doctorDTO.getSpeciality());
		return doctor;
	}
//       //Find By Speciality 
//        public List<Doctor> findBySpeciality(Speciality doctorspeciality){
//            return doctorRepository.findBySpeciality(doctorspeciality);             
//}
}
