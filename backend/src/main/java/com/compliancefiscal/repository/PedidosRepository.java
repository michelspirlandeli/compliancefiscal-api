package com.compliancefiscal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compliancefiscal.model.Pedidos;

@Repository
public interface PedidosRepository extends JpaRepository<Pedidos, Long>{
}
