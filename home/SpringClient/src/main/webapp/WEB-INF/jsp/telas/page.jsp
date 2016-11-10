<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

	<title>Gestor Cafeeiro</title>
   
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
                <h2 class="page-header">  ${usuarioLogado.nome}, bem vindo(a) ao Gestor Cafeeiro!</h2>
            </div>
            <a href="despesas"  class="category-4">
            <div class="col-lg-3 text-center"> 
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/gasto.jpg">
                <h4>Registrar Despesas</h4>  
             </div> 
			</a>
			 <a href="recomendacao"  class="category-4">
            <div class="col-lg-3 text-center">
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/solo.jpg">
                <h4>Recomendação de Adubação e Calagem</h4>
            </div>
            </a>
			 <a href="relatorios"  class="category-4">
            <div class="col-lg-3  text-center">
                <img class="img-circle img-responsive img-center" src="/assets/bootstrap-3.3.5-dist/img/relatório.jpg">
                <h4>Visualizar Relatórios</h4>
            </div>
            </a>
        </div>
        <hr>

        <!-- Footer -->
        <footer>
            <div class="row">
                <div class="col-lg-10">
                    <p></p>
                </div>
            </div>
            <!-- /.row -->
        </footer>
    </div>
</body>
</html>