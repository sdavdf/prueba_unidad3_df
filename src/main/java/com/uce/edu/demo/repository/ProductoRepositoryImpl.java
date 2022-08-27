package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.to.ProductoTo;

@Repository
@Transactional
public class ProductoRepositoryImpl implements IProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.persist(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		this.entityManager.merge(producto);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Producto producto = this.buscar(id);
		this.entityManager.remove(producto);
	}

	@Override
	public Producto buscarPorCodigoBarras(String codigo) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> myTypedQuery = this.entityManager
				.createQuery("SELECT p FROM Producto p WHERE p.codigoBarras = :codigo", Producto.class);
		myTypedQuery.setParameter("codigo", codigo);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Producto buscarPorCodigoCantida(String codigo, Integer cantidad) {
		// TODO Auto-generated method stub
		TypedQuery<Producto> myTypedQuery = this.entityManager.createQuery(
				"SELECT p FROM Producto p WHERE p.codigoBarras = :codigo AND p.cantidad = :cantidad", Producto.class);
		myTypedQuery.setParameter("codigo", codigo);
		myTypedQuery.setParameter("cantidad", cantidad);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Producto buscarPorCodigoBarrasNative(String codigo) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("SELECT NEW com.uce.edu.demo.to.ProductoTo(p.codigo, p.nombre, p.categoria, p.stock) FROM producto WHERE p.codigo = :datoCodigo",
				ProductoTo.class);
		myQuery.setParameter("datoCodigo", codigo);
		return (Producto) myQuery.getSingleResult();
	}

}
