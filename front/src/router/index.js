import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import SignUp from '../views/Registration/SignUp.vue'
import SignIn from '../views/Registration/SignIn.vue'
<<<<<<< HEAD
import DataTbe from '../views/CommonComponent/DataTb.vue'
=======
>>>>>>> e06493d2897b24d015ff7c1011b67d27ff00e967

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/signUp',
    name: 'signUp',
    component: SignUp
  },
  {
    path: '/signIn',
    name: 'signIn',
    component: SignIn
<<<<<<< HEAD
  },
  {
    path: '/dataTab',
    name: 'dt',
    component: DataTbe
=======
>>>>>>> e06493d2897b24d015ff7c1011b67d27ff00e967
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
