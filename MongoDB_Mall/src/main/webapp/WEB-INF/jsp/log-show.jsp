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
    <title>Log List</title>
</head>
<body>
<div>
    <h4>日志列表</h4>
    <table class="table">
        <tr>
            <th>客户端请求IP</th>
            <th>客户端请求路径</th>
            <th>终端请求方式</th>
            <th>请求方式</th>
            <th>请求的类及方法</th>
            <th>请求参数内容</th>
            <th>session</th>
            <th>请求时间</th>
            <th>接口返回时间</th>
            <th>接口返回数据</th>
            <th>状态码</th>
            <th>请求耗时</th>
            <th>异常描述</th>
            <th>请求开始时间</th>
            <th>请求结束时间</th>
        </tr>
        <c:forEach items="${logList}" var="log">
            <tr>

                <td>${log.clientIp}</td>
                <td>${log.uri}</td>
                <td>${log.type}</td>
                <td>${log.method}</td>
                <td>${log.classMethod}</td>
                <td>${log.paramData}</td>
                <td>${log.sessionId}</td>
                <td>${log.time}</td>
                <td>${log.returnTime}</td>
                <td>${log.returnData}</td>
                <td>${log.httpStatusCode}</td>
                <td>${log.timeConsuming}</td>
                <td>${log.exceptionMessage}</td>
                <td>${log.startTime}</td>
                <td>${log.endTime}</td>


            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
