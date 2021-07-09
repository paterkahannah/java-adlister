<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
<%--    using a css file, example--%>
    <style><%@include file="css/main.css"%></style>
</head>
<body>
    <c:if test="true">
        <h1>Variable names should be very descriptive</h1>
    </c:if>
    <c:if test="false">
        <h1>single letter variable names are good</h1>
    </c:if>
<script>
<%--    this is just a demo if using a javascript file... see concole to see hello world!--%>
    <%@include file="js/test.js"%>
</script>
</body>
</html>
