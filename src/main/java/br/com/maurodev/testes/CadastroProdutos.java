package br.com.maurodev.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.maurodev.dao.CategoriaDao;
import br.com.maurodev.dao.ProdutoDao;
import br.com.maurodev.model.CategoriaModel;
import br.com.maurodev.model.MarcaEnum;
import br.com.maurodev.model.ProdutoModel;
import br.com.maurodev.util.JPAUtil;

public class CadastroProdutos {

	public static void main(String[] args) {
		CategoriaModel celular = new CategoriaModel("CELULAR");
		ProdutoModel tipoproduto= new ProdutoModel("Motorola","O melhor",new BigDecimal("800"), MarcaEnum.MOTOROLA);
		
	
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		
		em.getTransaction().begin();
		
		produtoDao.cadastra(tipoproduto);
		categoriaDao.cadastra(celular);
		
		em.getTransaction().commit();
		em.close();
	}
}
