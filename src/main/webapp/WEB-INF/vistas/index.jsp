<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.edix.controlclientes.model.beans.Event"%>
<%@page import="com.edix.controlclientes.model.beans.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../styles.css">
<title>Home</title>
</head>
<body>

<!-- Logo -->

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

</body>
</html>