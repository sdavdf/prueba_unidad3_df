package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Venta;

public interface IVentaService {

	public void insertar(Venta venta);

	public Venta buscar(Integer id);

	public void actualizar(Venta venta);

	public void eliminar(Integer id);
}
