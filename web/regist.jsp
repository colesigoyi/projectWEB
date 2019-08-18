<%--
  Created by IntelliJ IDEA.
  User: taoxuefeng
  Date: 2019-08-16
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/registServlet" method="post" align="center">
    用户名称：<input type="text" name="username"/><br>
    用户密码：<input type="password" name="password"/><br>
    <input type="submit" value="注册" formaction="${pageContext.request.contextPath}/registServlet" method="post">
    <input type="submit" value="返回主界面" formaction="index.jsp" method="get"></form>
</body>
</html>
