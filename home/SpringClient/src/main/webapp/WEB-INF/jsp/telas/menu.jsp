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
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="inicio">GESTOR CAFEEIRO </a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li>
                        <a href="cadastralavoura">CADASTRAR LAVOURA</a>
                    </li>
                    <li>
                        <a href="#">EDITAR LAVOURA</a>
                    </li>
                    <li>
                        <a href="#">PESQUISAR </a>
                    </li>
                     <li>
                        <a href="logout">SAIR</a>
                    </li>   

                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>
  <!-- Page Content -->
  <hr>
        

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