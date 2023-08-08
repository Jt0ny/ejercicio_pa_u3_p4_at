package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Transactional
@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insetar(Producto producto) {
		this.entityManager.persist(producto);
		
	}

	@Override
	public void actualizar(Producto producto) {
		this.entityManager.merge(producto);
		
	}

	@Override
	public Producto seleccionar(Integer id) {
		
		return this.entityManager.find(Producto.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Producto p1=this.seleccionar(id);
		this.entityManager.remove(p1);
		
	}

}
