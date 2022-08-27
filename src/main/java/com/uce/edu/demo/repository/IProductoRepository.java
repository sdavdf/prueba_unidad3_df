package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto producto);
	
	public Producto buscar(Integer id);
	
	public void actualizar(Producto producto);
	
	public void eliminar(Integer id);
	
	public Producto buscarPorCodigoBarras(String codigo);
	
	public Producto buscarPorCodigoCantida(String codigo, Integer cantidad);
	
	public Producto buscarPorCodigoBarrasNative(String codigo);
	
}
