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
    <div class="container">
       
        <!-- Team Members Row -->
        <div class="row">
            <div class="col-lg-12">
                <h3 class="page-header">Escolha qual o tipo da despeza que vai registrar!</h3>
            </div>
            <div class="col-lg-2 col-sm-2 text-center">
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/plantio.jpg" alt="">
                <h4>Plantio</h4>  
            </div>

            <div class="col-lg-2 col-sm-2 text-center">
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/insumo.jpg" alt="">
                <h4>Aplicação de Insumos</h4>
            </div>
            <div class="col-lg-2 col-sm-2 text-center">
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/manutencao.jpg" alt="">
                <h4>Manutenção </h4>
            </div>
            <div class="col-lg-2 col-sm-2 text-center">
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/colheita.jpg" alt="">
                <h4>Colheita</h4>
            </div>
            <div class="col-lg-2 col-sm-2 text-center">
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/beneficiamento.jpg" alt="">
                <h4>Beneficiamento</h4>
            </div>
        </div>
        <hr>

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