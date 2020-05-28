<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改商品</title>
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
                    <small>修改商品</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/product/updateProduct" method="post">
        <input type="hidden" value="${product.id}" name="id"><br><br><br>
        商品编号：<input type="text" value="${product.productId}" name="productId"><br><br><br>
        商品名称：<input type="text" value="${product.productName}" name="productName"><br><br><br>
        商品描述：<input type="text" value="${product.productCaption}" name="productCaption"><br><br><br>
        商品价格：<input type="text" value="${product.salePrice}" name="salePrice"><br><br><br>
        商品图片地址：<input type="text" value="${product.productImageUrl}" name="productImageUrl"><br><br><br>

        <input type="submit" value="修改">
    </form>

</div>
</body>
</html>