<%--
  Created by IntelliJ IDEA.
  User: 41307
  Date: 2020-07-10
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/adminController/register">
    账号：<input  name="ad_account" type="text"><br>
    密码：<input  name="ad_pwd" type="password"><br>
    手机号： <input  name="ad_phone" type="text"><br>
    验证码：<input type="test" size="1"/><img src="validCode"/><a href="">看不清</a><br>
    <input name="submit" value="提交" type="submit">
    <input name="reset" value="重置" type="reset">
</form>
</body>
</html>
