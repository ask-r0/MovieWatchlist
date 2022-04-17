package no.home.moviewatchlist.controller;

import no.home.moviewatchlist.model.SimpleTMDBMovie;
import no.home.moviewatchlist.model.TMDBMovie;
import no.home.moviewatchlist.service.TMDBMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TMDBMovieController {
    @Autowired
    TMDBMovieService service;

    @GetMapping("/api/tmdb/movie/{movie_id}")
    public TMDBMovie getTMDBMovie(@PathVariable(value = "movie_id") String movieId) {
        return service.getTMDBMovie(movieId);
    }

    @GetMapping("/api/tmdb/search/movie")
    public List<SimpleTMDBMovie> searchTMDBMovies(@RequestParam String query) {
        return service.searchTMDBMovies(query);
    }
}
