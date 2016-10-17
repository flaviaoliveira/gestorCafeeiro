package client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import client.Tabelas.Propriedade;

@Controller
@RequestMapping(value="/GestorCafeeiro")
public class CasdastroLavouraController {

	  @RequestMapping("cadastralavoura")
	  public String cadastralavoura() {
	    return "telas/cadastro_lavoura";
	  }
	  
	  @RequestMapping("cadastraTalhao")
	  public String CadastraTalhao() {
		 System.out.println("Entrou talhao");
	    return "telas/cadastrarTalhao";
	  }
	  
	  @RequestMapping("AdicionaTalhao")
	  public String AdicionaTalhao(Propriedade pror){
	    return "telas/cadastro_lavoura";
	  }
}
