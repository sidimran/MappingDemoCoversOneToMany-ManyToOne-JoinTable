package com.mapping.dbms.tables.relationshipmapping.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {

	@Id
	private int id;
	private String name;

	@ManyToMany(mappedBy = "employee")
	private List<Project> project;

}
