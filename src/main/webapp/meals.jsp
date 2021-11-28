<%--
  Created by IntelliJ IDEA.
  User: duckpool
  Date: 28/11/2021
  Time: 08:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<div>
    <div>
        <a href="add">Add meal</a>
    </div>
    <div>
        <table style="border: 1px black; border-collapse: collapse; padding: 5px;">
            <tr>
                <th>Date</th>
                <th>Description</th>
                <th>Calories</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach var="meal" items="${meals}">
                <tr>
                    <td>${meal.dateTime}</td>
                    <td>${meal.description}</td>
                    <td>${meal.calories}</td>
                    <td><a href="">Update</a></td>
                    <td><a href="">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
