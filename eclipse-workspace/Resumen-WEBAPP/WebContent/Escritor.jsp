<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Introduce resumen</title>
</head>
<body>
<form action="FormCreaResumenServlet" method="post" enctype="multipart/form-data">
        <input type="text" id="name" name="name" placeholder="Nombre completo">
        <input type="text" id="title" name="title" placeholder="Titulo">
        <input type="file" name="file" />
        <button type="submit">Subir</button>
</form>
</body>
</html>