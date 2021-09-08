package br.com.maurodev.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.maurodev.model.ProdutoModel;

public class CadastroProdutos {

	public static void main(String[] args) {
		ProdutoModel celular = new ProdutoModel();
		celular.setNome("Motorola");
		celular.setDescricao("O melhor");
		celular.setPreco(new BigDecimal("800"));
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = factory.createEntityManager();  // "EntityManager" interface para opera no banco de dados com a JPA
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
	}
}
