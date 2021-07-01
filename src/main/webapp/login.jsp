<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/30/21
  Time: 12:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        } else response.sendRedirect("/login.jsp");
    }
%>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="POST" action="login.jsp">
    <label for="username">Username</label>
    <input type="text" id="username" name="username" placeholder="username">
    <br>
    <label for="password">Password</label>
    <input type="password" id="password" name="password" placeholder="password">
    <br>
    <input type="submit">
</form>
</body>
</html>
