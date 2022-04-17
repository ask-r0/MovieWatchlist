CREATE TABLE watchlist (
    watchlist_code VARCHAR(64) NOT NULL,
    watchlist_name VARCHAR(32) NOT NULL,
    password VARCHAR(64) NOT NULL,
    PRIMARY KEY (watchlist_code)
);

CREATE TABLE movie_watchlist (
    watchlist_code VARCHAR(64) NOT NULL,
    movie_id INT NOT NULL,
    PRIMARY KEY (watchlist_code, movie_id)
);