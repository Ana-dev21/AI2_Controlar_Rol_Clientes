<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../styles.css">
<title>Detalle</title>
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
	<br>
	
	<!-- Datos del evento -->
	<table border="1">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Descripción</th>
				<th>Fecha Inicio</th>
				<th>Duración</th>
				<th>Localización</th>
				<th>Aforo Máximo</th>
				<th>Precio</th>
			<tr/>
		</thead>
		
		<tbody>
				<tr>
					<td>${event.name}</td>
					<td>${event.description}</td>
					<td>${event.startDate}</td>
					<td>${event.duration}</td>
					<td>${event.location}</td>
					<td>${event.maxCapacity}</td>
					<td>${event.price}</td>
				</tr>
		</tbody>
	</table>
	
	<br>
	
	<!-- formulario Reserva -->
	<fieldset>
		<legend>Formulario de Reserva</legend>
		<form method="post"
			action="/booking/${event.id}"><br>
			
			<label for="cantidad">Cantidad (máximo 10):</label><br>
				<input type="number" max="10" name="amount" placeholder="Cantidad a reservar" /><br><br> 
			<label for="observaciones">Observaciones:</label><br>
				<textarea name="observation" placeholder="Observaciones..."></textarea><br><br>
			<button type="submit">Reservar</button><br>

		</form>
	</fieldset>
</body>
</html>