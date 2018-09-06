package com.moviefavorites.MovieFavorites.entity;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name="user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {

	@JsonProperty("userid")
	private Integer userid;
	@JsonProperty("name")
	private String name;
	@JsonProperty("email")
	private String email;
	
	

	public Users() {
	
	}



	public Users(Integer userid, String name, String email) {
		this.userid = userid;
		this.name = name;
		this.email = email;
	}



	public Integer getUserid() {
		return userid;
	}



	public void setUserid(Integer userid) {
		this.userid = userid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "userid=" + userid + ", name=" + name + ", email=" + email;
	}
	
	
	
	
	
}
