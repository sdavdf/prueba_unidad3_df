package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Producto;

public interface IGestorSupermercadoService {
	
	public void ingresarProducto(Producto producto, Integer Stock);
	
	public void realizarVenta(List<Producto> produ, String cedulaCliente, String numeroVenta);
	
//	public void reporteVenta(LocalDateTime fechaVenta, String categoria, )
	
	public Producto consultarStock(String codigoBarras);

}
