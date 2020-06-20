<%--
  Created by IntelliJ IDEA.
  User: laiyunjing
  Date: 2020/6/1 0001
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>
    <head>
    <meta charset="utf-8">
    <title>菜单管理</title>
    </head>
    <!-- 如果使用frameset 的包含页面  主页面不能有 body-->
    <frameset cols="250,*" border="1">
    <frame src="${ctx }/sys/toMenuLeft.action" name="left">
    <frame src="${ctx }/sys/toMenuRight.action" name="right">
    </frameset>

    </html>
