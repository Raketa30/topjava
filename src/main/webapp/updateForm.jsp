<%--
  Created by IntelliJ IDEA.
  User: duckpool
  Date: 28/11/2021
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<div>
    <h2>Edit meal</h2>
    <form action="meals" method="post">
        <label for="dateTime">DateTime: </label>
        <input type="datetime-local" name="dateTime" placeholder="" id="dateTime">

        <label for="description">Description: </label>
        <input type="text" id="description" placeholder="">

        <label for="calories">Calories: </label>
        <input type="text" id="calories" placeholder="">

        <button type="submit">Save</button>
    </form>
</div>
</body>
</html>
