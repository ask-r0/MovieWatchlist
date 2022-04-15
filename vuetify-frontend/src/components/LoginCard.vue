<template>
  <v-card class="py-8 px-6">
    <v-card-title class="justify-center">Welcome!</v-card-title>
    <v-card-text>
      <v-form>
        <v-container>
          <v-row>
            <v-text-field
              label="Watchlist Code"
              v-model="watchlistCode"
              clearable
            />
          </v-row>
          <v-row class="justify-center">
            <v-btn class="mt-6" color="primary" @click="onEnter">Enter</v-btn>
          </v-row>
        </v-container>
      </v-form>
    </v-card-text>
  </v-card>

  <v-dialog v-model="showCreateDialog">
    <v-card>
      <v-card-title> Watchlist not found </v-card-title>
      <v-card-text>
        There exists no watchlist with the code "{{ watchlistCode }}".
        <strong>Create new?</strong>
      </v-card-text>
      <v-card-actions>
        <v-btn @click="hideCreateDialog">Cancel</v-btn>
        <v-btn color="success" @click="onCreateWatchlist"
          >Create Watchlist</v-btn
        >
      </v-card-actions>
    </v-card>
  </v-dialog>

  <v-overlay :model-value="overlay" class="align-center justify-center">
    <v-progress-circular
        color="primary"
        indeterminate
        size="64"
    ></v-progress-circular>
  </v-overlay>

</template>

<script>
import { defineComponent, ref } from "vue";
import Constants from "../utils/Constants";
import { useWatchlistStore } from "../stores/watchlist.js";
import { useRouter, useRoute } from "vue-router";

export default defineComponent({
  setup() {
    // Constants
    const watchlistStore = useWatchlistStore();
    const router = useRouter();

    // Component variables
    let showCreateDialog = ref(false);
    let watchlistCode = ref("");
    let overlay = ref(false);

    // Methods
    async function onEnter() {
      // Attempt login
      overlay.value = true;
      try {
        let loginStatus = await watchlistStore
          .getApiClient()
          .post("/login", {
            username: watchlistCode.value,
            password: Constants.defaultPassword,
          });

        watchlistStore.setJwtToken(loginStatus.data);
      } catch (e) {
        showCreateDialog.value = true;
        //login failed
        console.log(e);
        overlay.value = false;
        return;
      }

      // Get watchlist data
      try {
        let watchlist = await watchlistStore
          .getApiClient()
          .get("/api/watchlists/" + watchlistCode.value);
        await router.push({ name: "WatchlistView" });
      } catch (err) {
        console.log("err! " + err);
      }
      overlay.value = false;
    }

    async function onCreateWatchlist() {
      watchlistStore
        .getApiClient()
        .post("/api/watchlists", {
          watchlistCode: watchlistCode.value,
          watchlistName: Constants.defaultWatchlistName,
          password: Constants.defaultPasswordEncrypted,
        })
        .then((res) => {
          router.push({ name: "WatchlistView" });
        })
        .catch((err) => {
          console.log("err! " + err);
        });
    }

    function hideCreateDialog() {
      showCreateDialog.value = false;
    }

    // Return
    return {
      overlay,
      showCreateDialog,
      watchlistCode,
      onEnter,
      onCreateWatchlist,
      hideCreateDialog,
    };
  },
});
</script>

<style scoped></style>
