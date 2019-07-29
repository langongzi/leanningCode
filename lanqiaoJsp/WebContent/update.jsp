<%@page import="lanqiaoJsp.org.lanqiao.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更改信息</title>
</head>
<body>
	<form action="/lanqiaoJsp/admin/update" method="get">
		<table border="1" align="center">
			<tr><td>用户ID</td><td>用户名</td><td>密码</td><td>电话</td><td>商店名</td><td>地址</td><td>备注</td></tr>
			
			<tr>
			<td><input type="text" name="userId" value="${user.userId }" ></td>
			<td><input type="text" name="userUserName" value="${user.userUserName }"></td>
			<td><input type="text" name="userPassword" value="${user.userPassword }"></td>
			<td><input type="text" name="userTelphone" value="${user.userTelphone }"></td>
			<td><input type="text" name="userShopName" value="${user.userShopName }"></td>
			<td><input type="text" name="userAddress" value="${user.userAddress }"></td>
			<td><input type="text" name="userComment" value="${user.userComment }"></td>
			</tr>
			<tr><td><input type="submit" value="确认修改"></td></tr>
		</table>
	</form>
</body>
</html>