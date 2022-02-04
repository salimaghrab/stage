package com.csys.stage.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import com.csys.stage.domaine.Doctor;
import java.util.List;


@Entity
@Table(name="typede_contact")
public class TypeContact implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="typeContacte_id")
        private Long id;
    @Column(name="typeContacte_designation")
    private String Designation;
    public TypeContact()
    {
	super();
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}
}