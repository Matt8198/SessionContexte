<%-- 
    Document   : jeu
    Created on : 14 nov. 2018, 14:39:18
    Author     : Matthias
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>${mess}</p>
        <form name="guessForm" method="POST" accept-charset="UTF-8" >
			<label>Ta proposition : <input type="number" min="0" max="100" required name="guess"></label> 
			<input type="SUBMIT" name="action" value="Deviner"><br/>
		</form>
		<form method="POST">
			<input type="SUBMIT" name="action" value="Déconnexion">
	</form>
    </body>
</html>
