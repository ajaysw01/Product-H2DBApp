<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title></title>
</head>
<body>
    <table>
        <thead>
            <tr>
                <th>Serial No</th>
                <th>Name</th>
                <th>Price</th>
                <th>Quantity</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${products}" var="product" varStatus="index">
                <tr>
                    <td>${index.count }</td>
                    <td>${product.name }</td>
                    <td>${product.price }</td>
                    <td>${product.qty }</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="/">Home</a></p>
</body>
</html>
