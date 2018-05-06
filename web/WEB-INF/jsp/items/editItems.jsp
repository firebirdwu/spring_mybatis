<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="frm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>修改商品信息</title>
</head>
<body>
<form id="itemForm" action="${pageContext.request.contextPath}/editItemsSubmit.action"
      method="post">
    <input type="hidden" name="id" value="${itemsCustom.id}"/>
    <table width="100%" border="1">
        <tr>
            <td>商品名称</td>
            <td><input type="text" name="name" value="${itemsCustom.name}"/></td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td><input type="text" name="price" value="${itemsCustom.price }"/></td>
        </tr>
        <tr>
            <td>商品生产日期</td>
            <td><input type="text" name="createtime"
                       value="<fmt:formatDate value="${itemsCustom.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/> "/></td>
        </tr>
        <%--       <tr>
                  <td>商品图片</td>
                  <td>
                      <c:if test="${items.pic !=null}">
                          <img src="/pic/${items.pic}" width=100 height=100/>
                          <br/>
                      </c:if>
                      <input type="file" name="items_pic"/>
                  </td>
              </tr>--%>
        <tr>
            <td>商品简介</td>
            <td>
                <textarea rows="3" cols="30" name="dettail">${itemsCustom.dettail }</textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
