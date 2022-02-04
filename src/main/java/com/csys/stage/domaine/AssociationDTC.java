package com.csys.stage.domaine;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class AssociationDTC {
 @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToMany
  @JoinTable(name = "AssociationDTC",
             joinColumns = @JoinColumn(name = "doctor_id"),
             inverseJoinColumns = @JoinColumn(name = "typeContact_id"))
  private List<Doctor> typeContact = new ArrayList<>();
    
}
