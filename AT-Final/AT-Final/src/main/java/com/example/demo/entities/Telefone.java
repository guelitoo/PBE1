package com.example.demo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Telefone {
	
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_telefone;
	
	@Column(name = "ddd")
	private String ddd;
	
	@Column(name = "numero")
	private String numero;
	
	@Column(name = "operadora")
	private String operadora;
	
	@Column(name = "tipo")
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name = "CLIENTE_id_cliente")
	private Cliente cliente;
	
	//Construtores
	public Telefone() {
		
	}
	public Telefone(Long id_telefone, String ddd, String numero, String operadora) {
		this.id_telefone = id_telefone;
		this.ddd = ddd;
		this.numero = numero;
		this.operadora = operadora;
	}
	public Long getId_telefone() {
		return id_telefone;
	}
	public void setId_telefone(Long id_telefone) {
		this.id_telefone = id_telefone;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}