<%--
  Created by IntelliJ IDEA.
  User: Winters
  Date: 2022/11/16
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${status==1}">
        启用
    </c:if>
    <c:if test="${status==0}">
        禁用
    </c:if>
</body>
</html>
