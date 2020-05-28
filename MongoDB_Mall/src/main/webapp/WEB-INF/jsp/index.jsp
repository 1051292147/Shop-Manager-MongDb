<%@ page language="java" contentType="text/html; charset=utf-8"
		 pageEncoding="utf-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>用户登录</title>
	<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
</head>
<body>

<div id="container">
	<div id="box">
		<div id="header">Sign In</div>
		<div id="sign_in">
			<form name="myFrom" action="/mall/login" method="post">
				<table>
					<tr>
						<td class="c1">用户名</td> <td><input type="text" name="username"></td>
					</tr>
					<tr>
						<td class="c1">密码</td> <td><input type="password" name="password"></td>
					</tr>
				</table>
				<div id="btn">
					<input type="submit" value="登录">
					<input type="reset" value="重置">
				</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>