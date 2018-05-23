<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误提示</title>
</head>
<body>
   <c:if test="${message != null}">
       <h1>${message}</h1>
   </c:if>
</body>
</html>
