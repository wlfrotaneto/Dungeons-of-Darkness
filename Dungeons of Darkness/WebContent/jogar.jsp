<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>Jogar - Dungeons of Darkness</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" href="css/main-index.css" />
	</head>
	<body>
		<%
			String username = null, nome = null;
			if(session.getAttribute("usuario") == null){
				response.sendRedirect("login.jsp");
			}else{
				username = (String) session.getAttribute("usuario");
			}
		%>
		<!-- Header -->
			<header id="header">
				<h1><strong><a href="index.html">Jogar</a></strong> Dungeons of Darkness</h1>
				<nav id="nav">
					<ul>
						<li><a href="index.jsp">Página Inicial</a></li>
						<li><a href="jogar.jsp">Jogar</a></li>
						<li><form id="logoutform" name="logoutform" action="LogoutServlet" method="post"><a href="javascript:{}" onclick="document.getElementById('logoutform').submit(); msglogout();">Sair</a></form></li>
					</ul>
				</nav>
			</header>

			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

		<!-- Principal -->
			<section id="main" class="wrapper">
				<div class="container">

					<header class="major special">
						<h2>Jogo</h2>
						<p><%out.print(username); %></p>
					</header>

					<a href="#" class="image fit"><img src="images/pic01.jpg" alt="" /></a>
					<p>Texto da História</p>
				</div>
			</section>

		<!-- Footer -->
			<footer id="footer">
				<div class="container">
					<ul class="icons">
						<li><a href="#" class="icon fa-facebook"></a></li>
						<li><a href="#" class="icon fa-twitter"></a></li>
						<li><a href="#" class="icon fa-instagram"></a></li>
					</ul>
					<ul class="copyright">
						<li>&copy; Varg Productions</li>
						<li>Imagems: <a href="http://unsplash.com">Unsplash</a></li>
					</ul>
				</div>
			</footer>

		<!-- Scripts -->
			<script src="js/jquery.min.js"></script>
			<script src="js/skel.min.js"></script>
			<script src="js/util.js"></script>
			<script src="js/main-index.js"></script>

	</body>
</html>
