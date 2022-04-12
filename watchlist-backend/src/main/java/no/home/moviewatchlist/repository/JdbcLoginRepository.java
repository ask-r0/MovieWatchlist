package no.home.moviewatchlist.repository;

import no.home.moviewatchlist.model.Watchlist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcLoginRepository implements LoginRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Watchlist findByWatchlistCode(String watchlistCode) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM watchlist WHERE watchlist_code=?",
                    BeanPropertyRowMapper.newInstance(Watchlist.class), watchlistCode);
        } catch (IncorrectResultSizeDataAccessException e){
            return null;
        }
    }
}
