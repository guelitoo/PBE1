package com.senaidev.mercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senaidev.mercado.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
