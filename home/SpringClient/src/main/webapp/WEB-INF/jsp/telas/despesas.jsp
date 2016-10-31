<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Gestor Cafeeiro</title>
<!--
	O bootstrap é adicionado apenas para exemplificar.
	-->
<link
	href="<c:url value="/assets/bootstrap-3.3.5-dist/css/bootstrap.min.css" />"
	rel="stylesheet" media="screen">

<!--
	O jquery é necessário para o bootstrap.
	-->
<script type="text/javascript"
	src="<c:url value="/assets/jquery/jquery-1.11.3.min.js" />"></script>
<!--
	O bootstrap é adicionado apenas para exemplificar.
	-->
<script type="text/javascript"
	src="<c:url value="/assets/bootstrap-3.3.5-dist/js/bootstrap.min.js" />"></script>

<!--
	Este é um arquivo com o método que faz a requisição para o webservice.
	-->
<script type="text/javascript"
	src="<c:url value="/assets/js/request.js" />"></script>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
		<div class="container">
			<div>
				<jsp:include page="menu.jsp" />
			</div>
		</div>
	</nav>
	<!-- Page Content -->
	<hr>
	<hr>
	<div class="container" style="width: 60%">
		<div class="row">
			<div class="panel panel-primary">
				<form method="POST" action="">
					<div class="panel-body">
						<div class="form-group">
							<h2>Registro de despesas!</h2>
						</div>
						<div class="col-lg-6">
							<label for="lavoura">Lavoura:</label> <select
								class="form-control" id="sel1" name="id_propriedade">
								<c:forEach var="lavoura" items="${lavouras}">
									<option value="${lavoura.id_propriedade}">${lavoura.nome}</option>
								</c:forEach>
							</select>
						</div>

						<div class="col-lg-6">
							<label class="control-label" for="covas_numeros">Data:</label> <input
								name="covas_numero" type="date" class="form-control">
						</div>

						<div class="col-lg-6">
							<label for="despesa">Etapa:</label> <select class="form-control"
								id="despesa" name="despesa">
								<option value = "1" >Plantio</option>
								<option value = "2">Colheita</option>
								<option value = "3">Lavoura em Produção:</option>
							</select>
						</div>
						<div class="col-lg-6">
							<label for="despesa">Despesa:</label>
							<select class="form-control" id="despesa" name="despesa">
								<c:choose>
									<c:when test="${despesa == 1}">       
										<option>Analise do solo</option>
										<option>Coveamento</option>
										<option>Estrada:</option>
										<option>Manutenção:</option>
										<option>Adubaçao:</option>
										<option>Calagem:</option>
										<option>Aplicação Fertilizante:</option>
										<option>Enchimento de cova:</option>
										<option>Plantio:</option>
										<option>Replantio:</option>
										<option>Controle de Pragas:</option>
									</c:when>
									<c:when test="${despesa == 2}">
                                        <option>Analise do solo</option>
										<option>Coveamento</option>
										<option>Adubaçao:</option>
										<option>Calagem:</option>
										<option>Aplicação Fertilizante:</option>
										<option>Controle de Pragas:</option>
										
									</c:when>
									<c:when test="${despesa == 3}">
									    <option>Manutenção de maquário</option>
										<option>Beneficiamento</option>
										<option>Tranporte:</option>
										<option>Calagem:</option>
										<option>Aplicação Fertilizante:</option>
										<option>Controle de Pragas:</option>
									    
									</c:when>
								</c:choose>
								
							</select>

						</div>

					</div>
				</form>
			</div>
		</div>

	</div>


	<!-- Team Members Row -->
	<div class="row">


		<!-- Footer -->
		<footer>
			<div class="row">
				<div class="col-lg-12">
					<p></p>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		</footer>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="/assets/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/assets/js/bootstrap.min.js"></script>
</body>
</html>