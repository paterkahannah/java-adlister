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
<h1>HEADER</h1>
<%--ACTION means where to send the form data--%>
<form method="POST" action="/login.jsp">
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
