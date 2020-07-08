<template>
  <div id="app">
    <b-table striped responsive :items='info' :fields='fields'>
    </b-table>
  </div>
</template>
<script>
import axios from 'axios'
export default {
  data () {
    return {
      fields: ['code', 'symbol', 'rate'],
      info: null
    }
  },
  mounted () {
    axios
      .get('https://api.coindesk.com/v1/bpi/currentprice.json')
      .then(response => (this.info = response.data.bpi.USD))
    console.log(this.info)
  }
}
</script>
