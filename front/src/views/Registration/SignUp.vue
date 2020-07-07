<template>
<!--div-->
 <div>
        <b-form @submit.prevent="handleSubmit" class="containerForm card">
          <!--#UserName -->
          <b-form-input type="text" v-model="username" class="form-control" placeholder="User Name" name="username"
          v-validate="'required|alpha_spaces'" :class="{ 'is-invalid': submitted && errors.has('username') }" />
          <div v-if="submitted && !username && errors.has('username')" class="invalid-feedback">*User Name is required</div>
          <div v-if="submitted && username && errors.has('username')" class="invalid-feedback">*User Name must not be Number</div>
          <!--/#UserName -->
          <!--#Password -->
          <b-form-input type="password" v-model="password" class="form-control" placeholder="Password" name="password"
          v-validate="'required|alpha_spaces'" :class="{ 'is-invalid': submitted && errors.has('password') }" />
          <div v-if="submitted && !pwd && errors.has('password')" class="invalid-feedback">*Password is required</div>
          <div v-if="submitted && pwd && errors.has('password')" class="invalid-feedback" >*Password must have at least 6 characters</div>
          <!--/#Password -->
          <!--#SignUp Button -->
          <b-button type="submit" variant="primary">Sign Up</b-button>
          <!--/#SignUpButton -->
          <!--#SignInLink -->
          <router-link :to="{ path: 'signIn' }" class="signIn" >Sign In</router-link>
          <!--#SignInLink -->
        </b-form>
  </div>
  <!--/div-->
</template>

<script>
export default {
  name: 'signUp',
  data () {
    return {
      username: '',
      password: '',
      submitted: false
    }
  },
  methods: {
    handleSubmit (e) {
      this.submitted = true
      this.$validator.validateAll().then(result => {
        if (result) {
          console.log('>>>')
        }
      })
    }
  }
}
</script>
<style scoped>
input {
  margin-bottom: 10px;
}
.containerForm {
    margin: 0 auto;
    width: 300px;
    padding: 10px 10px 10px 10px;
}
#userNameLabel {
    text-align: left;
}
#passwordLabel {
    text-align: left;
}
.signIn {
    text-align: right;
    margin-top: 20px;
    text-decoration: underline;
}
</style>
