package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.DetalleVenta;


@Repository
@Transactional
public class DetalleVentaRepositoryImpl implements IDetalleVentaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(DetalleVenta detalle) {
		// TODO Auto-generated method stub
		this.entityManager.persist(detalle);
	}

	@Override
	public DetalleVenta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(DetalleVenta.class, id);
	}

	@Override
	public void actualizar(DetalleVenta detalle) {
		// TODO Auto-generated method stub
		this.entityManager.merge(detalle);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		DetalleVenta detalle = this.buscar(id);
		this.entityManager.remove(detalle);
	}

}
