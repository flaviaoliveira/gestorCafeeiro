package client.controller;


import javax.persistence.EntityManager;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import client.BDManege.DBManager;
import client.Tabelas.*;
import client.tabelasDAO.Login;
import client.tabelasDAO.ProdutorDAO;

@Controller
@RequestMapping(value="/client")
public class ClientController {


	@RequestMapping("getClientName")
	public String getClientName() {
		return "telas/login";
	}
	
	@RequestMapping(value ="cadastraProdutor", method = RequestMethod.POST)
	public String cadastroProdutor(Produtor prop, BindingResult result){
		ProdutorDAO prod = new ProdutorDAO();
		prod.insereProdutor(prop);
		return "telas/login";
	}
	
	 @RequestMapping("loginForm")
	  public String loginForm() {
	    return "telas/login";
	  }
	 @RequestMapping("inicio")
	  public String inicio() {
	    return "telas/page";
	  }
	
	@RequestMapping("paginaprincipal" )
	public String paginaprincipal(Login login, HttpSession session){
		ProdutorDAO p = new ProdutorDAO();
		p.find(login);	
		
		return "telas/page";
	}
	
}
