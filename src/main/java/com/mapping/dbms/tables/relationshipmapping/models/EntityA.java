package com.mapping.dbms.tables.relationshipmapping.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class EntityA {

	@Id	
	private int id;
	private String entityNameA;

	@OneToMany(cascade = CascadeType.ALL,   mappedBy = "entityA")
	private List<EntityB> entityBList;

}
