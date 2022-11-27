<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Mis Reservas</title>
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

	<h1>Listado de Reservas</h1>

	<table border="1">
		<thead>
			<tr>
				<th>Evento</th>
				<th>Nº Asistentes</th>
				<th>Opciones</th>
			<tr/>
		</thead>
		
		<tbody>
			<c:forEach var="booking" items="${bookings}">
					<tr>
						<td>${booking.event.name}</td>
						<td>${booking.amount}</td>
						<td>${booking.observation}</td>
					</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>