<%@ page import="com.mineadmin.models.Player" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Players</title>
</head>
<body>
    <h1>Players List</h1>
    <ul>
        <c:forEach var="player" items="${players}">
            <li>${player.name}</li>
        </c:forEach>
    </ul>
</body>
</html>
