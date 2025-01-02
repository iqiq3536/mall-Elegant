<template>
  <div class="login-container">
    <el-form ref="loginForm" :model="loginForm" :rules="rules" label-width="100px" class="login-form">
      <h2 class="login-title">登录</h2>
      <el-form-item label="用户名" prop="username">
        <el-input v-model="loginForm.username" placeholder="请输入用户名"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input type="password" v-model="loginForm.password" placeholder="请输入密码"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="submitForm('loginForm')">登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
import axios from "axios";

export default {
  data() {
    return {
      loginForm: {
        username: '',
        password: ''
      },
      rules: {
        username: [
          { required: true, message: '请输入用户名', trigger: 'blur' }
        ],
        password: [
          { required: true, message: '请输入密码', trigger: 'blur' }
        ]
      }
    };
  },
  methods: {
    submitForm(formName) {
      this.$refs[formName].validate((valid) => {
        if (valid) {
          this.login();
        } else {
          console.log('登录失败！');
          return false;
        }
      });
    },
    login() {
      axios.post('http://localhost:8081/api/login', {
        username: this.loginForm.username,
        password: this.loginForm.password
      })
          .then(response => {
            if (response.data.success) {
              alert('登录成功！');
            } else {
              alert('登录失败：' + response.data.message);
            }
          })
          .catch(error => {
            console.error('登录请求失败：', error);
            alert('登录请求失败，请稍后再试！');
          });
    }
  }
};
</script>

<style scoped>
.login-container {
  width: 100%;
  height: 100%;
  display: flex;
  justify-content: center;
  align-items: center;
  background-color: #f2f2f2;
}

.login-form {
  width: 350px;
  padding: 20px;
  background-color: #fff;
  border-radius: 5px;
  box-shadow: 0 2px 12px rgba(0, 0, 0, 0.1);
}

.login-title {
  text-align: center;
  margin-bottom: 20px;
}
</style>
