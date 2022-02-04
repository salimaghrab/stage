package com.csys.stage.DTO;

import java.util.ArrayList;
import java.util.List;

import com.csys.stage.domaine.Doctor;
//import com.csys.stage.domaine.Patient;
//import com.csys.stage.domaine.Speciality;
import java.math.BigDecimal;

public class DoctorDTO {
	private Long id;
	private String name;
	private BigDecimal prixConslt;
	private SpecialityDTO speciality;
	
	public DoctorDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrixConslt() {
		return prixConslt;
	}
	public void setPrixConslt(BigDecimal prixConslt) {
		this.prixConslt = prixConslt;
	}
	public SpecialityDTO getSpeciality() {
		return speciality;
	}
	public void setSpeciality(SpecialityDTO speciality) {
		this.speciality = speciality;
	}

	
	
	public DoctorDTO(Doctor doctor) {
        this.id = doctor.getId();
        this.name = doctor.getName();
        this.prixConslt = doctor.getPrixConslt();
    }

}
