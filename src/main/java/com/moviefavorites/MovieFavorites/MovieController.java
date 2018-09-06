package com.moviefavorites.MovieFavorites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.moviefavorites.MovieFavorites.entity.Movies;
import com.moviefavorites.MovieFavorites.repo.MovieRepository;

@Controller
public class MovieController {
	
	@Autowired
	MovieRepository mrepo;

	@RequestMapping("/")
	public ModelAndView index() {
		
		RestTemplate restTemplate = new RestTemplate();
		Movies movies = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + 558 + "?api_key=b3d430ee3bc4a8a11df0cfeaa1ff2d77", Movies.class);
		return new ModelAndView("index", "movielist", movies);
	}
	
	@RequestMapping("/results")
	public ModelAndView searchResults(@RequestParam("movie") String movie) {
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Movies> movies = restTemplate.getForEntity("https://api.themoviedb.org/3/search/movie?include_adult=false&page=1&language=en-US&api_key=%3C%3Capi_key%3E%3E", Movies.class);
		return new ModelAndView("/results", "movie", mrepo.findByTitle(movie));
	}
}
