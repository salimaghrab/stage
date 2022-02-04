package com.csys.stage.domaine;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="patient")
	public class Patient implements Serializable {
	    public Patient(){}
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="id")
	        private Long id;
	    @Column(name="name")
	        private String fullName;
	    @Column(name="adress")
	        private String Adress;
	    @Column(name="sexe")
	        private String sexe;
	    @Column(name="pieceIdentite")
	        private Integer Num_pi;
	    @Column(name="date_arrivee")
	        private String date_arrivee;
	    
           @ManyToOne
    @JoinColumn(name="code_doctor", referencedColumnName = "id", nullable = true)
    private Doctor doctor;
	    
	    @Override
		  public String toString() {
		    return String.format(
		        "Patient[id=%d, Name='%s']",
		        id, fullName);
		  }
	    
	    
	    
	    public void setid(Long id)
	    {
	        this.id=id;
	    }
	    public Long getid(){
	        return this.id;
	    }
	    
	    public void setPatientFullName(String name)
	    {
	        this.fullName=name;
	    }
	    public String getFullName()
	    {
	        return this.fullName;
	    }
	    
	    public void setpatientadress(String adress)
	    {
	        this.Adress=adress;
	    }
	    public String getadress()
	    {
	        return this.Adress;
	    }
	    
	    public void setnumpi(Integer NumPi)
	    {
	        this.Num_pi=NumPi;
	    }
	    public Integer getnumpi()
	    {
	        return this.Num_pi;
	    }
	    
	    public void setdatearrivee(String date_arrivee)
	    {
	        this.date_arrivee=date_arrivee;
	    }
	    public String getdatearrivee()
	    {
	        return this.date_arrivee;
	    }
	    
	    public void setPatientSexe(String s)
	    {
	        this.sexe=s;
	    }
	    public String getPatientSexe()
	    {
	        return this.sexe;
	    }

	}

