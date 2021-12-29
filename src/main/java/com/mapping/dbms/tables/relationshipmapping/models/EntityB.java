package com.mapping.dbms.tables.relationshipmapping.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class EntityB {

	@Id
	private int id;
	private String entityNameB;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinTable(name = "Join_Btable_Atable",

			joinColumns = @JoinColumn(name = "entityB", referencedColumnName = "id", nullable = true), inverseJoinColumns = @JoinColumn(name = "entityA", referencedColumnName = "id", nullable = true))
	private EntityA entityA;

}
