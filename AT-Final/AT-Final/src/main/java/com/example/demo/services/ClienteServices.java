package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteServices {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente saveCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> getAllCliente(){
		return clienteRepository.findAll();
	}
	
	public Cliente getClienteById (Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}

}
