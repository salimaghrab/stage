package com.csys.stage.Factory;

import com.csys.stage.DTO.DoctorDTO;
import com.csys.stage.domaine.Doctor;

public class DoctorFactory {
	DoctorDTO doctorDto = new DoctorDTO(); 
	Doctor doctor = new Doctor();
	public Doctor toEntity(DoctorDTO DoctorDto ) {
		
		//convert DTO into  entity 
        doctor.setId(doctorDto.getId());
        doctor.setName(doctorDto.getName()); 
        doctor.setPrixConslt(doctorDto.getPrixConslt());
     //   doctor.setDoctorspeciality(doctorDto.getDoctorspeciality());
        return doctor;
    }
	//Convert entity to DTO
	public DoctorDTO toDTO(Doctor doctor) {
		doctorDto.setId(doctor.getId());
		doctorDto.setName(doctor.getName());
		doctorDto.setPrixConslt(doctor.getPrixConslt());
	//	doctorDto.setDoctorspeciality(doctor.getDoctorspeciality());
		return doctorDto;
	}
	
}
