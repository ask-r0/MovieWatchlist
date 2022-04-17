package no.home.moviewatchlist.service;

import no.home.moviewatchlist.model.Movie;
import no.home.moviewatchlist.model.Watchlist;
import no.home.moviewatchlist.repository.WatchlistRepositoryJdbc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WatchlistService {
    @Autowired
    WatchlistRepositoryJdbc repository;

    public ResponseEntity<String> createWatchlist(Watchlist watchlist) {
        Watchlist w = repository.findByCode(watchlist.getWatchlistCode());
        if (w != null) return new ResponseEntity<>("Watchlist already exists", HttpStatus.BAD_REQUEST);
        try {
            repository.save(watchlist);
            return new ResponseEntity<>("Watchlist saved", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error occurred when saving watchlist", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<String> addMovieToWatchlist(String watchlistCode, Movie movie) {
        Movie m = repository.findMovieById(watchlistCode, movie.getId());
        if (m != null) return new ResponseEntity<>("Movie already in watchlist", HttpStatus.BAD_REQUEST);
        try {
            repository.save(watchlistCode, movie.getId());
            return new ResponseEntity<>("Movie saved in watchlist", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error occurred when saving movie in watchlist",
                    HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public Watchlist getWatchlist(String watchlistCode) {
        Watchlist watchlist = repository.findByCode(watchlistCode);
        watchlist.setPassword(null);
        return watchlist;
    }


}
