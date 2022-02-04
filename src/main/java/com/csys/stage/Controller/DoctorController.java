package com.csys.stage.Controller;

import java.util.List;

import com.csys.stage.DTO.DoctorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.csys.stage.Service.DoctorService;
import com.csys.stage.domaine.Doctor;
import com.csys.stage.domaine.Speciality;

@RestController
	@RequestMapping("/api")
public class DoctorController {
		@Autowired
		private DoctorService doctorService;
		@GetMapping("/doctor")
		public List<Doctor> allDoctor(){
			return doctorService.getAll();
		}
//add new  doctor 
	@RequestMapping(value="/doctor",method=RequestMethod.POST)
	public void  AddDoctor( @RequestBody Doctor doctor){
		doctorService.addDoctor(doctor);
	}
	//DELETE
	@RequestMapping(value = "/doctor/{id}", method = RequestMethod.DELETE)
	 public void deletedoctor(@PathVariable Long id) {
	     doctorService.deletedoctor(id);
	 }
//Update 
@RequestMapping(value = "/doctor/{id}", method = RequestMethod.PUT)
public Doctor  updateDoctor(@PathVariable long id, @RequestBody DoctorDTO doctorDTO){
return doctorService.updateDoctor(id, doctorDTO);
}
//         //find By speciality
//        @RequestMapping("/doctor/{code_speciality}")
//         public List<Doctor> findBySpeciality(Speciality doctorspeciality){
//		return doctorService.findBySpeciality(doctorspeciality);
//	}
}

