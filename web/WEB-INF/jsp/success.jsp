<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: firebird
  Date: 2018/5/6
  Time: 下午3:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <c:if test="${message} != null">
        <h1>${message}</h1>
    </c:if>
    恭喜您,操作成功.
</body>
</html>
