<template>
  <WatchlistNavbar />
  <div class="flex flex-column align-items-center">
    <MovieCardList />
  </div>
</template>

<script>
import MovieCardList from "../components/MovieCardList.vue";
import WatchlistNavbar from "../components/WatchlistNavbar.vue";
import Menubar from 'primevue/menubar';

export default {
  name: "WatchlistPage",
  components: { MovieCardList, Menubar, WatchlistNavbar },
  data() {
    return {
      watchlistName: "Mine filmer",
      items: [
        {
          label: "Watchlist name",

        },
        {
          label: "New Movie"
        },
        {
          label: "Remove Movies",
        }
      ]
    };
  },
};
</script>

<style scoped></style>
