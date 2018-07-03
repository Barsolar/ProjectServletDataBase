<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title> MovieDB </title>
  </head>
  <body>
  <h2> Input data about the movie </h2>
  <form method="post" action="/MovieController">
    <div> <label>Title :</label></div>
    <div> <input type="text" name="title" style="width: 300px"></div>
    <div> <label>Director : </label></div>
    <div> <input type="text" name="director" style="width: 300px"></div>
    <div> <label>Release date:</label> </div>
    <div> <input type="text" name="day" style="width: 100px" placeholder="day ex.1"><input type="text" name="month" style="width: 100px" placeholder="month ex.3"><input type="text" name="year" style="width: 100px" placeholder="year ex.2018"></div>
    <div> <label>Cover url:</label></div>
    <div> <input type="text" name="coverURL" style="width: 300px"></div>
    <div> <input type="submit" value="Save record to database" style="width: fit-content"></div>
  </form>
  </body>
</html>
