package br.com.maurodev.dao;

import javax.persistence.EntityManager;

import br.com.maurodev.model.ProdutoModel;

public class ProdutoDao {

	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastra(ProdutoModel produto) {
		this.em.persist(produto);
	}
	
	
}
