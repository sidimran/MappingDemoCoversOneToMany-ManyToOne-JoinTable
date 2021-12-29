package com.mapping.dbms.tables.relationshipmapping.models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class UserName {

	@Id
	private int id;

	private String firstName;
	private String lastName;

	@ManyToOne
	private Location newlocation;

	@OneToMany(mappedBy = "userName")
	private List<Location> location;

	private String email;

	@OneToMany(mappedBy = "userName")
	private Set<Post> post;
}
