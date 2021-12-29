package com.mapping.dbms.tables.relationshipmapping.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	private int id;
	private Date postdate;

	@ManyToOne
	private UserName userName;

	private String details;

}
