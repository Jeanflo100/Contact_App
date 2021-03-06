package jeanflo.contact_app.model;

import jeanflo.contact_app.service.PersonService;

public class User{
	
	private String username;
	private String password;
	private String pathFolderContact;
	public PersonService personServiceInstance;
	
	public User(String username, String password, PersonService personServiceInstance) {
		this.username = username;
		this.password = password;
		this.pathFolderContact = "user.home";
		this.personServiceInstance = personServiceInstance;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setPathFolderContact(String pathFolderContact) {
		this.pathFolderContact = pathFolderContact;
	}
	
	public void setPersonServiceInstance (PersonService personServiceInstance) {
		this.personServiceInstance = personServiceInstance;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getPathFolderContact() {
		return pathFolderContact;
	}
	
	public PersonService getPersonServiceInstance () {
		return personServiceInstance;
	}
	
	public boolean equals(User user) {
		return (this.username.equals(user.username) && this.password.equals(user.password));
	}
	
}