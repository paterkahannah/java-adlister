<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>Here are all the Ads:</h1>

<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <p>Title: ${ad.title}</p>
        <p>Description: ${ad.description}</p>
    </div>
</c:forEach>

</body>
</html>