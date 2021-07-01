<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/30/21
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    // Setting a request attribute (this would be done in a servlet)
    request.setAttribute("userRole", "admin"); // change admin to other things to get switch case to work

    String message;

    switch (request.getAttribute("userRole").toString()) {
        case "admin":
            message = " admininistrator";
            break;
        case "s_admin":
            message = "super administrator";
            break;
        case "user_1":
            message = "active user";
            break;
        default:
        message = "unwkown status";
    }

    request.setAttribute("userRoleMessage", message);

//    User u1 = new User("hp25", 27, "hp@codeup.com");
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>${userRole}</h1>
    <h2>Your name is: ${param.name}</h2>
    <h3>User Status: ${userRoleMessage}</h3>

    <h2>Username = ${user.username}</h2>
    <p>User Age = ${user.age}</p>
    <p>User Email = ${user.email}</p>
</body>
</html>
