<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <h1>NI Hao!</h1>
    <about></about>
  </div>
</template>

<script>
// @ is an alias to /src
import about from '@/views/About.vue'
export default {
  name: 'Home',
  components: {
    about
  }
}
</script>
