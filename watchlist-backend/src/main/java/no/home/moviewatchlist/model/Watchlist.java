package no.home.moviewatchlist.model;

public class Watchlist {
    private String watchlistCode;
    private String watchlistName;
    private String password;

    public String getWatchlistCode() {
        return watchlistCode;
    }

    public void setWatchlistCode(String watchlistCode) {
        this.watchlistCode = watchlistCode;
    }

    public String getWatchlistName() {
        return watchlistName;
    }

    public void setWatchlistName(String watchlistName) {
        this.watchlistName = watchlistName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
