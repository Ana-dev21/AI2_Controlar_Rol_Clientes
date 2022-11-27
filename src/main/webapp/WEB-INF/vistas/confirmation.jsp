<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Booking Confirmation</title>
</head>
<body>
<p>Bienvenido ${user.username}!</p>


	<table border="1" class="navbar">
		<tr>
			<th><a href="/index">Inicio</a></th>
			<th><a href="/highlighted">Eventos Destacados</a></th>
			<th><a href="/active">Eventos Activos</a></th>
			<th><a href="/bookings">Mis Reservas</a></th>
			<th><a href="/register/logout">Salir</a></th>
		<tr/>
	</table>
	<p>${mensaje}</p>
</body>
</html>