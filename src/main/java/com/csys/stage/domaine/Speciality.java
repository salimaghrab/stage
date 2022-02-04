package com.csys.stage.domaine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.FetchType;
import com.csys.stage.domaine.Doctor;


@Entity
@Table(name="doctors_speciality")
public class Speciality implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    @Column(name="designation")
    private  String Design;
    
	public  Speciality()
	{
	super();
	}

	@OneToMany( mappedBy="speciality" ,fetch=FetchType.EAGER ,orphanRemoval=true)
    private List<Doctor> doctorSpeciality= new ArrayList();
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void setdesignation(String des){
        this.Design=des;
    }
    public String getDesignation(){
        return this.Design;
    }

}