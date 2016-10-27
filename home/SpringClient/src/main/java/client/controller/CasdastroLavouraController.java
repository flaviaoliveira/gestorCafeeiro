package client.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import client.Tabelas.Propriedade;
import client.Tabelas.Talhao;
import client.tabelasDAO.PropriedadeDAO;
import client.tabelasDAO.TalhaoDAO;

@Controller
@RequestMapping(value="/GestorCafeeiro")
public class CasdastroLavouraController {
	
	 public Integer id;
	
	  @RequestMapping("cadastralavoura")
	  public String cadastralavoura() {
	    return "telas/cadastro_lavoura";
	  }
	    
	  @RequestMapping("AdicionaTalhao")
	  public String AdicionaTalhao(@Valid Propriedade prop, HttpServletRequest request,
			                       BindingResult result) throws SQLException{
		 
		 PropriedadeDAO propriedadeDAO = new PropriedadeDAO();
		 propriedadeDAO.inserePropriedade(prop);
		 
		 if(result.hasErrors()){
			 System.out.println("erro");
			 return "redirect:AdicionaTalhao";
		 }
		 TalhaoDAO t = new TalhaoDAO();
		
		 id =prop.getId();
	     for(int i = 1; i<=prop.getNumero_talhao();i++){
	    	 
	    	 Talhao aux = new Talhao();
	    	 
	    	 aux.setId_propriedade(prop.getId());
	    	 aux.setArea_talhao(prop.getLavoura_tamanho()/prop.getNumero_talhao());
	    	 aux.setNome("Talhao"+i);
	    	 aux.setVariedade_café("Catuaí");
	    	 aux.setQualidade_cafe("Bebiba");
	    	 
	    	 t.insereTalhao(aux); 	
	     }
	    
		 return "redirect:cadastraTalhao";
	  }
	   
	  
	  @RequestMapping("cadastraTalhao")
	  public String cadastraTalhao(ModelMap model,HttpServletRequest request) throws SQLException{
		  TalhaoDAO t = new TalhaoDAO();
		  List<Talhao> talhoes = t.find(id);
		  model.addAttribute("talhoes", talhoes);

		  return "telas/cadastrarTalhao";
	  }
	
	  @RequestMapping("Editar Talhao")
	  public String cadastrartalhao(Talhao talhoes,BindingResult result,HttpServletRequest request){ 
		  System.out.println(talhoes.getNome());
		  System.out.println(talhoes.getId_propriedade());
		  return "redirect:cadastraTalhao";
	  }
	  
	  
	  
}
