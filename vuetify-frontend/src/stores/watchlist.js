import { defineStore } from "pinia";
import axios from "axios";

export const useWatchlistStore = defineStore({
  id: "watchlist",
  state: () => ({
    watchlistCode: "",
    watchlistName: "",
    jwtToken: "",
  }),
  getters: {},
  actions: {
    setJwtToken(token) {
      this.jwtToken = token;
    },
    setWatchlistCode(code) {
      this.watchlistCode = code;
    },
    setWatchlistName(name) {
      this.watchlistName = name;
    },
    getApiClient() {
      return axios.create({
        baseURL: "http://localhost:8090",
        headers: {
          Authorization: this.jwtToken,
        },
      });
    },
  },
});
