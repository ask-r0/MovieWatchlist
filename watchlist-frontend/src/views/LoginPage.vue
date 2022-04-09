<template>
  <div
    class="login-background w-screen h-screen flex flex-column align-items-center justify-content-center"
  >
    <LoginForm />
  </div>
</template>

<script>
import LoginForm from "../components/LoginForm.vue";
export default {
  name: "LoginPage",
  components: { LoginForm },
};
</script>

<style scoped>
.login-background {
  /*background-color: var(--gray-200);*/
  background-image: url("src/assets/interstellar.webp");
  background-size: cover;
}
</style>
