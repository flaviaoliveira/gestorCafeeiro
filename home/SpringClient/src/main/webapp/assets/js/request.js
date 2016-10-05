function requestHelloWorld() {
	// Objeto para fazer a requisição.
	var xmlhttp = new XMLHttpRequest();
	// url utilizada na requisição
	var url = "http://localhost:9081/getHelloWorld";
	
	// abrindo a requisição indicando o método (GET).
	// o último parâmetro indica que a requisição é feita de forma assíncrona.
	xmlhttp.open("GET", url, true);
	
	// enviando a requisição
	xmlhttp.send();

	// "pegando" o elemento com id "hello" presente na página.
	var hello = document.getElementById("hello");

	// função ativada quando o elemento da requisição mudar de estado.
    xmlhttp.onreadystatechange=function()
    {
    	// verificação do estado e do status da requisição:
    	// 		estado 4 indica requisição terminada e responsta pronta
    	// 		status 200 indica OK
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
	    {
	    	// responseText contém o texto de resposta obtido na requisição
			resp = xmlhttp.responseText;
			
			// com a resposta recebida, basta utilizar seu valor.
			// aqui, ela foi atribuída para o elemento hello definido anteriormente.
			hello.innerHTML = resp;
			
	    }
	}
}