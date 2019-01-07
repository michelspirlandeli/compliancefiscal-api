package com.compliancefiscal.resources;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compliancefiscal.model.Produtos;
import com.compliancefiscal.service.ProdutosService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(value="/api")
@Api(value = "API REST COMPLIANCE FISCAL")
public class ProdutosResource {

	@Autowired
	private ProdutosService produtosService;
	
	@ApiOperation(value = "Retorna um codigo do produto pesquisado")
	@GetMapping(value="/{codProduto}")
	public ResponseEntity<Produtos> findBycodProduto(@PathVariable Integer codProduto) {
		Produtos obj = produtosService.findBycodProduto(codProduto);
		return ResponseEntity.ok().body(obj);
	}
	
	@ApiOperation(value = "Retorna todos os produto cadastrado na base de dados")
	@GetMapping(value = "/produtos")
	public ResponseEntity<?> listAll(Produtos produtos){
	    return new  ResponseEntity<>(this.produtosService.listAll(produtos), HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retorna o produto cadastrado")
	@PostMapping(value="/produtos")
 	public ResponseEntity<?> insert(@RequestBody Produtos produtos) {
		return new ResponseEntity<>(this.produtosService.insert(produtos), HttpStatus.CREATED);
	}
	
	@ApiOperation(value = "Retorna o produto deletado")
	@DeleteMapping(value="/{id}")
 	public ResponseEntity<?> delete(@PathVariable Integer id) {
		this.produtosService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Retorna o produto atualizado")
	@PutMapping(value="/produtos")
 	public ResponseEntity<?> update(@RequestBody Produtos produtos) {
		produtosService.update(produtos);
        return new ResponseEntity<>(HttpStatus.OK);	
	}
}
