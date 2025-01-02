const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  proxyTable: {
    "/api":{
      target:"http://localhost:8081/",
      changeOrigin:true,
      pathRewrite:{
        "^/api" : "/bank"
      }
    }
  },
})

