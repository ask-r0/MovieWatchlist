package no.home.moviewatchlist.repository;

import no.home.moviewatchlist.model.Movie;
import no.home.moviewatchlist.model.Watchlist;

public interface WatchlistRepository {
    Watchlist findByCode(String watchlistCode);
    Movie findMovieById(String watchlistCode, Integer movieId);
    int save(Watchlist watchlist);
    int save(String watchlistCode, Integer movieId);
}
