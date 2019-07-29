<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<h3>欢迎登录</h3>
	<form action="/lanqiaoJsp/admin/login" method="post">
		<label>提示：${loginErr}</label>
		<table border="1" align="center">
			<tr><th>用户名：</th><td><input type="text" placeholder="请输入用户名"  name="username"></td></tr>
			<tr><th>密码：</th><td><input type="password" placeholder="请输入密码"  name="password"></td></tr>
			<tr><td colspan="2" align="center"><input type="submit" value="登录"></td></tr>
		</table>
	</form>
</body>
</html>