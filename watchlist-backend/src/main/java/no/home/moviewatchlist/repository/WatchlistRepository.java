package no.home.moviewatchlist.repository;

import no.home.moviewatchlist.model.Watchlist;

public interface WatchlistRepository {
    Watchlist findByCode(String watchlistCode);
    int save(Watchlist watchlist);
}
