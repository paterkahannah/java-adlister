<%@ page import="java.util.Random" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Random r = new Random(); // creating random number var with Random() method
    int randNum = r.nextInt(7) + 1;
    if(randNum == 1) { // if 1, redirects to hello-world
        response.sendRedirect("/hello-world");
    } else if (randNum == 7) { // if 7 send 500 error!
        response.sendError(500);
    }
    String textColor = (request.getParameter("color") != null) ? request.getParameter("color") : ""; // else spits out number and soe info
%>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>
    <h1><%=randNum%></h1>
    <h3 style="color: <%= textColor%>">The color you chose is <%=textColor%>!</h3>
    <p>Query String: <%= request.getQueryString()%></p>
    <p>Path: <%= request.getRequestURL()%></p>
    <p>User_agent Header: <%=request.getHeader("user-agent")%></p>
</body>
</html>
