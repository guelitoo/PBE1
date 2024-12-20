package com.senaidev.cursoproduto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senaidev.cursoproduto.entities.Turmas;
import com.senaidev.cursoproduto.services.TurmasService;

@RestController
@RequestMapping("/turmas")
public class TurmasController {

	@Autowired
	private TurmasService turmaService;
	
	@PostMapping
	public Turmas createTurma(Turmas turma) {
		
		return turmaService.saveTurmas(turma);
	}
	
	@GetMapping
	public List<Turmas>getAllTurma() {
		
		return turmaService.getAllTurmas();
	}
	
	@GetMapping("/{id}")
	public Turmas getTurma(@PathVariable Long id) {
		return turmaService.getTurmaById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteTurma(@PathVariable Long id) {
		turmaService.deleteTurma(id);
	}
}
