<%--
  Created by IntelliJ IDEA.
  User: 咯还长
  Date: 2019/2/25
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dasdasd</title>
</head>
<body>
<form action="/show.do?action=insertFlower" method="post" >
    <input type="text" name="name" maxlength="20">
    <input type="text" name="price" maxlength="20">
    <input type="text" name="production" maxlength="20">

    <button type="submit">提交</button>
    <button type="reset">重置</button>
</form>
</body>
</html>
