package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.DetalleVenta;

public interface IDetalleVentaService {

	public void insertar(DetalleVenta detalle);

	public DetalleVenta buscar(Integer id);

	public void actualizar(DetalleVenta detalle);

	public void eliminar(Integer id);
}
