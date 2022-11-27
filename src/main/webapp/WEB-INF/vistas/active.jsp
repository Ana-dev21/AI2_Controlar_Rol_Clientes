<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Eventos Activos</title>
</head>
<body>

<p>Bienvenido ${user.username}!</p>


	<table border="1" class="navbar">
		<tr>
			<th><a href="/">Inicio</a></th>
			<th><a href="/highlighted">Eventos Destacados</a></th>
			<th><a href="/active">Eventos Activos</a></th>
			<th><a href="/bookings">Mis Reservas</a></th>
			<th><a href="/register/logout">Salir</a></th>
		<tr/>
	</table>

	<h1>Listado de Eventos Activos</h1>

	<table border="1">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Aforo</th>
				<th>Fecha Inicio</th>
				<th>Opciones</th>
			<tr/>
		</thead>
		
		<tbody>
			<c:set value="Activo" var="eventStatus"/>
			<c:forEach var="event" items="${eventsList}">
				<c:if test="${event.status == eventStatus}">
					<tr>
						<td>${event.name}</td>
						<td>${event.maxCapacity}</td>
						<td>${event.startDate}</td>
						<td><a href="/detail/${event.id}">Detalle</a></td>
					</tr>
				</c:if>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>