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
	<div class="container" style="width: default">
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<div class="form-group">
						<h2>Recomendação para Plantio e Formação</h2>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label for="lavoura">Lavoura:</label> <select
								class="form-control" id="sel1" name="id_propriedade">
								<c:forEach var="lavoura" items="${lavouras}">
									<option value="${lavoura.id_propriedade}">${lavoura.nome}</option>
								</c:forEach>
							</select>
						</div>
						<div class="form-group">
							<label class="control-label">Data:</label> <input name="data"
								type="date" class="form-control">
						</div>
						<div class="form-group">
							<div class="form-inline">

								<label class="control-label">Dimensões da cova(cm):</label> <input
									name="d1" type="text" class="form-control" style="width: 10%">
								<input name="d2" type="text" class="form-control"
									style="width: 10%"> <input name="d3" type="text"
									class="form-control" style="width: 10%">

							</div>
						</div>
						<div class="form-group">

							<label class="control-label">Análise do Solo:</label>

							<div class="form-group">
								<table class="table-bordered">
									<tbody>
										<tr>
											<td style="width: 30%">P (Mehlich-1)</td>
											<td style="width: 30%"><input name="P" type="text"
												class="form-control"></td>
											<td style="width: 30%">mg/dm³</td>
										</tr>
										<tr>
											<td>K (Mehlich-1)</td>
											<td><input name="K" type="text" class="form-control"></td>
											<td>mg/dm³</td>
										</tr>
										<tr>
											<td>Matéria Org.</td>
											<td><input name="MO" type="text" class="form-control"></td>
											<td>%</td>
										</tr>
										<tr>
											<td>Sat. Bases(V)</td>
											<td><input name="SB" type="text" class="form-control"></td>
											<td>%</td>
										</tr>
										<tr>
											<td>CTC do solo (T)</td>
											<td><input name="CTC" type="text" class="form-control"></td>
											<td>cmolc/dm3</td>
										</tr>
										<tr>
											<td>PRNT do calcário</td>
											<td><input name="PRNT" type="text" class="form-control"></td>
											<td>%</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="form-group">
							<label class="control-label">Aplicação na cova:</label>

							<table class="table">
								<tbody>
									<tr>
										<th>000</th>
										<td>L de esterco de curral</td>
									</tr>
									<tr>
										<th>000</th>
										<td>g de superfosfato simples</td>
									</tr>
									<tr>
										<th>000</th>
										<td>g de calcário</td>
									</tr>
									<tr>
										<th>000</th>
										<td>g de calcário</td>
									</tr>
									<tr> 
									   <th><label class="control-label">Calagem:</label></th>
										<td><label class="control-label">000</label>t/ha de calcário</td>
										
									</tr>		
								</tbody>
							</table>
						</div>

						<div class="form-group">
							<label class="control-label">Aplicação de cobertura após:
								plantio:</label>
							<table class="table">
								<tbody>
									<tr>
										<td>30 dias do plantio:</td>
										<th>25</th>
										<td>g/covas de</td>
										<th>000</th>
									</tr>
									<tr>
										<td>60 dias do plantio:</td>
										<th>30</th>
										<td>g/covas de</td>
										<th>000</th>
									</tr>
									<tr>
										<td>90 dias do plantio:</td>
										<th>40</th>
										<td>g/covas de</td>
										<th>000</th>
									</tr>
								</tbody>
							</table>
						</div>
						
						<div class="form-group">
							<label class="control-label">Adubação de primeiro ano:</label>
							<table class="table">
								<tbody>
									<tr>
										<td>Setembro:</td>
										<th>60</th>
										<td>g/covas de</td>
										<th>000</th>
									</tr>
									<tr>
										<td>Novenbro:</td>
										<th>80</th>
										<td>g/covas de</td>
										<th>000</th>
									</tr>
									<tr>
										<td>Janeiro:</td>
										<th>100</th>
										<td>g/covas de</td>
										<th>000</th>
									</tr>
								</tbody>
							</table>
						</div>
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