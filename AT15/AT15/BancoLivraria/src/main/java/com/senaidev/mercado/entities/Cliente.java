package com.senaidev.mercado.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente {
	//Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cliente;
	
	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name = "cpf", nullable = false, length = 11, unique = true)
	private String cpf;
	
	@Column(name = "rg", nullable = false, length = 9, unique = true)
	private String rg;
	
	@Column(name = "email", nullable = false, length = 50, unique = true)
	private String email;

	@Column(name = "senha", nullable = false, length = 25)
	private String senha;

	//Construtores
	public Cliente() {

	}

	public Cliente(Long id, String nome, String email, String senha, String cpf) {
		this.id_cliente = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
	}
	
	//Getters e Setters
	public Long getId() {
		return id_cliente;
	}

	public void setId(Long id) {
		this.id_cliente = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.nome = cpf;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
