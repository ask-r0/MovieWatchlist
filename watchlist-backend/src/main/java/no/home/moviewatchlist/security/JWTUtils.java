package no.home.moviewatchlist.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.stereotype.Component;


import static no.home.moviewatchlist.security.SecurityConstants.*;

@Component
public class JWTUtils {

    public String getUsernameOfToken(String token) {
        if (token != null) {
            // parse the token.
            String user = JWT.require(Algorithm.HMAC512(SECRET.getBytes()))
                    .build()
                    .verify(token.replace(TOKEN_PREFIX, ""))
                    .getSubject();

            if (user != null) {
                // new arraylist means authorities
                return user;
            }
            return null;
        }
        return null;
    }
}
