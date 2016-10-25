package client.tabelasDAO;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import client.BDManege.DBManager;
import client.Tabelas.Produtor;
import client.Tabelas.Propriedade;

public class PropriedadeDAO {

	
	 @PersistenceContext
	 private static EntityManager manager;
	 
	 public void inserePropriedade(Propriedade propriedade) throws SQLException{	
		 manager = DBManager.getEntityManager();
          manager.getTransaction().begin();		     
		  manager.persist(propriedade);
		  manager.flush();
		  manager.clear();
		  manager.getTransaction().commit();
		  manager.close();	
	 }
}
