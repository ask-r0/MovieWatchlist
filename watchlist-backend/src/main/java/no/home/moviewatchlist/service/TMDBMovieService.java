package no.home.moviewatchlist.service;

import no.home.moviewatchlist.model.SimpleTMDBMovie;
import no.home.moviewatchlist.model.TMDBMovie;
import no.home.moviewatchlist.model.TMDBSearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TMDBMovieService {
    @Autowired
    private RestTemplate restTemplate;

    private static String API_KEY = ""; // Input API KEY for TMDB

    public TMDBMovie getTMDBMovie(String movieId) {
        String url = "https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" + API_KEY;
        return restTemplate.getForObject(url, TMDBMovie.class);
    }

    public List<SimpleTMDBMovie> searchTMDBMovies(String query) {
        String url = "https://api.themoviedb.org/3/search/movie?api_key=" + API_KEY + "&query=" + query;

        TMDBSearchResult searchResult = restTemplate.getForObject(url, TMDBSearchResult.class);
        return searchResult.getResults();
    }
}
