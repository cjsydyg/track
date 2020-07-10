<%--
  Created by IntelliJ IDEA.
  User: 41307
  Date: 2020-07-01
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登陆系统</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/adminController/login">
    账号：<input name="ad_account" type="text"><br>
    密码：<input name="ad_pwd" type="password"><br>
    <input name="submit" value="提交" type="submit">
    <input name="reset" value="重置" type="reset">
</form>
</body>
</html>
