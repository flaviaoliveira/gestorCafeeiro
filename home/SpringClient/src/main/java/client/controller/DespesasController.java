package client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/GestorCafeeiro")
public class DespesasController {
	
	@RequestMapping("despesas")
	  public String cadastro() {
	    return "telas/dispesas";
	  }

}
