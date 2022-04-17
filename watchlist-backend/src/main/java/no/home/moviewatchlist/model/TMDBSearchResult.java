package no.home.moviewatchlist.model;

import java.util.List;

public class TMDBSearchResult {
    List<SimpleTMDBMovie> results;

    public List<SimpleTMDBMovie> getResults() {
        return results;
    }

    public void setResults(List<SimpleTMDBMovie> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < results.size(); i++) {
            ret += results.get(i).toString();
        }
        return ret;
    }
}
