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
				<div class="panel-body">
					<form method="POST" action="cadastraTalhao">
					<div class="form-group">
							<h2>Cadastro da Lavoura</h2>
					</div>
						<div class="col-lg-6">
							<div class="form-group">
								<label class="control-label" for="nome">Nome da
									propriedade:</label> <input name="nome" type="text" maxlength="50"
									class="form-control">
							</div>
							<div class="form-group">
								<label class="control-label" for="nome">Tamanho da
									propriedade:</label> <input name="propriedade_tamanho" type="text" maxlength="50"
									class="form-control">
									<label class="control-label"><input type="radio" name="optradio">Hectare              </label>
                                    <label class="control-label"><input type="radio" name="optradio">Metros quadrados (m²)</label>
							</div>
							<div class="form-group">
								<label class="control-label" for="nome">Tamanho da
									lavoura:</label> <input name="lavoura_tamanho" type="text" maxlength="50"
									class="form-control">
									<label class="control-label"><input type="radio" name="optradio">Hectare              </label>
                                    <label class="control-label"><input type="radio" name="optradio">Metros quadrados (m²)</label>
							</div>
							<div class="form-group">
								<label class="control-label" for="nome">Estado:</label> <input
									name="estado" type="text" maxlength="50" class="form-control">
							</div>
							<div class="form-group">
								<label class="control-label" for="nome">Cidade:</label> <input
									name="cidade" type="text" maxlength="50" class="form-control">
							</div>
							
						</div>
						<div class="col-lg-6">
						    <div class="form-group">
								<label class="control-label" for="nome">Municipio/Distrito:</label>
								<input name="municipio" type="text" maxlength="50"
									class="form-control">
							</div>
							<div class="form-group">
								<label class="control-label" for="nome">Altitude aproximada da propriedade:</label>
								<input name="altitude" type="text" maxlength="50"
									class="form-control">
							</div>
							<div class="form-group">
								<label class="control-label" for="nome">Número de Covas:</label>
								<input name="covas_numeros" type="text" maxlength="50"
									class="form-control">
							</div>
							<div class="form-group">
								<label class="control-label" for="nome">Número de talhões na propriedade:</label>
								<input name="numero_talhao" type="text" maxlength="50"
									class="form-control">
							</div>
							
							<div class="form-group">
								<label class="control-label" for="nome">Tipo do café:</label> <input
									name="tipo_cafe" type="text" maxlength="50" class="form-control">
							</div>
							
							<div class="form-group">
							<button id="cadastraTalhao" type="submit" class="btn btn-info btn-block">Avançar</button>
						</div>
					</div>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<footer>
		<div class="row">
			<div class="col-lg-10">
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