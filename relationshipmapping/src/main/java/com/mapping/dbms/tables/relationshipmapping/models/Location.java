package com.mapping.dbms.tables.relationshipmapping.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Location {

	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "newlocation" )
	private Set<UserName> newuserName;
	
	@ManyToOne
	private UserName userName;
}
