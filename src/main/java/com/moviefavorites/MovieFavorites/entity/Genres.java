package com.moviefavorites.MovieFavorites.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Genres {

	//private String id;
	private String name;
	
	
	public Genres() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Genres [name=" + name + "]";
	}



	
	

}
