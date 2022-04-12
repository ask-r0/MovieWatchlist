package no.home.moviewatchlist.repository;

import no.home.moviewatchlist.model.Watchlist;

public interface LoginRepository {
    Watchlist findByWatchlistCode(String watchlistCode);
}
