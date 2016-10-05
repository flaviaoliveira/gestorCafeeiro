package client.BDManege;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class DBManager {

	private static EntityManagerFactory factory;
	
	public DBManager() {
		factory = Persistence.createEntityManagerFactory("gestorcafeeirodb");
	}

	public DBManager(String persistenceUnit) {
		factory = Persistence.createEntityManagerFactory(persistenceUnit);
	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
