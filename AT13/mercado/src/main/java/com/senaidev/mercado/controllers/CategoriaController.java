package com.senaidev.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.mercado.entities.CategoriaEntities;
import com.senaidev.mercado.services.CategoriaService;

@RestController
@RequestMapping("/departamentos")
public class CategoriaController {
	@Autowired
	private CategoriaController departamentoService;

	@PostMapping
	public CategoriaEntities createCategoria(@RequestBody CategoriaEntities categoria) {
		return CategoriaService.saveDepartamento(categoria);
	}
	
	@PutMapping
	public CategoriaEntities editDepartamento(@RequestBody CategoriaEntities categoria) {
		return CategoriaService.saveDepartamento(categoria);
	}

	@GetMapping
	public List<CategoriaEntities> getAllCategoria() {
		return departamentoService.getAllCategoria();
	}

	@GetMapping("/{id}")
	public CategoriaEntities getCategoria(@PathVariable Long id) {
		return departamentoService.getCategoria(id);
	}

	@DeleteMapping("/{id}")
	public void deleteCategoria(@PathVariable Long id) {
		CategoriaService.deleteCategoria(id);
	}

}
