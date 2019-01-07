package com.compliancefiscal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.compliancefiscal.model.Produtos;
import com.compliancefiscal.repository.ProdutosRepository;
import com.compliancefiscal.service.exception.ObjectNotFoundException;

@Service
public class ProdutosService {

	@Autowired
	private ProdutosRepository produtosRepository;
	

	public Produtos insert(Produtos produtos) {
	        	
	    this.produtosRepository.save(produtos);
	
        return produtos;
		     	  
    }
	
	public Produtos findById(Integer id) {
		Optional<Produtos> obj = produtosRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Produtos findBycodProduto(Integer codProduto) {
		Optional<Produtos> obj = produtosRepository.findBycodProduto(codProduto);
		return obj.orElseThrow(() -> new ObjectNotFoundException("O produto não existe"));
	}
	
	public void delete(Integer id) {
		findById(id);
		produtosRepository.deleteById(id);
	}

	public ResponseEntity<?> update(Produtos produtos) {
		produtosRepository.save(produtos);
		return null;
	}

	public Optional<List<Produtos>> listAll(Produtos produtos){
        List<Produtos>  list = produtosRepository.findAll();
        return Optional.of(list);
    }

}
