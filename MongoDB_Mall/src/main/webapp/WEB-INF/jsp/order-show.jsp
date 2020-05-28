<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 89161
  Date: 2019/1/6
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <title>Order List</title>
</head>
<body>
<div>
    <h4>订单列表</h4>
    <a href="<c:url value="/order/addOrder"/>" style="text-align:center">添加订单</a>
    <table class="table">
        <tr>
            <th>订单编号</th>
            <th>订单所购商品名称</th>
            <th>应支付</th>
            <th>实际支付</th>
            <th>支付方式</th>
            <th>创建时间</th>
            <th>收货地址</th>
            <th>收货人联系方式</th>
            <th>收货人</th>
        </tr>
        <c:forEach items="${orderList}" var="order">
            <tr>
                <td>${order.orderId}</td>
                <td>${order.title}</td>
                <td>${order.totalPay}</td>
                <td>${order.actualPay}</td>
                <td>${order.paymentTypeStatusStr}</td>
                <td>${order.createTime}</td>
                <td>${order.receiverAddress}</td>
                <td>${order.receiverMobile}</td>
                <td>${order.receiver}</td>

                <td><a href="toUpdate/${order.id}">编辑</a></td>
                <td><a href="toDelete/${order.id}">删除</a></td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
