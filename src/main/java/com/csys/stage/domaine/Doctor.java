package com.csys.stage.domaine;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.csys.stage.domaine.Speciality;
import javax.persistence.ManyToMany;
import com.csys.stage.domaine.TypeContact;

@Entity
@Table(name = "doctor")
public class Doctor implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name="prix_consultaion")
    private BigDecimal prix_conlt;
	
	@OneToMany( mappedBy="doctor" ,fetch=FetchType.EAGER ,orphanRemoval=true)
    private List<Patient> doctorPatient= new ArrayList();

@ManyToOne
    @JoinColumn(name="code_speciality", referencedColumnName = "id", nullable = true)
    private Speciality speciality;  
	
	  @Override
	  public String toString() {
	    return String.format(
	        "Medecin[id=%d, Name='%s']",
	        id, name);
	  }
	public Doctor() {
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
		return prix_conlt;
	}
	public void setPrixConslt(BigDecimal price) {
		this.prix_conlt= price;
	}
	public void setSpeciality(Speciality speciality) {
		this.speciality=speciality;
	}
	public Speciality getSpeciality() {
		return this.speciality;
	}
}