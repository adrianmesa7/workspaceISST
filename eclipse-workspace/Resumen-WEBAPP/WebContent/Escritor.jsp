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

<form action="FormCreaResumenServlet" method="post">
        <input type="text" id="name" name="name" placeholder="Nombre y apellidos"/>
        <input type="text" id="title" name="title" placeholder="Titulo resumen"/>
        <input type="url" id="urlResumen" name="urlResumen" placeholder="Enlace a resumen"/>
        <button type="submit">Subir resumen</button>
</form>


<%@ include file="FormLogout.jsp"%>

</body>
</html>