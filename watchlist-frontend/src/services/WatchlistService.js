import axios from 'axios'

const apiClient = axios.create({
  baseURL: 'http://localhost:8090',
  headers: {
    "Authorization" : "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJuaWNlc3R3YXRjaGxpc3QiLCJleHAiOjE2NDk3Njc4Njh9.nH4SoLponiceY-A0URx45GtGYsc_RJ8d9MYYqFsE2U2Ha3ri41x2VX9Y3NagzmwaXQ8bhrxbVUM3uRRJUFe8IQ"
  }
})

export default {
  getWatchlist(watchlistCode) {
    return apiClient.get("/api/watchlists/" + watchlistCode);
  },
  
  async postWatchlist(watchlistCode, watchlistName, password) {
    const bcrypt = require('bcrypt');

    let watchlist = {};
    watchlist.watchlistCode = watchlistCode;
    watchlist.watchlistName = watchlistName;
    
    // Encrpyting password
    try {
      watchlist.password = await bcrypt.hash(password, 10);
    } catch (err) {
      throw err;
    }

    return apiClient.post(
      "/api/watchlists",
       {
         watchlistCode: watchlistCode,
         watchlistName: watchlistName,
         password: bcrypt.hash(password, 10, )
       }
       );
  }
}