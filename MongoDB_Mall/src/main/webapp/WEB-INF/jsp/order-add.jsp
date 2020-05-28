<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增订单</title>
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
                    <small>新增订单</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/order/add" method="post">
        订单编号：<input type="text" name="orderId"><br><br><br>
        订单所购商品名称：<input type="text" name="title"><br><br><br>
        应支付：<input type="text" name="totalPay"><br><br><br>
        实际支付：<input type="text" name="actualPay"><br><br><br>
        支付方式：<input type="text" name="paymentType"><br><br><br>
        创建时间：<input type="text" name="createTime"><br><br><br>
        收货地址：<input type="text" name="receiverAddress"><br><br><br>
        收货人联系方式：<input type="text" name="receiverMobile"><br><br><br>
        收货人：<input type="text" name="receiver"><br><br><br>

        <input type="submit" value="添加">
    </form>

</div>
</body>
</html>