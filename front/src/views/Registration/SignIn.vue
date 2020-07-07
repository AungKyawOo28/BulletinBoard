<template>
  <b-form @submit.prevent="handleSubmit" class="containerForm card">
    <!--#UserName -->
    <b-form-input type="text" v-model="username" class="form-control" placeholder="User Name" name="username"
    v-validate="'required|alpha_spaces'" :class="{ 'is-invalid': submitted && errors.has('username') }" />
    <div v-if="submitted && !username && errors.has('username')" class="invalid-feedback">*User Name is required</div>
    <div v-if="submitted && username && errors.has('username')" class="invalid-feedback">*User Name must not be Number</div>
    <!--/#Username -->
    <!--#Password -->
    <b-form-input type="password" v-model="password" class="form-control" placeholder="Password" name="password"
    v-validate="'required|alpha_spaces'" :class="{ 'is-invalid': submitted && errors.has('password') }" />
    <div v-if="submitted && !password && errors.has('password')" class="invalid-feedback">*Password is required</div>
    <div v-if="submitted && password && errors.has('password')" class="invalid-feedback">*Password must have at least 6 characters</div>
    <!--/#Password -->
    <!--#ConfirmPassword -->
    <b-form-input type="confirmPassword" v-model="confirmPassword" class="form-control" placeholder="Confirm Password" name="confirmPassword"
    v-validate="'required|alpha_spaces'" :class="{ 'is-invalid': submitted && errors.has('confirmPassword') }" />
    <div v-if="submitted && !confirmPassword && errors.has('confirmPassword')" class="invalid-feedback">*Password is required</div>
    <div v-if="submitted && confirmPassword && errors.has('confirmPassword')" class="invalid-feedback">*Password must have at least 6 characters</div>
    <!--/#Password -->
    <b-button type="submit" variant="primary">Sign In</b-button>
  </b-form>
</template>
<script>
export default {
  name: 'loginForm',
  data () {
    return {
      username: '',
      password: '',
      confirmPassword: '',
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
#confirmPasswordLabel {
  text-align: left;
}
.signIn {
  text-align: right;
  margin-top: 20px;
  text-decoration: underline;
}
</style>
