package no.home.moviewatchlist.model;

import java.math.BigDecimal;

public class TMDBMovie {
    private Integer id;
    private String imdb_id;
    private String title;
    private String release_date;
    private Integer runtime;
    private Integer vote_count;
    private BigDecimal vote_average;
    private String poster_path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImdb_id() {
        return imdb_id;
    }

    public void setImdb_id(String imdb_id) {
        this.imdb_id = imdb_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public Integer getVote_count() {
        return vote_count;
    }

    public void setVote_count(Integer vote_count) {
        this.vote_count = vote_count;
    }

    public BigDecimal getVote_average() {
        return vote_average;
    }

    public void setVote_average(BigDecimal vote_average) {
        this.vote_average = vote_average;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    @Override
    public String toString() {
        return "TMDBMovie{" +
                "id=" + id +
                ", imdb_id='" + imdb_id + '\'' +
                ", title='" + title + '\'' +
                ", release_date='" + release_date + '\'' +
                ", runtime=" + runtime +
                ", vote_count=" + vote_count +
                ", vote_average=" + vote_average +
                ", poster_path='" + poster_path + '\'' +
                '}';
    }
}
