<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Json交互测试</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script type="text/javascript">
        function requestJson() {
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath}/requestJson.action',
                contentType:'application/json;charset=utf-8',
                data:'{"name":"手机","price":999}',
                success:function (data) {
                    alert(data);
                }
            });
            
        }
        function responseJson() {
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath}/responseJson.action',
                data:'name=手机&price=999',
                success:function (data) {
                    alert(data);
                }
            });

        }

    </script>
</head>
<body>
    <input type="button" onclick="requestJson()" value="请求json,返回json"/>
    <input type="button" onclick="responseJson()" value="请求keyvalue,返回json"/>
</body>
</html>