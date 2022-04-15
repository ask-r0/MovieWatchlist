<template>
  <v-app-bar color="primary">
    <v-app-bar-title>Watchlist</v-app-bar-title>
    <v-spacer></v-spacer>
    <v-btn>
      Add Movie
      <v-icon right>
        mdi-plus-circle
      </v-icon>
    </v-btn>
    <v-btn>
      Remove Movies
      <v-icon right>
        mdi-minus-circle
      </v-icon>
    </v-btn>
    <v-btn variant="outlined" class="ml-10" loading>
      Exit
      <v-icon right>
        mdi-exit-to-app
      </v-icon>
    </v-btn>
  </v-app-bar>
  <v-container fluid>
    <v-row class="justify-center">
      <MovieList :movies="movies"></MovieList>
    </v-row>
  </v-container>
</template>

<script>
import MovieCard from "../components/MovieCard.vue";
import MovieList from "../components/MovieList.vue";
export default {
  name: "WatchlistView",
  components: { MovieList, MovieCard },
  data() {
    return {
      movies: [
        {
          movieId: 567,
          movieName: "Interstellar",
          movieYear: "2002",
          movieRating: "8.9",
          movieDirector: "Christopher Nolan",
          movieTime: "130min",
          movieImage:
            "https://image.tmdb.org/t/p/original/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
        },
        {
          movieId: 244,
          movieName: "Pulp Fiction",
          movieYear: "1989",
          movieRating: "9.1",
          movieDirector: "Quentin Tarantino",
          movieTime: "114min",
          movieImage:
            "https://image.tmdb.org/t/p/original/fIE3lAGcZDV1G6XM5KmuWnNsPp1.jpg",
        },
        {
          movieId: 899,
          movieName: "Parasite",
          movieYear: "2020",
          movieRating: "8.6",
          movieDirector: "Bong Joon Ho",
          movieTime: "148min",
          movieImage:
            "https://image.tmdb.org/t/p/original/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
        },
        {
          movieId: 567,
          movieName: "Interstellar",
          movieYear: "2002",
          movieRating: "8.9",
          movieDirector: "Christopher Nolan",
          movieTime: "130min",
          movieImage:
              "https://image.tmdb.org/t/p/original/gEU2QniE6E77NI6lCU6MxlNBvIx.jpg",
        },
        {
          movieId: 244,
          movieName: "Pulp Fiction",
          movieYear: "1989",
          movieRating: "9.1",
          movieDirector: "Quentin Tarantino",
          movieTime: "114min",
          movieImage:
              "https://image.tmdb.org/t/p/original/fIE3lAGcZDV1G6XM5KmuWnNsPp1.jpg",
        },
        {
          movieId: 899,
          movieName: "Parasite",
          movieYear: "2020",
          movieRating: "8.6",
          movieDirector: "Bong Joon Ho",
          movieTime: "148min",
          movieImage:
              "https://image.tmdb.org/t/p/original/7IiTTgloJzvGI1TAYymCfbfl3vT.jpg",
        },
      ],
    };
  },
};
</script>

<style scoped></style>
