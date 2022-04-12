<template>
  <Card class="card-style">
    <template #content>
      <div class="flex flex-column align-items-center">
        <div class="p-card-title m-2">Welcome!</div>
        <span class="p-float-label m-4">
          <InputText type="text" v-model="watchlistCode" id="watchlist-code" />
          <label for="watchlist-code">Watchlist Code</label>
        </span>
        <Button
          label="Enter"
          icon="pi pi-sign-in"
          class="m-2"
          :loading="isEnterLoading"
          @click="onEnter"
        ></Button>
      </div>
    </template>
  </Card>
  <Dialog
    header="Watchlist Not Found"
    v-model:visible="displayConfirmation"
    :style="{ width: '25vw' }"
    :modal="true"
  >
    <p class="m-0">
      There exists no watchlist with the code "{{ watchlistCode }}".
      <strong>Create new?</strong>
    </p>
    <template #footer>
      <Button
        label="Back"
        icon="pi pi-times"
        @click="onDialogDiscard"
        class="p-button-text"
      />
      <Button
        label="Create"
        icon="pi pi-check"
        @click="onDialogCreate"
        autofocus
      />
    </template>
  </Dialog>
</template>

<script>
import Card from "primevue/card";
import InputText from "primevue/inputtext";
import Button from "primevue/button";
import Dialog from "primevue/dialog";

import WatchlistService from "../services/WatchlistService.js";

export default {
  name: "LoginForm",
  components: { Card, InputText, Button, Dialog },
  data() {
    return {
      watchlistCode: "",
      isEnterLoading: false,
      displayConfirmation: false,
    };
  },
  methods: {
    onEnter() {
      WatchlistService.getWatchlist(this.watchlistCode)
      .then(res => {
        // set state of application pinia
        console.log(res);
        this.$router.push({ name: "WatchlistPage"});
      })
      .catch(err => {
        console.log(err);
        this.openConfirmation();
      })
    },
    openConfirmation() {
      this.displayConfirmation = true;
    },
    onDialogCreate() {
      this.displayConfirmation = false;
    },
    onDialogDiscard() {
      this.displayConfirmation = false;
    },
  }
};
</script>

<style scoped>
.card-style {
  width: 25rem;
  /*style="color:var(--primary-color)"*/
}
</style>
