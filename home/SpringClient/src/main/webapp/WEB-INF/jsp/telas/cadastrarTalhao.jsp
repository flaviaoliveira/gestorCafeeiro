<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
<!-- Modal -->

<div class="modal fade" id="finalizar" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modalLabel"> Cadastros realizado com sucesso!</h4>
      </div>
      <div class="modal-footer">
         <a class="btn btn-primary" href = "inicio">Voltar ao inicio</a>
         <a class="btn btn-primary" href = "cadastralavoura">Cadastrar nova lavoura</a>
      </div>
    </div>
  </div>
</div>
 <!-- /.modal -->
 
  <!-- Modal2 -->
 <div class="modal fade" id="editar" tabindex="-1" role="dialog" aria-labelledby="modalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Fechar"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="modalLabel"> Editar talhão</h4>
      </div>
           
      <div class="container">
	    
		<div class="row">
			<div class="form-group" style="width:51%">
				<div class="panel-body">
				        <c:set var="id_talhao" value="${t.id_talhao}"/>
				        <c:set var="id_propriedade" value="${t.id_propriedade}"/>
						<div class="form-group">
							<label class="control-label" for="nome">Nome</label> 
							<input name="nome" type="text" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="area_talhao">Tamanho</label> 
							<input name="area_talhao" type="text" class="form-control">
						</div>
					   <div class="form-group">
							<label class="control-label" for="veriedade_cafe">Variedade do Café</label> 
							<input name="variedade_café" type="text" class="form-control">
					  </div>
					  
					  <div class="form-group">
							<label class="control-label" for="qualidade_cafe">Qualidade do Café</label> 
							<input name="qualidade_café" type="text" class="form-control">
					  </div>			
				</div>
			</div>
		</div>
	</div>
         
      <div class="modal-footer">
         <a class="btn btn-primary" href = "Editar Talhao">Salvar</a>
      </div>
    </div>
  </div>
</div>
 

  <!-- /.modal2 -->
 

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
	<div class="container">

		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
						<div class="form-group">
							<h2>Talhões</h2>
						</div>
                       <div class="form-group">
						<c:if test="${not empty talhoes}">
							<table class="table">
								<thead class="thead-inverse">
									<tr>
										<th>Name</th>
										<th>Tamanho</th>
										<th>Variedade do Café</th>
										<th>Qualidade do Café</th>
										<th>Editar</th>
									</tr>
									<c:forEach var="t" items="${talhoes}">
									       <tr> 
											<td>${t.nome}</td>
											<td>${t.area_talhao}</td>
											<td>${t.variedade_café}</td>
											<td>${t.qualidade_cafe}</td>
											<td><button id= "editar" data-toggle="modal" data-target="#editar"
											class="btn btn-info btn-block">Editar</button></td>	
										</tr>
									 </c:forEach>
								</thead>
							</table>
						</c:if>
                      </div>
						<div class="form-group" style="width: 30%">
							<button id= "finalizar" data-toggle="modal" data-target="#finalizar"
								class="btn btn-info btn-block">Concluir</button>
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

	<!-- /.container -->

	<!-- jQuery -->
	<script src="/assets/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="/assets/js/bootstrap.min.js"></script>

</body>
</html>