package client.tabelasDAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import client.BDManege.DBManager;
import client.Tabelas.Produtor;
import client.Tabelas.Propriedade;
import client.Tabelas.Talhao;


public class TallhaoDAO {
	
	 @PersistenceContext
	 private static EntityManager manager;
	 
	 public List<Talhao>  criaTalhao(int n, Integer id, double tam){
		 
		 List<Talhao> talhao = new ArrayList<Talhao>();
		 for(int i=1;i<=n; i++){
			 Talhao aux = new Talhao();
			 aux.setArea_talhao(tam);
			 aux.setId_propriedade(id);
			 aux.setNome("talhao"+ n);
			 aux.setVariedade_café("Catuaí");
			 aux.setQualidade_cafe("bebida");
			 talhao.add(aux);
		 }
		return talhao; 
	 }
	 
	 public void insereTalhao(Talhao talhao) throws SQLException{	
		 manager = DBManager.getEntityManager();
          manager.getTransaction().begin();		     
		  manager.persist(talhao);
		  manager.flush();
		  manager.clear();
		  manager.getTransaction().commit();
		  manager.close();
		
	 }

	public List<Talhao> find()throws SQLException {
		
		manager = DBManager.getEntityManager();
        manager.getTransaction().begin();	
        TypedQuery<Talhao>  query = manager.createQuery(
        	    "SELECT p "+
        	    "FROM talhao p ", 
        	Talhao.class);		        
         List<Talhao> results = query.getResultList();
		 manager.flush();
	     manager.clear();
	     manager.getTransaction().commit();
	     manager.close();
	     
	    return results;
	}
	 
}
