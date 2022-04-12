package no.home.moviewatchlist.service;

import no.home.moviewatchlist.model.SecurityUser;
import no.home.moviewatchlist.model.Watchlist;
import no.home.moviewatchlist.repository.JdbcLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements UserDetailsService {
    @Autowired
    private JdbcLoginRepository repository;

    @Override
    public UserDetails loadUserByUsername(String watchlistCode) throws UsernameNotFoundException {
        Watchlist watchlist = repository.findByWatchlistCode(watchlistCode);
        if (watchlist == null) throw new UsernameNotFoundException(watchlistCode + " not found!");
        return new SecurityUser(
                watchlist.getWatchlistCode(),
                watchlist.getPassword(),
                null,
                true,
                true,
                true,
                true);
    }
}
