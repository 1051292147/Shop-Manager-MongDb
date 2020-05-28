<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/12
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>商城管理系统</h2><br><br><br><br>
    <hr color="blue">
    <a href="${pageContext.request.contextPath}/product/show" target="content"  style="text-decoration:none;">商品信息</a>
    <hr color="blue">
    <a href="${pageContext.request.contextPath}/order/show" target="content"  style="text-decoration:none;">订单信息</a>
    <hr color="blue">
    <a href="${pageContext.request.contextPath}/log/show" target="content"  style="text-decoration:none;">日志信息</a>
    <hr color="blue">
    <a href="${pageContext.request.contextPath}/mall/index" target="_top" style="text-decoration:none;">退出系统</a>
</body>
</html>
