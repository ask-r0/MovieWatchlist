<template>
  <Card style="width: 25rem; margin-bottom: 2em">
    <template #title class="col-offset-2">
      Welcome!
    </template>
    <template #content>
      <span class="p-float-label">
            <InputText id="username" type="text" v-model="watchlistCode" />
            <label for="username">Watchlist Code</label>
      </span>
    </template>
    <template #footer>
      <Button label="Enter"></Button>
    </template>
  </Card>
  <Card style="width: 25rem; margin-bottom: 2em">
    <template #content>
      <span class="p-float-label">
            <InputText id="username" type="text" v-model="watchlistCode" />
            <label for="username">Watchlist Code</label>
      </span>
      <span class="p-float-label">
            <InputText id="username" type="text" v-model="watchlistCode" />
            <label for="username">Watchlist Code</label>
      </span>
      <span class="p-float-label">
            <InputText id="username" type="text" v-model="watchlistCode" />
            <label for="username">Watchlist Code</label>
      </span>

    </template>
  </Card>
  <p>{{watchlistCode}}</p>
</template>

<script>
import Card from 'primevue/card';
import InputText from 'primevue/inputtext';
import Button from 'primevue/button';

export default {
  name: "LoginForm",
  components: { Card, InputText, Button },
  data() {
    return {
      watchlistCode: ''
    }
  }

}
</script>

<style scoped>

.center {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

#footer {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
}

</style>