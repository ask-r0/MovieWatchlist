<template>
  <Card class="card-style m-3">
    <template #content>
      <div class="flex flex-row justify-content-between">
        <div class="flex flex-column justify-content-between">
          <div>
            <div class="p-card-title">Pulp Fiction</div>
            <div class="p-card-subtitle">Quentin Tarantino</div>
          </div>
          <div class="flex flex-row">
            <div class="movie-year mr-3 flex flex-row align-items-center">
              <i class="pi pi-clock mx-1"></i>
              <h3 class="mx-1">1978</h3>
            </div>
            <div class="movie-rating flex flex-row align-items-center">
              <i class="pi pi-star mx-1"></i>
              <h3>10/10</h3>
            </div>
          </div>
        </div>
        <Image
          class="movie-image ml-2 p-0"
          src="https://image.tmdb.org/t/p/original/fIE3lAGcZDV1G6XM5KmuWnNsPp1.jpg"
          width="120"
        ></Image>
      </div>
    </template>
  </Card>
</template>

<script>
import Card from "primevue/card";
import Image from "primevue/image";

export default {
  name: "MovieCard",
  components: { Card, Image },
};
</script>

<style scoped>
.card-style {
  width: 25rem;
  /*style="color:var(--primary-color)"*/
}

.movie-image {
}
</style>
