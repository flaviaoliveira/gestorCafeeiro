package client.controller;


import javax.persistence.EntityManager;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import client.BDManege.DBManager;
import client.Tabelas.*;

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
		return "telas/login";
	}
	
	@RequestMapping(value="/cadastraProdutor")
	public String cadastroProdutor(@Valid Proprietario prop,BindingResult result){
		DBManager.getInstance();
		return "telas/login";
	}
	
	
	@RequestMapping("criarconta")
	public String criar(){	
		return "telas/cadastro";
	}
	
	@RequestMapping("paginaprincipal")
	public String paginaprincipal(){	
		return "telas/page";
	}
	
}
