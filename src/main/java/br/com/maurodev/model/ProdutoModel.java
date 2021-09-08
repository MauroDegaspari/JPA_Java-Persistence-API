package br.com.maurodev.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "produtos") // indentificando o nome real da tabala no banco
public class ProdutoModel {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY) // Informa como é gerado o valor da chave primaria
	private Long id;
	private String nome;
	private String descricao;
	private BigDecimal preco;
	private LocalDate dataCadastro = LocalDate.now();
	
	@ManyToOne // cardinalidade
	private CategoriaModel categoria;
	
	@Enumerated(EnumType.STRING) //mapeamento pelo nome do enum
	private MarcaEnum marca;
	
	
	
	
	public ProdutoModel(String nome, String descricao, BigDecimal preco, MarcaEnum marca) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.marca = marca;
	}
	
	
	//GETTES & SETTES
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public MarcaEnum getMarca() {
		return marca;
	}
	public void setMarca(MarcaEnum marcaa) {
		this.marca = marcaa;
	}
	
	
	
	
}
