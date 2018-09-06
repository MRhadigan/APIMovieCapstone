package com.moviefavorites.MovieFavorites.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moviefavorites.MovieFavorites.entity.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer> {

	List<Movies> findByTitle(String title);
}
