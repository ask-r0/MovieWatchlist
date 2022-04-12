CREATE TABLE watchlist (
    watchlist_code VARCHAR(64) NOT NULL,
    watchlist_name VARCHAR(32) NOT NULL,
    password VARCHAR(64) NOT NULL,
    PRIMARY KEY (watchlist_code)
);

CREATE TABLE movie (
    movie_id INT NOT NULL,
    PRIMARY KEY (movie_id)
);

INSERT INTO watchlist(watchlist_code, watchlist_name, password) VALUES
("nicestwatchlist", "my watchlist", "$2a$12$XFfTaj9FMomnlfkD1DkMXuJvgaNcqUIQKRDmOv2qd/Flci5ZH96ZO");
/* unencrypted password: "" */