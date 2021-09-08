package br.com.maurodev.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.maurodev.dao.ProdutoDao;
import br.com.maurodev.model.CategoriaEnum;
import br.com.maurodev.model.ProdutoModel;
import br.com.maurodev.util.JPAUtil;

public class CadastroProdutos {

	public static void main(String[] args) {
		ProdutoModel celular = new ProdutoModel("Motorola","O melhor",new BigDecimal("800"), CategoriaEnum.CELULARES);
		
	
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);
		
		
		em.getTransaction().begin();
		dao.cadastra(celular);
		em.getTransaction().commit();
		em.close();
	}
}
