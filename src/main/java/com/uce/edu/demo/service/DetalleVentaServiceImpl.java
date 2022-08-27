package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IDetalleVentaRepository;
import com.uce.edu.demo.repository.modelo.DetalleVenta;

@Service
public class DetalleVentaServiceImpl implements IDetalleVentaService{

	@Autowired
	private IDetalleVentaRepository detalleVentaRepository;
	
	@Override
	public void insertar(DetalleVenta detalle) {
		// TODO Auto-generated method stub
		this.detalleVentaRepository.insertar(detalle);
	}

	@Override
	public DetalleVenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.detalleVentaRepository.buscar(id);
	}

	@Override
	public void actualizar(DetalleVenta detalle) {
		// TODO Auto-generated method stub
		this.detalleVentaRepository.actualizar(detalle);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.detalleVentaRepository.eliminar(id);
	}

}
