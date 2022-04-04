package com.revature.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;



@Data
@Document(collection="user")
public class User {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String passwordString;

}
