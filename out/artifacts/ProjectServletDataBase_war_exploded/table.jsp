<%@ page import="pwr.entity.Movie" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Mój
  Date: 18.06.2018
  Time: 00:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Twoja baza danych</title>
</head>
<body>
    <h1> Oto twoje fimy </h1>
    <table align="center" cellpadding="5" cellspacing="5" border="1">
        <tr>

        </tr>
        <tr bgcolor="#7fffd4">
            <td><b>ID</b></td>
            <td><b>Title</b></td>
            <td><b>Director</b></td>
            <td><b>Release date</b></td>
        </tr>

        <%
            ArrayList <Movie> movies = (ArrayList <Movie>) request.getAttribute("movies");

            for (int i = 0; i<movies.size(); i++){
                String id = String.valueOf(movies.get(i).getId());
                String title = movies.get(i).getTitle();
                String director = movies.get(i).getDirector();
                String releaseDate = movies.get(i).getReleaseDate().toString();
        %>

        <tr bgcolor="#ffe4c4">
            <td> <%= id%> </td>
            <td> <%= title%></td>
            <td> <%= director%></td>
            <td> <%= releaseDate%></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
