<%--
  Created by IntelliJ IDEA.
  User: chihyun
  Date: 19. 12. 4.
  Time: 오후 2:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Reservation Query</title>
</head>
<body>
<form method="post">
    Chimney Name
    <input type="text" name="chimneyName" value="${chimneyName}" />
    <input type="submit" vlaue="Query" />
</form>

<table border="1">
    <tr>
        <th>Chimney Name</th>
        <th>Date</th>
        <th>Hour</th>
        <th>Player</th>
    </tr>
    <c:forEach items="${reservations}" var="reservation">
        <tr>
            <td>${reservation.name}</td>
            <td>${reservation.date}</td>
            <td>${reservation.hour}</td>
            <td>${reservation.player.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
