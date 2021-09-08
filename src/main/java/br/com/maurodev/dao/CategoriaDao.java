package br.com.maurodev.dao;

import javax.persistence.EntityManager;

import br.com.maurodev.model.CategoriaModel;

public class CategoriaDao {

	private EntityManager em;

	public CategoriaDao(EntityManager em) {
		this.em = em;
	}
	
	public void cadastra(CategoriaModel categoria) {
		this.em.persist(categoria);
	}
	
	
}
