package no.home.moviewatchlist.controller;

import no.home.moviewatchlist.model.Watchlist;
import no.home.moviewatchlist.service.WatchlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WatchlistController {
    @Autowired
    private WatchlistService service;

    @GetMapping("/api/watchlists/{watchlist_code}")
    public Watchlist getWatchlist(@PathVariable(value = "watchlist_code") String watchlistCode) {
        return service.getWatchlist(watchlistCode);
    }

    @PostMapping("/api/watchlists")
    public ResponseEntity<String> createWatchlist(@RequestBody Watchlist watchlist) {
        return service.createWatchlist(watchlist);
    }
}
