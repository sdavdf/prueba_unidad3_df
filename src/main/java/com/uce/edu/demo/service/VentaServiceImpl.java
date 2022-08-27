package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IVentaRepository;
import com.uce.edu.demo.repository.modelo.Venta;

@Service
public class VentaServiceImpl implements IVentaService{

	@Autowired
	private IVentaRepository iVentaRepository;
	
	@Override
	public void insertar(Venta venta) {
		// TODO Auto-generated method stub
		this.iVentaRepository.insertar(venta);
	}

	@Override
	public Venta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iVentaRepository.buscar(id);
	}

	@Override
	public void actualizar(Venta venta) {
		// TODO Auto-generated method stub
		this.iVentaRepository.actualizar(venta);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iVentaRepository.eliminar(id);
	}

}
