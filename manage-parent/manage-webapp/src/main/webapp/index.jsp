<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <link href="${resourceRoot}/css/bootstrap.min.css" rel="stylesheet">
        <link href="${resourceRoot}/css/global.css" rel="stylesheet">
        <link href="${resourceRoot}/css/signin.css" rel="stylesheet">
        <script src="${resourceRoot}/js/jquery.min.js"></script>
        <script src="${resourceRoot}/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <form class="form-signin" role="form">
        <h2 class="form-signin-heading">请登录</h2>
        <input type="email" class="form-control" placeholder="用户名" required autofocus>
        <input type="password" class="form-control" placeholder="密码" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住我
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>
        </div>
    </body>
</html>