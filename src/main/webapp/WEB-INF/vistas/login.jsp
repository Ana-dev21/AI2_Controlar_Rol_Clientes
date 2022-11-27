<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="styles.css">
<title>Iniciar sesi�n</title>
</head>
<body>
<section class="contenedor">
	
		<h1>Iniciar sesi�n</h1>

			<form method="post" action="login">
				
				<label for="userName"> Nombre de Usario: </label><br>
				<input type="text" name="username" placeholder="Nombre de Usario"/><br><br>
				<label for="password"> Contrase�a: </label><br>
				<input type="password" name="password" placeholder="Contrase�a"/><br><br>
		
				<button>Iniciar sesi�n</button>
				
			</form>
					
			<p class="errorMessage"> ${message} </p>
		
	
	</section>

</body>
</html>