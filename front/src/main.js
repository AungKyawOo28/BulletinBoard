import Vue from 'vue'
import App from './App'
import router from './router'
import store from './store'
import BootstrapVue from 'bootstrap-vue'
import VeeValidate from 'vee-validate'
import 'bootstrap/dist/css/bootstrap.min.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
<<<<<<< HEAD
import axios from 'axios'
import VueAxios from 'vue-axios'
Vue.config.productionTip = false
Vue.use(BootstrapVue)
Vue.use(VeeValidate)
Vue.use(VueAxios, axios)
=======
Vue.config.productionTip = false
Vue.use(BootstrapVue)
Vue.use(VeeValidate)
>>>>>>> e06493d2897b24d015ff7c1011b67d27ff00e967
new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
