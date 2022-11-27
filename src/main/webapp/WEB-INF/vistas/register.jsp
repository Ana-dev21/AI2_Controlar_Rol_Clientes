<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../styles.css">
<title>Insert title here</title>
</head>
<body>
<section class="contenedor">
	
		<h1>Registro</h1>

	
		<c:if test="${ sessionScope.userLogged == null }">
	
			<form method="post" action="/register/newUser">
				
				<label for="userName"> Nombre de Usario: </label><br>
				<input type="text" name="username" placeholder="Nombre de Usario"/><br><br>
				<label for="password"> Contraseña: </label><br>
				<input type="password" name="password" placeholder="Contraseña"/><br><br>
				<label for="email"> E-mail: </label><br>
				<input type="text" name="email" placeholder="E-mail"/><br><br>
				<label for="nombre"> Nombre: </label><br>
				<input type="text" name="name" placeholder="Nombre"/><br><br>
				<label for="direccion"> Dirección: </label><br>
				<input type="text" name="location" placeholder="Dirección"/><br><br>
		
				<button>Registrarse</button>
				
			</form>
			
			<p>¿Ya estás registrado? <a href="/login">Incia sesión aquí</a></p>
			
			<p class="errorMessage">${message}</p>
			
		
		</c:if>
	
	</section>

</body>
</html>