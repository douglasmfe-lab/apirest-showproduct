package com.produtos.apirest.config;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

//@Configuration
public class ProdutoConfig implements CommandLineRunner {

	@Autowired
	ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
	//	Produto p1 = new Produto(null, "samsung s8", new BigDecimal(1.00), new BigDecimal(2599.00));
	//	Produto p2 = new Produto(null, "notebook lenovo ideapad320", new BigDecimal(2.00), new BigDecimal(3500.00));
	//	Produto p3 = new Produto(null, "Mac Book", new BigDecimal(1.00), new BigDecimal(8000.00));
	//	Produto p4 = new Produto(null, "Iphone 8", new BigDecimal(2.00), new BigDecimal(4500.00));
	// 	Produto p5 = new Produto(null, "Notebook lenovo ideapad320", new BigDecimal(1.00), new BigDecimal(3500.00));
	//	Produto p6 = new Produto(null, "Notebook lenovo ideapad320", new BigDecimal(1.00), new BigDecimal(3500.00));
	//	Produto p7 = new Produto(null, "Moto G4", new BigDecimal(1.00), new BigDecimal(1500.00));
	//	Produto p8 = new Produto(null, "SmartTV LG 50", new BigDecimal(1.00), new BigDecimal(3550.00));
	//	Produto p9 = new Produto(null, "SmartTV LG 65", new BigDecimal(1.00), new BigDecimal(4990.00));
	//	Salvando no BD:
	
		//produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9));
				
	}

}
