<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<form action="/register" method="post">
    <div class="form-group">
        <label for="username">Username</label>
        <input id="username" name="username" class="form-control" type="text" required>
<%--        required is a good attribute to cinclude in order to make sure your fields are filled out, this is the front end way of checking--%>
    </div>
    <div class="form-group">
        <label for="email">Email</label>
        <input id="email" name="email" class="form-control" type="text" required>
    </div>
    <div class="form-group">
        <label for="password">Password</label>
        <input id="password" name="password" class="form-control" type="text" required>
    </div>
    <div class="form-group">
        <label for="confirmpassword">Confirm Password</label>
        <input id="confirmpassword" name="confirmpassword" class="form-control" type="text" required>
    </div>
    <input type="submit" class="btn btn-block btn-primary">
</form>
</body>
</html>
