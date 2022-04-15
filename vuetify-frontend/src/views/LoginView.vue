<template>
  <v-container class="background" fluid>
    <v-row justify="center" align="center" style="height: 95vh">
      <v-col cols="4">
        <LoginCard></LoginCard>
      </v-col>
    </v-row>
  </v-container>

</template>

<script>
import LoginCard from "../components/LoginCard.vue";

export default {
  name: "LoginView",
  components: { LoginCard },
};
</script>

<style scoped>
.background {
  background-image: url("src/assets/interstellar.webp");
  background-size: cover;
  height: 100vh;
}
</style>
