<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subir resumen</title>
</head>
<body>

<form action="FormSubeResumenServlet" method="post" enctype="multipart/form-data">
        <input type="hidden" name="email" value="${resumen.email}" />
        <input type="file" name="file" />
        <input type="submit">Subir resumen</input>
</form>



</body>
</html>