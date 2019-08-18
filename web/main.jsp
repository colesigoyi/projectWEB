<script src="<%=request.getContextPath()%>/js/jquery-3.1.1.min.js"></script>
<%--
  Created by IntelliJ IDEA.
  User: taoxuefeng
  Date: 2019-08-16
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <style>
        #header {
            background-color:black;
            color:white;
            text-align:center;
            padding:5px;
        }

        #section {

            text-align:center;
            padding:80px;
        }
        #footer {
            background-color:black;
            color:white;
            clear:both;
            text-align:Center;
            padding:5px;
        }
        .footer{height:20px;margin-top:-200px;background-color: #46b8da;
        }
    </style>
</head>

<body>

<div id="header">
    <h1>Welcome ${user.name} !</h1>
</div>


<div id="section">
    <h2></h2>
    <p>
        坐亦禅，行亦禅，一花一世界，一叶一如来，
    </p>
    <p>
        春来花自青，秋至叶飘零，无穷般若心自在，语默动静体自然。
    </p>
    <form action="index.jsp" method="get" align="center">
        <input type="submit" value="返回主页">
    </form>
    <p>
        <video width="320" height="240" controls="controls" autoplay="autoplay">
            <source src="/video/12.mp4" type="video/mp4" />
            <object data="/video/12.mp4" width="320" height="240">
                <embed width="320" height="240" src="/video/12.mp4" />
            </object>
        </video>
    </p>
    <p>
        <audio controls="controls">
            <source src="/redio/PDGo.mp3" type="audio/mpeg">
            <embed height="100" width="100" src="/redio/PDGo.mp3" />
        </audio>
    </p>




</div>
</body>

</html>
