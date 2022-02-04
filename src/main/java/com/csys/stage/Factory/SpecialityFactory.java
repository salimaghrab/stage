package com.csys.stage.Factory;

import com.csys.stage.DTO.SpecialityDTO;
import com.csys.stage.domaine.Speciality;

public class SpecialityFactory {
	SpecialityDTO specialityDto = new SpecialityDTO(); 
	Speciality speciality = new Speciality();
	public Speciality toEntity(SpecialityDTO SpecialityDto ) {
		
		//convert DTO into  entity 
		speciality.setdesignation(SpecialityDto.getDesign());
		speciality.setId(SpecialityDto.getId()); 
        return speciality;
    }
	//Convert entity to DTO
	public SpecialityDTO toDTO(Speciality speciality) {
		specialityDto.setId(speciality.getId());
		specialityDto.setDesign(speciality.getDesignation());
		return specialityDto;
	}
}
