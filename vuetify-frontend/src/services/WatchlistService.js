import axios from "axios";

const apiClient = axios.create({
  baseURL: "http://localhost:8090",
  headers: {
    Authorization: "",
  },
});

export default {
  enterWatchlist(watchlistCode, password) {
    return apiClient.post("/login", {
      username: watchlistCode,
      password: password,
    });
  },
  getWatchlist(watchlistCode) {
    return apiClient.get("/api/watchlists/" + watchlistCode);
  },

  postWatchlist(watchlistCode, watchlistName, encryptedPassword) {
    let watchlist = {};
    watchlist.watchlistCode = watchlistCode;
    watchlist.watchlistName = watchlistName;
    watchlist.password = encryptedPassword;

    return apiClient.post("/api/watchlists", {
      watchlist,
    });
  },
};
