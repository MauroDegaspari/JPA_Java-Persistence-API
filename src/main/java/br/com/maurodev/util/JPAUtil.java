package br.com.maurodev.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("JPA");

	public  static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
}
