<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype  html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>登陆</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/login.action">
        账号:<input type="text" name="userName"/><br/>
        密码:<input type="password" name="password"/><br/>
        <input type="submit" value="登陆"/>
    </form>
</body>
</html>

