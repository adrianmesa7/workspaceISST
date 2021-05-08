<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resumenes</title>
</head>
<body>

<h2>Datos del Resumen</h2>
<table>
<tr>

<td>Titulo: ${tfg.title}</td>
<td>Resumen: ${tfg.document}</td>
<td>Escritor: ${tfg.name}</td>

</tr>
</table>

<form action="FormDescargaResumenServlet" method="get">
        <input type="hidden" name="email" value="${resumen.email}" />
		<input type="hidden" name="title" value="${resumen.title}" />
        <button type="submit">Descargar resumen</button>
</form>


</body>
</html>