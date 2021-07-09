<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--pizza order page and form to collect data--%>
<form action="pizza-order" method="POST">
    <h2>Build your own pizza!</h2>
    <div>
        <label for="crust">Crust</label>
        <select id="crust" name="crust">
            <option>Thin</option>
            <option>Normal</option>
            <option>Stuffed Crust</option>
        </select>
    </div>
    <div>
        <label for="sauce">Sauce</label>
        <select id="sauce" name="sauce">
            <option>Marinara</option>
            <option>BBQ</option>
            <option>Alfredo</option>
        </select>
    </div>
    <div>
        <label for="size">Size</label>
        <select id="size" name="size">
            <option>small</option>
            <option>mediun</option>
            <option>large</option>
        </select>
    </div>
    <label for="toppings">Toppings</label>
    <ul id="toppings">
        <li>
            <input type=checkbox id="peppers" name="toppings" value="peppers">
            <label for="peppers">Green Peppers</label>
        </li>
        <li>
            <input type="checkbox" id="shrooms" name="toppings" value="shrooms">
            <label for="shrooms">Mushrooms</label>
        </li>
        <li>
            <input type=checkbox id="onions" name="toppings" value="onions">
            <label for="onions">Onions</label>
        </li>
        <li>
            <input type="checkbox" id="jalapeno" name="toppings" value="jalapeno">
            <label for="jalapeno">Jalapeno</label>
        </li>
    </ul>
    <label for="address">Address</label>
    <input type="text" name="address" id="address">
</form>

</body>
</html>
