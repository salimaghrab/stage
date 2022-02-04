package com.csys.stage.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import com.csys.stage.domaine.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

	List<Doctor> findBySpeciality_Id( int codeSpeciality);

}
