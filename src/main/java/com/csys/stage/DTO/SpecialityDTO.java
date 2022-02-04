package com.csys.stage.DTO;

public class SpecialityDTO {
	private Long id;
	private String design;
	private DoctorDTO doctorDto;
	
	public SpecialityDTO() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public DoctorDTO getDoctorDto() {
		return doctorDto;
	}
	public void setDoctorDto(DoctorDTO doctorDto) {
		this.doctorDto = doctorDto;
	}
}
