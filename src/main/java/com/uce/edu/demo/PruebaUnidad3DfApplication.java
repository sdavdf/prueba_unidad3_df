package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.service.IProductoService;

@SpringBootApplication
public class PruebaUnidad3DfApplication implements CommandLineRunner{
	
	@Autowired
	private IProductoService iProductoService;

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad3DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Producto p1 = new Producto();
		p1.setCategoria("Bebidas");
		p1.setCodigoBarras("3243254");
		p1.setNombre("Coca Cola");
		p1.setPrecio(new BigDecimal(1.20));
		p1.setStock(30);
		
		this.iProductoService.insertar(p1);
	}

}
