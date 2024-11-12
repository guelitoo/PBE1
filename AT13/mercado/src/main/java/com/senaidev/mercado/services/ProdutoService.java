package com.senaidev.mercado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.senaidev.mercado.repository.ProdutoRepository;
import com.senaidev.mercado.entities.Produto;

public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public ProdutoRepository saveProduto (Produto produto) {
		return (produtoRepository).save(produto);
	}
	
	public List<Produto> getAllProduto(){
		return produtoRepository.findAll();
	}
	
	public Produto getProdutoById (Long id) {
		return ((Object) produtoRepository.findById(id)).orElse(null);
	}
	
	public void deleteDepartamento(Long id) {
		produtoRepository.deleteById(id);
	}

}

}
