<template>
  <div class="flex flex-column align-items-center">
    <h1>Watchlist</h1>
    <MovieCardList />
  </div>
</template>

<script>
import MovieCardList from "../components/MovieCardList.vue";
export default {
  name: "WatchlistPage",
  components: { MovieCardList },
  data() {
    return {
      watchlistName: "Mine filmer",
      items: [
        {
          label: this.watchlistName,
          icon: "pi pi-fw pi-power-off",
        },
      ],
    };
  },
};
</script>

<style scoped></style>
