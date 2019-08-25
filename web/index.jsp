<%--
  Created by IntelliJ IDEA.
  User: taoxuefeng
  Date: 2019-08-16
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <style>
      #header {
        background-color:black;
        color:white;
        text-align:center;
        padding:5px;
      }
      #nav {
        line-height:200px;
        background-color:#eeeeee;
        /*height:300px;*/
        width:100px;
        float:left;
        padding:5px;
      }
      #section {
        /*width:350px;*/
        margin:0px auto;
        text-align:center;

        padding:10px;
      }
      #footer {
        background-color:black;
        color:white;
        clear:both;
        text-align:Center;
        padding:5px;
      }

    </style>

  </head>
  <body>

  <div id="header">
    <h1 style="font-family:verdana" align="center">图书借阅系统</h1>
  </div>

  <div id="section">
    <form action="${pageContext.request.contextPath}/loginServlet" method="post"  style="padding: 260px;margin: 50px;font-size: 20px; font-style: inherit">
      登录账号：<input type="text" name="username"/><br>
      <br>
      登录密码：<input type="password" name="password"/><br>
      <br>
      <input type="submit" value="登录">
      <input type="submit" value="注册用户" formaction="regist.jsp" method="get">
    </form>
  </div>

<%--  <div id="footer">--%>
<%--        Hellow World--%>
<%--  </div>--%>
  </body>
</html>
