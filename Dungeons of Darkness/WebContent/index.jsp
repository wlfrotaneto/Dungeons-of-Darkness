<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>Dungeons of Darkness</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
		<link rel="stylesheet" href="css/main-index.css"/>
	</head>
	<body class="landing">

		<!-- Header -->
			<header id="header" class="alt">
				<h1><strong><a href="index.jsp">Dungeons of Darkness</a></strong> by Varg Productions</h1>
				<nav id="nav">
					<ul>
						<li><a href="index.jsp">Página Inicial</a></li>
						<li><a href="jogar.jsp">Jogar</a></li>
						<% if (session.getAttribute("usuario") == null) {%>
						<li><a href="login.jsp">Login</a></li>
						<% } else { %>
						<li><a href="perfil.jsp">Perfil</a></li>
						<li><form id="logoutform" name="logoutform" action="LogoutServlet" method="post"><a href="javascript:{}" onclick="document.getElementById('logoutform').submit(); msglogout();">Sair</a></form></li>
						<% } %>
					</ul>
				</nav>
			</header>

			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

		<!-- Banner -->
			<section id="banner">
				<h2>Dungeons of Darkness</h2>
				<p>Primeiro RPG de Metal Brasileiro <br /> História Fictícia na Noruega</p>
				<ul class="actions">
					<li><a href="#" class="button special big">Jogar</a></li>
				</ul>
			</section>

			<!-- 1 -->
				<section id="one" class="wrapper style1">
					<div class="container 75%">
						<div class="row 200%">
							<div class="6u 12u$(medium)">
								<header class="major">
									<h2>Um jogo imperdível</h2>
									<p>Noruega como nunca visto antes</p>
								</header>
							</div>
							<div class="6u$ 12u$(medium)">
								<p>Você irá jogar com o seu personagem criado, membro da banda The Mayhems. O jogador irá acompanhar a trajetória da banda, controlando as ações do membro para que possa atingir o máximo de infâmia. O personagem poderá ter uma das duas classes: guitarrista ou baixista.</p>
								<p>O jogador poderá explorar três cidades, fazendo ações em cada uma delas para poder criar tensão e aumentar a sua infâmia, tendo no final de sua jornada dois finais (um bom e um ruim). Se ele conseguir a quantia necessária de pontos, irá criar um marco na música; não conseguindo será morto pelo rival Vargsmal.</p>
							</div>
						</div>
					</div>
				</section>

			<!-- 2 -->
				<section id="two" class="wrapper style2 special">
					<div class="container">
						<header class="major">
							<h2>Classes do jogo</h2>
							<p>Opções de classe para personagem</p>
						</header>
						<div class="row 150%">
							<div class="6u 12u$(xsmall)">
								<div class="image fit captioned">
									<img src="images/guitarrista1.jpg" alt="" />
									<h3>Guitarrista</h3>
								</div>
							</div>
							<div class="6u$ 12u$(xsmall)">
								<div class="image fit captioned">
									<img src="images/baixista1.jpg" alt="" />
									<h3>Baixista</h3>
								</div>
							</div>
						</div>
						<ul class="actions">
							<% if (session.getAttribute("usuario") == null) {%>
							<li><a href="login.jsp" class="button special big">Jogar jogo</a></li>
							<li><a href="login.jsp" class="button big">Ver o Perfil</a></li>
							<% } else { %>
							<li><a href="jogar.jsp" class="button special big">Jogar jogo</a></li>
							<li><a href="perfil.jsp" class="button big">Ver o Perfil</a></li>
							<% } %>
						</ul>
					</div>
				</section>

			<!-- 3 -->
				<section id="three" class="wrapper style1">
					<div class="container">
						<header class="major special">
							<h2>Desenvolvedores do jogo</h2>
							<p>Lista de colaboradores</p>
						</header>
						<div class="feature-grid">
							<div class="feature">
								<div class="image rounded"><img src="images/pic04.jpg" alt="" /></div>
								<div class="content">
									<header>
										<h4>Walter Neto</h4>
										<p>Programador e estudante da UCSAL</p>
									</header>
									<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Labore esse tenetur accusantium porro omnis, unde mollitia totam sit nesciunt consectetur.</p>
								</div>
							</div>
							<div class="feature">
								<div class="image rounded"><img src="images/pic05.jpg" alt="" /></div>
								<div class="content">
									<header>
										<h4>Haroldo Beyer</h4>
										<p>Programador e estudante da UCSAL</p>
									</header>
									<p>Animi mollitia optio culpa expedita. Dolorem alias minima culpa repellat. Dolores, fuga maiores ut obcaecati blanditiis, at aperiam doloremque.</p>
								</div>
							</div>
							<div class="feature">
								<div class="image rounded"><img src="images/pic06.jpg" alt="" /></div>
								<div class="content">
									<header>
										<h4>Matheus Rivas</h4>
										<p>Programador e estudante da UCSAL</p>
									</header>
									<p>Maiores iusto inventore fugit architecto est iste expedita commodi sed, quasi feugiat nam neque mollitia vitae omnis, ea natus facere.</p>
								</div>
							</div>
							<div class="feature">
								<div class="image rounded"><img src="images/pic07.jpg" alt="" /></div>
								<div class="content">
									<header>
										<h4>Varg Vikernes</h4>
										<p>Músico norueguês</p>
									</header>
									<p>Vitae earum unde, autem labore voluptas ex, iste dolorum inventore natus consequatur iure similique obcaecati aut corporis hic in! Porro sed.</p>
								</div>
							</div>
						</div>
					</div>
				</section>

			<!-- 4 -->
				<section id="four" class="wrapper style3 special">
					<div class="container">
						<header class="major">
							<h2>Se interessou pelo jogo?</h2>
							<p>Clique abaixo para começar a jogar</p>
						</header>
						<ul class="actions">
							<% if (session.getAttribute("usuario") == null) {%>
							<li><a href="login.jsp" class="button special big">Jogar Agora</a></li>
							<% } else { %>
							<li><a href="jogar.jsp" class="button special big">Jogar Agora</a></li>
							<% } %>
						</ul>
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
						<li>Imagens: <a href="http://unsplash.com">Unsplash</a></li>
					</ul>
				</div>
			</footer>

		<!-- Scripts --> 
		
		<script>
			function msglogout() {
			    alert("Sua conta foi desconectada.");
			}
		</script>
			<script src="js/jquery.min.js"></script>
			<script src="js/skel.min.js"></script>
			<script src="js/util.js"></script>
			<script src="js/main-index.js"></script>

	</body>
</html>
