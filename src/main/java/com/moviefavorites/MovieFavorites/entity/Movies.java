package com.moviefavorites.MovieFavorites.entity;

import java.util.ArrayList;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
//@Table(name="favorites")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movies {

	@JsonProperty("id")
	private Integer favoriteid;
	@JsonProperty("title")
	private String title;
	@JsonProperty("genres")
	private ArrayList<Genres> genres;
	//private Genres genres;
	@JsonProperty("release_date")
	private String release_date;
	@JsonProperty("overview")
	private String overview;
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public Integer getFavoriteid() {
		return favoriteid;
	}

	public void setFavoriteid(Integer favoriteid) {
		this.favoriteid = favoriteid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Genres> getGenres() {
		return genres;
	}

	public void setGenres(ArrayList<Genres> genres) {
		this.genres = genres;
	}
//	public Genres getGenres() {
//		return genres;
//	}
//
//	public void setGenres(Genres genres) {
//		this.genres = genres;
//	}

	public String getRelease_date() {
		return release_date;
	}

	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	@Override
	public String toString() {
		return "favoriteid=" + favoriteid + ", title=" + title + ", genres=" + genres + ", release_date="
				+ release_date+ " " + overview;
	}

	

}
