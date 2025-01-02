// src/router/index.js
import Vue from 'vue';
import Router from 'vue-router';
import LoginIndex from '@/views/login/loginPage.vue'; // 引入 loginIndex 组件

Vue.use(Router);

const routes = [
    {
        path: '/', // 欢迎页路径
        name: 'LoginIndex',
        component: LoginIndex,
    },
    // 其他路由配置
];

const router = new Router({
    mode: 'history', // 使用 HTML5 History 模式
    routes,
});

export default router;
