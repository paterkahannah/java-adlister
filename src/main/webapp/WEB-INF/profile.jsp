<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>

<%--<% String username = (String) request.getParameter("username"); %>--%>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
        <h2>Hello ${username}</h2>
<%--        can't make this show username--%>
    </div>

</body>
</html>
