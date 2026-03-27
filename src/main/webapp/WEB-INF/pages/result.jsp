<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11.03.2026
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Developer Info</title>
</head>
<body>

<h2>Developer Information</h2>
<table>
    <tr>
        <td>Id</td>
        <td>${id}</td>
    </tr>
    <tr>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Specialty</td>
        <td>${specilaty}</td>
    </tr>
    <tr>
        <td>Experience</td>
        <td>${experience}</td>
    </tr>
    <tr>
        <td>Location</td>
        <td>${location}</td>
    </tr>

    <tr>
        <td>WeatherTemp</td>
        <td>${temp}</td>
    </tr>
    <tr>
        <td>WeatherLocation</td>
        <td>${location}</td>
    </tr>
</table>
</body>
</html>
