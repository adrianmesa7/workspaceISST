<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bienvenido admin</title>
</head>
<body>

<h2>Resumenes disponibles</h2>
<table border="1">
<tr>
<th>Titulo</th>
<th>Escritor</th>
<th>Resumen</th>
</tr>

<c:forEach items="${resumenes}" var="resumeni">
<tr>
<td>${resumeni.title}</td>
<td>${resumeni.name}</td>
<td><a href="${resumeni.urlDocument}">${resumeni.urlDocument}</a></td>
</tr>
</c:forEach>

</table>


<h2>Introduce resumen</h2>
<form action="FormCreaResumenServlet">
        <input type="hidden" name="email" value="${resumen.email}"/>
        <input type="text" id="title" name="title" placeholder="Titulo resumen"/>
        <input type="url" name="urlDocument" placeholder="Enlace a resumen"/>
        <button type="submit">Subir resumen</button>
</form>

<%@ include file="FormLogout.jsp"%>

</body>
</html>