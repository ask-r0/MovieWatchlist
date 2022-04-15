<template>
  <div class="movie-list">
    <MovieCard class="ma-3" v-for="m in movies" :key="m.movieId" :movie="m" />
  </div>
</template>

<script>
import { defineComponent } from "vue";
import MovieCard from "./MovieCard.vue";

export default defineComponent({
  components: { MovieCard },
  props: {
    movies: Array,
  },
  setup(props) {
    console.log(props.movies);
  },
});
// <MovieCard v-for="m in movies" :key="m.movieId" :movie="m"/>
</script>

<style scoped>
.movie-list {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
}
</style>
