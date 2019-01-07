package com.compliancefiscal.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "itemPedidos")
public class ItemPedidos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer quantidade;
	@ManyToOne
	private Produtos produtos;
	@ManyToOne
	private Pedidos pedidos;
	
	public ItemPedidos() {

	}

	public ItemPedidos(Long id, Integer quantidade, Produtos produtos, Pedidos pedidos) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.produtos = produtos;
		this.pedidos = pedidos;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Produtos getProdutos() {
		return produtos;
	}
	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}
	public Pedidos getPedidos() {
		return pedidos;
	}
	public void setPedidos(Pedidos pedidos) {
		this.pedidos = pedidos;
	}
	
	

}

