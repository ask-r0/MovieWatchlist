<template>
  <div
    v-bind:class="{
      'movie-list-computer': !isMobile,
      'movie-list-mobile': isMobile,
    }"
  >
    <MovieCard></MovieCard>
    <MovieCard></MovieCard>
    <MovieCard></MovieCard>
    <MovieCard></MovieCard>
    <MovieCard></MovieCard>
    <MovieCard></MovieCard>
  </div>
</template>

<script>
import MovieCard from "./MovieCard.vue";
//<div class="grid justify-content-center movie-list">
export default {
  name: "MovieCardList",
  components: { MovieCard },
  computed: {
    isMobile() {
      let ua = navigator.userAgent;
      return /Mobile|Android|iP(hone|od)|IEMobile|BlackBerry|Kindle|Silk-Accelerated|(hpw|web)OS|Opera M(obi|ini)/.test(
        ua
      );
    },
  },
};
</script>

<style scoped>
.movie-list-computer {
  /* displays movies using three rows */
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
}
.movie-list-mobile {
  /* displays movies using a single row */
  display: grid;
  grid-template-columns: 1fr;
}
</style>
