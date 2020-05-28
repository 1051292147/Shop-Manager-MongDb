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
    <title>Product List</title>
</head>
<body>
  <div>
      <h4>商品列表</h4>
      <a href="<c:url value="/product/addProduct"/>" style="text-align:center">添加商品</a>
      <table class="table">
          <tr>
              <th>商品编号</th>
              <th>商品名称</th>
              <th>商品描述</th>
              <th>商品价格</th>
              <th>商品图片地址</th>
          </tr>
          <c:forEach items="${productList}" var="product">
              <tr>
                  <td>${product.productId}</td>
                  <td>${product.productName}</td>
                  <td>${product.productCaption}</td>
                  <td>${product.salePrice}</td>
                  <td>${product.productImageUrl}</td>

                  <td><a href="toUpdate/${product.id}">编辑</a></td>
                  <td><a href="toDelete/${product.id}">删除</a></td>
              </tr>
          </c:forEach>

      </table>
  </div>
</body>
</html>
