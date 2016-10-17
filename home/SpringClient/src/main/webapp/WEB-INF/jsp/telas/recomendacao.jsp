<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <link href="<c:url value="/assets/bootstrap-3.3.5-dist/css/bootstrap.min.css" />" rel="stylesheet" media="screen">
    
	<!--
	O jquery é necessário para o bootstrap.
	-->
	<script type="text/javascript" src="<c:url value="/assets/jquery/jquery-1.11.3.min.js" />"></script>
	<!--
	O bootstrap é adicionado apenas para exemplificar.
	-->
	<script type="text/javascript" src="<c:url value="/assets/bootstrap-3.3.5-dist/js/bootstrap.min.js" />"></script>
	
	<!--
	Este é um arquivo com o método que faz a requisição para o webservice.
	-->
	<script type="text/javascript" src="<c:url value="/assets/js/request.js" />"></script>
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
					<form method="POST" action="">
						<div class="form-group">
							<h2>Recomendação de Adubação e Calagem</h2>
						</div>
						
						<div class="col-lg-6">
							<div class="form-group">
								<label class="control-label" for="nome">Lavoura:</label> <input name="nome" type="text" maxlength="50"
									class="form-control">
							</div>
						</div>
						<div class="col-lg-6">
							<div class="form-group">
								<label class="control-label" for="nome">Talhão:</label> <input name="nome" type="text" maxlength="50"
									class="form-control">
							</div>
						</div>
						<div class="form-group">
							<h4>Resultado da análise feita:</h4>
						</div>
						<div class="col-lg-4">
						<table class="table">
							<thead class="thead-inverse">
								<tr>
									<th>M.O</th>
									<th><input name="nome" type="text" class="form-control" placeholder="dag/dm³"></th>	
								</tr>
								<tr>
									<th>pH</th>
									<th><input name="nome" type="text" class="form-control"placeholder="unid."></th>	
								</tr>
								<tr>
									<th>P</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>K</th>
									<th><input name="nome" type="text" class="form-control" placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>Ca</th>
									<th><input name="nome" type="text" class="form-control"placeholder="cmolc/dm³"></th>	
								</tr>
								<tr>
									<th>Mg</th>
									<th><input name="nome" type="text" class="form-control"placeholder="cmolc/dm³"></th>	
								</tr>
								<tr>
									<th>Al</th>
									<th><input name="nome" type="text" class="form-control"placeholder="cmolc/dm³"></th>	
								</tr>
								<tr>
									<th>H+Al </th>
									<th><input name="nome" type="text" class="form-control"placeholder="cmolc/dm³"></th>	
								</tr>
								
								<tr>
									<th>S.B</th>
									<th><input name="nome" type="text" class="form-control"placeholder="cmolc/dm³"></th>	
								</tr>
							</thead>
							
						</table>
				</div>
				<div class="col-lg-4">
						<table class="table">
							<thead class="thead-inverse">
								<tr>
									<th>CTC</th>
									<th><input name="nome" type="text" class="form-control"placeholder="cmolc/dm³"></th>	
								</tr>
								<tr>
									<th>V%</th>
									<th><input name="nome" type="text" class="form-control"placeholder="%"></th>	
								</tr>
								<tr>
									<th>%K CTC</th>
									<th><input name="nome" type="text" class="form-control"placeholder="%"></th>	
								</tr>
								<tr>
									<th>%Ca CTC</th>
									<th><input name="nome" type="text" class="form-control"placeholder="%"></th>	
								</tr>
								<tr>
									<th>%Mg CTC</th>
									<th><input name="nome" type="text" class="form-control"placeholder="%"></th>	
								</tr>
								<tr>
									<th>%Al CTC</th>
									<th><input name="nome" type="text" class="form-control"placeholder="%"></th>	
								</tr>
								<tr>
									<th>%H+Al CTC</th>
									<th><input name="nome" type="text" class="form-control"placeholder="%"></th>	
								</tr>
								<tr>
									<th>P-res</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								
							</thead>
							
						</table>
				</div>
				<div class="col-lg-4">
						<table class="table">
							<thead class="thead-inverse">
							    <tr>
									<th>P-rem</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/L"></th>	
								</tr>
								<tr>
									<th>Na</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>S</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>B</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>Zn</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>Mn</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>Cu</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
								<tr>
									<th>Fe</th>
									<th><input name="nome" type="text" class="form-control"placeholder="mg/dm³"></th>	
								</tr>
							</thead>
							
						</table>
				</div>
                     <div class="form-group" style="width: 40%">
							<button id="cadastraTalhao" type="submit" class="btn btn-info btn-block">Salvar e Avançar</button>
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