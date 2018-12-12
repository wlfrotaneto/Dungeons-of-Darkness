<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Página Inicial - RPG UCSal</title>
	</head>
	<body>
		<%
			String username = null;
			if(session.getAttribute("usuario") == null){
				response.sendRedirect("index.jsp");
			}else{
				username = (String) session.getAttribute("usuario");
			}
		%>
		<h1>Bem-vindo <%out.print(username);%></h1>
		<form action="<%=response.encodeURL("LogoutServlet") %>" method="post">
		<input type="submit" value="Logout" >
		</form>
	</body>
</html>