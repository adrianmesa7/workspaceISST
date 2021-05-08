<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="FormSubeResumenServlet" method="post" enctype="multipart/form-data">
        <input type="hidden" name="email" value="${resumen.email}" />
		<input type="hidden" name="title" value="${resumen.title}" />
		<input type="hidden" name="name" value="${resumen.name}" />
		<input type="file" name="file" />
        <button type="submit">Descargar resumen</button>
</form>

</body>
</html>