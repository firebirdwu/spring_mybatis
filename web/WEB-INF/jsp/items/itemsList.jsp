<!doctype html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <script type="text/javascript">
        /*查询操作*/
        function queryItems() {
            document.itemsForm.action = "${pageContext.request.contextPath}/items/queryItems.action";
            document.itemsForm.submit();
        }

        /*删除操作*/
        function deleteItems() {
            document.itemsForm.action = "${pageContext.request.contextPath}/items/deleteItems.action";
            document.itemsForm.submit();
        }

    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>查询商品列表</title>
</head>
<body>
<div class="container">
    当前用户:${username},
    <c:if test="${username != null}">
        <a href="${pageContext.request.contextPath}/logout.action">退出</a>
    </c:if>
    <div class="row">
        <form class="form-inline" name="itemsForm" action="${pageContext.request.contextPath}/items/queryItems.action"
              method="post">
            <div class="form-group">
                <label class="control-label" for="itemsCustom.name">商品名称:</label>
                <input type="text" class="form-control"
                       id="itemsCustom.name" name="itemsCustom.name"
                       placeholder="请输入商品名称">
            </div>
            <div class="form-group">
                <label class="control-label" for="itemTypes">商品类型:</label>
                <select class="form-control" id="itemTypes">
                    <c:forEach items="${itemTypes}" var="itemType">
                        <option value="${itemType.key}">${itemType.value}</option>
                    </c:forEach>
                </select>
            </div>
            <!--<div class="form-group text-right">-->
            <button class="btn btn-success text-right form-control" onclick="queryItems()">商品查询</button>
            <button class="btn btn-warning form-control" onclick="deleteItems()">批量删除</button>

        </form>
    </div>
    <div class="row">
        <label>商品列表：</label>
        <table class="table table-striped table-bordered table-hover">
            <tr class="info">
                <td>选择</td>
                <td>商品名称</td>
                <td>商品价格</td>
                <td>生产日期</td>
                <td>商品描述</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${itemsList}" var="item">
                <tr>
                    <td><input class="checkbox" type="checkbox" value="${item.id}" name="itemsId"/></td>
                    <td>${item.name }</td>
                    <td>${item.price }</td>
                    <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                    <td>${item.dettail }</td>
                    <td class="text-center"><a class="btn btn-warning"
                                               href="${pageContext.request.contextPath}/items/editItem.action?id=${item.id}">修改</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>

</html>