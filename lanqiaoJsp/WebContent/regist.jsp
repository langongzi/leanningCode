<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
	<form action="/lanqiaoJsp/admin/regist" method="get">
		<table border="1" align="center">
			<tr><th>用户名：</th><td><input type="text" placeholder="请输入用户名"  name="username"></td></tr>
			<tr><th>密码：</th><td><input type="password" placeholder="请输入密码"  name="password"></td></tr>
			<tr><th>电话：</th><td><input type="text"   name="tel"></td></tr>
			<tr><th>地址：</th><td><input type="text"   name="address"></td></tr>
			<tr><th>商店名：</th><td><input type="text"   name="shopname"></td></tr>
			<tr><th>备注：</th><td><input type="text"   name="comment"></td></tr>
			<tr><td colspan="2" align="center"><input type="submit" value="注册"></td></tr>
		</table>
	</form>
</body>
</html>