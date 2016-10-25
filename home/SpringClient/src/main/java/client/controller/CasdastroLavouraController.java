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

@Controller
@RequestMapping(value="/GestorCafeeiro")
public class CasdastroLavouraController {
	
	 public Integer id;
	 public Integer n;
	
	  @RequestMapping("cadastralavoura")
	  public String cadastralavoura() {
	    return "telas/cadastro_lavoura";
	  }
	    
	  @RequestMapping("AdicionaTalhao")
	  public String AdicionaTalhao(@ModelAttribute("SpringWeb") @Valid Propriedade prop, HttpServletRequest request,
			                       ModelMap model,BindingResult result) throws SQLException{
		 
		 PropriedadeDAO propriedadeDAO = new PropriedadeDAO();
		 propriedadeDAO.inserePropriedade(prop);
		 
		 if(result.hasErrors()){
			 return "redirect:cadastralavoura";
		 }
		 model.addAttribute("id",prop.getId());
		 model.addAttribute("Cidade",prop.getCidade());
		 model.addAttribute("municipio",prop.getMunicipio());
		 model.addAttribute("estado",prop.getEstado());
		 model.addAttribute("n_talhao",prop.getNumero_talhao());
		 model.addAttribute("n_covas",prop.getCovas_numero());
		 model.addAttribute("tam_lavoura",prop.getLavoura_tamanho());
		 model.addAttribute("nome",prop.getNome());
		 model.addAttribute("tam_prop",prop.getPropriedade_tamanho());
		 model.addAttribute("cafe_tipo",prop.getTipo_cafe());
		 
		 List<Propriedade> propriedade = (List<Propriedade>)request.getSession().getAttribute("propriedade");
	     if(propriedade == null){
	    	 propriedade = new ArrayList<Propriedade>();
	     }
	     propriedade.add(prop);
	     request.getSession().setAttribute("propriedade", propriedade);
		 return "redirect:cadastraTalhao";
	  }
	   
	  
	  @RequestMapping("cadastraTalhao")
	  public String cadastraTalhao(@Valid Talhao talhao, BindingResult result, ModelMap model,HttpServletRequest request){
		  List<Propriedade> propriedade = (List<Propriedade>)request.getSession().getAttribute("propriedade");
		  System.out.println(propriedade.get(0).getNome());
		  model.addAttribute("propriedade", propriedade);
		  return "telas/cadastrarTalhao";
	  }
	  
	  
}
