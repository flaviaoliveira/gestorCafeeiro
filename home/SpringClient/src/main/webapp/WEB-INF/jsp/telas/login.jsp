<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Login</title>
</head>
<body>
	<nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div>
			<jsp:include page="menu.jsp" />
		</div>
	</div>
	</nav>
    <hr>
    <hr>
	<div class="container" style="width:40%">
	    
		<div class="row">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form method="POST" action="efetuaLogin" role="form">
						<div class="form-group">
							<h2>Login </h2>
						</div>
						<div class="form-group">
							<label class="control-label" for="e-mail">Email</label> <input
								name="email" type="text" maxlength="50" class="form-control">
						</div>
						<div class="form-group">
							<label class="control-label" for="Senha">Senha</label> <input
							 	name= "senha" type="password" maxlength="11" class="form-control">
						</div>
						
						
						<div class="form-group">
							<button id="entrar" type="submit"  value= "Entrar na Conta"
							class="btn btn-info btn-block">Entrar</button>
						</div>						
					</form>
					<form method="POST" action="cadastro">
						<div class="form-group">
							<button id="conta" type="submit" value ="Cadastrar Produtor"
								class="btn btn-block">Criar uma Conta</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>