package com.senaidev.mercado.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_pedido;
	
	@Column(name = "dt_pedido")
	private Date dt_pedido;
	
	@Column(name = "fm_pagamento")
	private String fm_pagamento;

	//Construtores
	public Pedido() {

	}
	public Pedido(Long id_pedido, Date dt_pedido, String fm_pagamento) {
		this.id_pedido = id_pedido;
		this.dt_pedido = dt_pedido;
		this.fm_pagamento = fm_pagamento;
	}
	
	//Getters e Setters
	public Long getId() {
		return id_pedido;
	}

	public void setId(Long id) {
		this.id_pedido = id;
	}

	public Date getIdPedido() {
		return dt_pedido;
	}

	public void setIdPedido(Date dt_pedido) {
		this.dt_pedido = dt_pedido;
	}

	public String getPagamento() {
		return fm_pagamento;
	}

	public void setPagamento(String fm_pagamento) {
		this.fm_pagamento = fm_pagamento;
	}
}
