package com.compliancefiscal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compliancefiscal.model.Produtos;

@Repository
public interface ProdutosRepository extends JpaRepository<Produtos, Integer>{

	Optional<Produtos> findById(Integer id);

	Optional<Produtos> findBycodProduto(Integer codProduto);


}