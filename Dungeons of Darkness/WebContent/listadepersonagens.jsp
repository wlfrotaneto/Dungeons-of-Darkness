<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Personagens</title>
</head>
<body>
	<section>
							<h3>Lista de Personagens</h3>
							<h4>Personagens</h4>
							<div>
								<table>
									<thead>
										<tr>
											<th>Nome</th>
											<th>Classe</th>
											<th>Pontos</th>
										</tr>
									</thead>
									<tbody>
									<c:forEach var="personagens" items="${personagens}"> 
										<tr>
										<td>${personagens.nome}</td>
										<td>${personagens.classe.id}</td>
										</tr>
									</c:forEach>
									</tbody>
								</table>
							</div>
						</section>
						
						<script type="text/javascript">
							function nomeclasse(id){
								var nome = "Nenhuma";
								if(id == 1){
									nome = "Guitarrista";
								}else{
									nome = "Baixista"
								}
								return nome;
							}
						</script>
</body>
</html>