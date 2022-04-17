package no.home.moviewatchlist.repository;

import no.home.moviewatchlist.model.Movie;
import no.home.moviewatchlist.model.Watchlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WatchlistRepositoryJdbc implements WatchlistRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Watchlist findByCode(String watchlistCode) {
        String query = "SELECT * FROM watchlist WHERE watchlist_code=?";

        try {
            return jdbcTemplate.queryForObject(
                    query,
                    BeanPropertyRowMapper.newInstance(Watchlist.class),
                    watchlistCode
            );
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public Movie findMovieById(String watchlistCode, Integer movieId) {
        String query = "SELECT * FROM movie_watchlist WHERE (watchlist_code=? AND movie_id=?)";

        try {
            return jdbcTemplate.queryForObject(
                    query,
                    BeanPropertyRowMapper.newInstance(Movie.class),
                    watchlistCode,
                    movieId
            );
        } catch (IncorrectResultSizeDataAccessException e) {
            return null;
        }
    }

    @Override
    public int save(Watchlist watchlist) {
        String query = "INSERT INTO watchlist(watchlist_code, watchlist_name, password)" +
                "VALUES (?,?,?)";
        return jdbcTemplate.update(
                query,
                watchlist.getWatchlistCode(),
                watchlist.getWatchlistName()
                , watchlist.getPassword()
        );
    }

    @Override
    public int save(String watchlistCode, Integer movieId) {
        String query = "INSERT INTO movie_watchlist(watchlist_code, movie_id)" +
                "VALUES (?,?)";
        return jdbcTemplate.update(
                query,
                watchlistCode,
                movieId
        );
    }
}
