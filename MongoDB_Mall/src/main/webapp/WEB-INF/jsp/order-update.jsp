<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改订单</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改订单</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/order/updateOrder" method="post">
        <input type="hidden" value="${order.id}" name="id"><br><br><br>
        订单编号：<input type="text" value="${order.orderId}" name="orderId"><br><br><br>
        订单所购商品名称：<input type="text" value="${order.title}" name="title"><br><br><br>
        应支付：<input type="text" value="${order.totalPay}" name="totalPay"><br><br><br>
        实际支付：<input type="text" value="${order.actualPay}" name="actualPay"><br><br><br>
        支付方式：<input type="text" value="${order.paymentTypeStatusStr}" name="paymentTypeStatusStr"><br><br><br>
        创建时间：<input type="text" value="${order.createTime}" name="createTime"><br><br><br>
        收货地址：<input type="text" value="${order.receiverAddress}" name="receiverAddress"><br><br><br>
        收货人联系方式：<input type="text" value="${order.receiverMobile}" name="receiverMobile"><br><br><br>
        收货人：<input type="text" value="${order.receiver}" name="receiver"><br><br><br>

        <input type="submit" value="修改">
    </form>

</div>
</body>
</html>