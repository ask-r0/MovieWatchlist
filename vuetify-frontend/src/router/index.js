import { createRouter, createWebHistory } from "vue-router";

import LoginView from "../views/LoginView.vue";
import WatchlistView from "../views/WatchlistView.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: "/",
      name: "home",
      component: LoginView,
    },
    {
      path: "/watchlist",
      name: "WatchlistView",
      component: WatchlistView,
    },
  ],
});

export default router;
