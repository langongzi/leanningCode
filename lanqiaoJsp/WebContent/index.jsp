<%@page import="lanqiaoJsp.org.lanqiao.model.User"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>欢迎</title>
</head>
<body>
	<label align="center">用户管理</label>
	<table border="1" align="center">
	<tr><td>用户名</td><td>电话</td><td>商店名</td><td>地址</td><td>备注</td><td>操作</td></tr>
	<c:forEach items="${users}" var="use">
	<%-- <% List eList = (List)request.getAttribute("users");
		for(int i=0;i<eList.size();i++){
			User u = (User)eList.get(i);
	%> --%>
	<tr>
	<td>${use.userUserName }</td>
	<td>${use.userTelphone }</td>
	<td>${use.userShopName }</td>
	<td>${use.userAddress }</td>
	<td>${use.userComment }</td>
	<td><a href="${pageContext.request.contextPath }/admin/del?uid=${use.userId }">删除</a>
	<a href="${pageContext.request.contextPath }/admin/queryById?userId=${use.userId }">修改</a></td>
	</tr>
	</c:forEach>
	<%-- <%
		}
	%> --%>
	</table>
</body>
</html>