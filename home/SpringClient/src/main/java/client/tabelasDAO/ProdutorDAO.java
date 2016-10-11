package client.tabelasDAO;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.websocket.Session;

import client.BDManege.DBManager;
import client.Tabelas.Produtor;

public class ProdutorDAO {
	 @PersistenceContext
	 private static EntityManager manager;
	 
	 public void insereProdutor(Produtor produtor){	
		  manager = DBManager.getEntityManager();
          manager.getTransaction().begin();		     
		  manager.persist(produtor);
		  manager.flush();
		  manager.clear();
		  manager.getTransaction().commit();
		  manager.close();
		
	 }

	public Produtor find(Login log) {
		manager = DBManager.getEntityManager();
        manager.getTransaction().begin();	
        TypedQuery<Produtor>  query = manager.createQuery(
        	    "SELECT p "+
        	    "FROM Produtor p "+
        	    "WHERE p.senha = :senha AND p.email = :email", 
        	Produtor.class);
        query.setParameter("email", log.getEmail());
        query.setParameter("senha", log.getSenha());
		        
         List<Produtor> results = query.getResultList();
		 manager.flush();
	     manager.clear();
	     manager.getTransaction().commit();
	     manager.close();
	     System.out.println(log.getEmail());
	     System.out.println(log.getSenha());
		 System.out.println(results.size());
		return null;
	}
}
