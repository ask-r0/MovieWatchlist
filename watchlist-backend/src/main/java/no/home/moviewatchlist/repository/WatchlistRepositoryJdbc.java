package no.home.moviewatchlist.repository;

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
}
