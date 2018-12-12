<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
	<head>
		<title>Perfil - Dungeons of Darkness</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1"/>
		<link rel="stylesheet" href="css/main-index.css"/>
		<link rel="stylesheet" href="css/form-personagem.css"/>
	</head>
	<body>
		<%
			String usuario = null, nome = null, senha = null, email = null, sexo = null;
			Integer id = null, idade = null;
			if(session.getAttribute("usuario") == null){
				response.sendRedirect("index.jsp");
			}else{
				usuario = (String) session.getAttribute("usuario");
				id = (Integer) session.getAttribute("id");
				nome = (String) session.getAttribute("nome");
				senha = (String) session.getAttribute("senha");
				email = (String) session.getAttribute("email");
				idade = (Integer) session.getAttribute("idade");
				sexo = (String) session.getAttribute("sexo");
			}
		%>
		
		<!-- Header -->
			<header id="header">
				<h1><strong><a href="perfil.jsp">Perfil</a></strong> Dungeons of Darkness</h1>
				<nav id="nav">
					<ul>
						<li><a href="index.jsp">Página Inicial</a></li>
						<li><a href="#">Jogar</a></li>
						<li><form id="logoutform" name="logoutform" action="LogoutServlet" method="post"><a href="javascript:{}" onclick="document.getElementById('logoutform').submit(); msglogout();">Sair</a></form></li>
					</ul>
				</nav>
			</header>

			<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

		<!-- Principal -->
		<section id="main" class="wrapper">
			<div class="container">

			<header class="major special">
				<h2>Perfil</h2>
				<p>
					ID: <%out.print(id); %><br>
					Nome: <%out.print(nome); %><br>
					Usuário: <%out.print(usuario); %><br>
					Senha: <%out.print(senha); %><br>
					E-mail: <%out.print(email); %><br>
					Idade: <%out.print(idade); %><br>
					Sexo: <%out.print(sexo); %><br>
				</p>
			</header>
					
		<section>
			<ul class="actions">
				<li><a class="button special" onclick="formCreation(2)">Criar Novo Personagem</a></li>
				<!--<li><a class="button special" href="ListarPersonagemServlet">Listar Personagens</a></li>-->
				<li><form action="ListarPersonagensServlet" method="get"><button class="button special">Lista de Personagens</button></form></li>
			</ul>
		</section>
					
		<section style="padding-top: 50px">
							<form id="form-char" style="display: none;" action="CriarPersonagemServlet" method="post">
							<h3>Criar Personagem</h3>
								<div class="row uniform 50%">
									<div class="6u 12u$(xsmall)">
										<input type="text" name="nome" id="nome" value="" placeholder="Nome" />
									</div>
									<h3>Classe:</h3>
									<div class="4u 12u$(xsmall)">
										<input type="radio" id="guitarrista" name="classe" value="1">
										<label for="guitarrista">Guitarrista</label>
									</div>
									<div class="4u 12u$(xsmall)">
										<input type="radio" id="baixista" value="2" name="classe">
										<label for="baixista">Baixista</label>
									</div>
									<div class="12u$">
										<ul class="actions">
											<li><input type="submit" value="Confirmar" class="special" /></li>
											<li><input type="reset" value="Cancelar" onclick="formCreation(1)"/></li>
										</ul>
									</div>
								</div>
							</form>
						</section>
	
					<a href="#" class="image fit" style="padding-top: 100px"><img src="images/pic01.jpg" alt="" /></a>
					<p>Vis accumsan feugiat adipiscing nisl amet adipiscing accumsan blandit accumsan sapien blandit ac amet faucibus aliquet placerat commodo. Interdum ante aliquet commodo accumsan vis phasellus adipiscing. Ornare a in lacinia. Vestibulum accumsan ac metus massa tempor. Accumsan in lacinia ornare massa amet. Ac interdum ac non praesent. Cubilia lacinia interdum massa faucibus blandit nullam. Accumsan phasellus nunc integer. Accumsan euismod nunc adipiscing lacinia erat ut sit. Arcu amet. Id massa aliquet arcu accumsan lorem amet accumsan.</p>
					<p>Amet nibh adipiscing adipiscing. Commodo ante vis placerat interdum massa massa primis. Tempus condimentum tempus non ac varius cubilia adipiscing placerat lorem turpis at. Aliquet lorem porttitor interdum. Amet lacus. Aliquam lobortis faucibus blandit ac phasellus. In amet magna non interdum volutpat porttitor metus a ante ac neque. Nisi turpis. Commodo col. Interdum adipiscing mollis ut aliquam id ante adipiscing commodo integer arcu amet Ac interdum ac non praesent. Cubilia lacinia interdum massa faucibus blandit nullam. Accumsan phasellus nunc integer. Accumsan euismod nunc adipiscing lacinia erat ut sit. Arcu amet. Id massa aliquet arcu accumsan lorem amet accumsan commodo odio cubilia ac eu interdum placerat placerat arcu commodo lobortis adipiscing semper ornare pellentesque.</p>
					<p>Amet nibh adipiscing adipiscing. Commodo ante vis placerat interdum massa massa primis. Tempus condimentum tempus non ac varius cubilia adipiscing placerat lorem turpis at. Aliquet lorem porttitor interdum. Amet lacus. Aliquam lobortis faucibus blandit ac phasellus. In amet magna non interdum volutpat porttitor metus a ante ac neque. Nisi turpis. Commodo col. Interdum adipiscing mollis ut aliquam id ante adipiscing commodo integer arcu amet blandit adipiscing arcu ante.</p>

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
		<script type="text/javascript">
			function formCreation(a) {
				if(a==1)
					document.getElementById("form-char").style.display="none";
				else if(a==2)
					document.getElementById("form-char").style.display="block";
			}
		</script>
		
		<script src="js/jquery.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/util.js"></script>
		<script src="js/main-index.js"></script>

	</body>
</html>
