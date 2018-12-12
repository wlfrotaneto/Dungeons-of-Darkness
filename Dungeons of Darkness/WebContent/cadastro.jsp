<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Cadastro - Dungeons and Dragons</title>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
		<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
		<link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
		<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
		<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
		<link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
		<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
		<link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">
		<link rel="stylesheet" type="text/css" href="css/util.css">
		<link rel="stylesheet" type="text/css" href="css/main.css">		
	</head>
	
	<body>
		<div class="limiter">
			<div class="container-login100">
				<div class="login100-more"></div>
			<div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
				<form class="login100-form validate-form" action="CadastroServlet" method="post">
					<span class="login100-form-title p-b-59">
						Criação de conta
					</span>

					<div class="wrap-input100 validate-input" data-validate="Nome é requerido">
						<span class="label-input100">Nome Completo</span>
						<input class="input100" type="text" name="nome" placeholder="Nome...">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-user p-t-26"></span>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Email válido é requerido: ex@abc.com">
						<span class="label-input100">Email</span>
						<input class="input100" type="text" name="email" placeholder="Endereço de Email...">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-envelope p-t-25"></span>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate="Usuário é requerido">
						<span class="label-input100">Usuário</span>
						<input class="input100" type="text" name="usuario" placeholder="Usuário...">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-users p-t-26"></span>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Senha é requerido">
						<span class="label-input100">Senha</span>
						<input class="input100" type="password" name="senha" placeholder="*************">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-lock p-t-25"></span>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Idade é requerido">
						<span class="label-input100">Idade</span>
						<input class="input100" type="number" name="idade" placeholder="Idade...">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-license p-t-28"></span>
						</span>
					</div>

					<div class="4u 12u$(xsmall)">
						<input type="radio" id="sexo" name="sexo" value="H">
						<label for="H">Masculino</label>
					</div>
					<div class="4u 12u$(xsmall)">
						<input type="radio" id="sexo" name="sexo" value="M">
						<label for="M">Feminino</label>
					</div>
					
					<div class="flex-m w-full p-b-33">
						<div class="contact100-form-checkbox">
							<input class="input-checkbox100" id="ckb1" type="checkbox" name="remember-me">
							<label class="label-checkbox100" for="ckb1">
								<span class="txt1">
									Eu concordo com os
									<a href="#" class="txt2 hov1">
										termos de uso
									</a>
								</span>
							</label>
						</div>
					</div>

					<div class="container-login100-form-btn">
						<div class="wrap-login100-form-btn">
							<div class="login100-form-bgbtn"></div>
							<button class="login100-form-btn" onclick="msg()">
								Criar Conta
							</button>
						</div>

						<a href="login.jsp" class="dis-block txt3 hov1 p-r-30 p-t-18 p-b-10 p-l-30">
							Login
							<i class="fa fa-long-arrow-right m-l-5"></i>
						</a>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script>
			function msg() {
			    alert("Conta Criada!");
			}
	</script>

	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="vendor/select2/select2.min.js"></script>
	<script src="vendor/daterangepicker/moment.min.js"></script>
	<script src="vendor/daterangepicker/daterangepicker.js"></script>
	<script src="vendor/countdowntime/countdowntime.js"></script>
	<script src="js/main.js"></script>
		
	</body>
</html>