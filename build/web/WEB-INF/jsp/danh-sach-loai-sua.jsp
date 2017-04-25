<%-- 
    Document   : danh-sach-loai-sua
    Created on : Apr 25, 2017, 9:22:15 AM
    Author     : hv
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <caption>DANH SÁCH LOẠI SỮA</caption>
            <thead>
                <tr>
                    <th>Mã loại</th>
                    <th>Tên loại</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${dsls}" var="ls">
                    <tr>
                        <td>${ls.maLoai}</td>
                        <td>${ls.tenLoai}</td>
                    </tr>
                </c:forEach>
            </tbody> 
            
        </table>
    </body>
</html>
