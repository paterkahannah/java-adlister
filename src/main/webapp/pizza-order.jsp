<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 7/1/21
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="pizza-order" method="POST">
    <h2>Build your own pizza!</h2>
    <div>
        <label for="crust">Crust</label>
        <select id="crust">
            <option>Thin</option>
            <option>Normal</option>
            <option>Stuffed Crust</option>
        </select>
    </div>
    <div>
        <label for="sauce">Sauce</label>
        <select id="sauce">
            <option>Marinara</option>
            <option>BBQ</option>
            <option>Alfredo</option>
        </select>
    </div>
    <div class="card">
        <div class="card-header">
            Vegetables
        </div>
        <ul class="list-group list-group-flush">

            <li class="list-group-item">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input id=peppers" id="peppers">
                    <label class="custom-control-label" for="peppers">Green Peppers</label>
                </div>
            </li>
            <li class="list-group-item">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" id="shrooms">
                    <label class="custom-control-label" for="shrooms">Mushrooms</label>
                </div>
            </li>
            <li class="list-group-item">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" id="onions">
                    <label class="custom-control-label" for="onions">Onions</label>
                </div>
            </li>
            <li class="list-group-item">
                <div class="custom-control custom-checkbox">
                    <input type="checkbox" class="custom-control-input" id="jala">
                    <label class="custom-control-label" for="jala">Jalepeno Peppers</label>
                </div>
            </li>
        </ul>
    </div>

</form>

</body>
</html>
