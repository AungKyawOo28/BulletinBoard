<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    <h1>NI Hao!</h1>
    <about></about>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import about from '@/views/About.vue'
export default {
  name: 'Home',
  components: {
    HelloWorld,
    about
  }
}
</script>
