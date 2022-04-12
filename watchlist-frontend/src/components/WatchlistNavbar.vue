<template>
  <Menubar :model="items" class="navbar">
    <template #start>
      <h3 class="mx-5 my-0 watchlist-header">{{ watchlistName }}</h3>
    </template>
    <template #end>
      <Button label="Sign Out" class="p-button-outlined" />
    </template>
  </Menubar>
</template>

<script>
import Menubar from 'primevue/menubar';
import Button from "primevue/button";

export default {
  name: "WatchlistNavbar",
  components: { Menubar, Button },
  data() {
    return {
      watchlistName: "Mine filmer",
      items: [
        {
          label: "Add Movie",
          icon: "pi pi-plus-circle"

        },
        {
          label: "Remove Movies",
          icon: "pi pi-minus-circle"
        }
      ]
    };
  },
};
</script>

<style scoped>
</style>
