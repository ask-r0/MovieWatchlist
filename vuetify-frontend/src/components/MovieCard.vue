<template>
  <v-card class="w-50">
    <v-container>
      <v-row>
        <v-col cols="9" class="pa-0">
          <v-container>
            <v-row class="mb-1">
              <h2>{{ movie.movieName }}</h2>
            </v-row>
            <v-row class="mb-4">
              <p>{{ movie.movieDirector + " (" + movie.movieYear + ")" }}</p>
            </v-row>
            <v-row>
              <v-col class="pa-0">
                <p>
                  {{ movie.movieTime }}
                  <v-icon>mdi-clock-outline</v-icon>
                </p>
              </v-col>
              <v-col class="pa-0">
                <p>
                  {{ movie.movieRating }}
                  <v-icon>mdi-star</v-icon>
                </p>
              </v-col>
            </v-row>
          </v-container>
        </v-col>
        <v-col cols="3" class="pl-0">
          <v-img :src="movie.movieImage" width="120" />
        </v-col>
      </v-row>
    </v-container>
  </v-card>
</template>

<script>
import { defineComponent } from "vue";

export default defineComponent({
  props: {
    movie: Object,
  },
  setup(props) {
    console.log(props.movie);
  },
});
</script>

<style scoped></style>
