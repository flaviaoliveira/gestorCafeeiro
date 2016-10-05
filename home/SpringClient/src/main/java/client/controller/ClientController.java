package client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/*
 * Aqui fica o controller do serviço.
 * Para acessar um método declarado e mapeado basta fazer uma requisição:
 * 		ip.de.acess:porta/metodo
 * 		ex.: 192.168.0.1:9000/client/getClientName
 */

//Neste exemplo é feito um mapeamento no controller além do mapeamento do método.
//A anotação do controller não é rest. Aqui a resposta será mapeada de acordo com
//a configuração de prefixo e sufixo no arquivo "application.properties" presente
//em "src/main/resources"
@Controller
@RequestMapping(value="/client")
public class ClientController {

//	A anotação abaixo define o mapeamento de uma url para o método declarado logo a seguir.
//	"value" define o nome mapeado para o método e "method" define o método aceito.
	@RequestMapping(value="/getClientName")
	public String getClientName(@RequestParam(value="id", defaultValue="0") Integer id) {
//		Conforme dito anteriormente, o retorno do método mapeia uma página de retorno
//		mapeada na forma "PREFIXO + RETORNO + SUFIXO"
//		Neste exemplo teríamos: "/WEB-INF/jsp/teste/page.jsp"
//		esta estrutora deve estar na pasta "src/main/webapp" do projeto.
		return "telas/login";
	}
	@RequestMapping(value="cadastraProdutor")
	
	public String cadastroProdutor(){
		
		return "telas/login";
	}
	@RequestMapping("criarconta")
	public String criar(){	
		System.out.println("entrou");
		return "telas/cadastro";
	}
	@RequestMapping("paginaprincipal")
	public String paginaprincipal(){	
		//System.out.println("entrou");
		return "telas/page";
	}
	
}
