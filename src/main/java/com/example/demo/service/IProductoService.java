package com.example.demo.service;

import com.example.demo.repository.modelo.Producto;

public interface IProductoService {
	
	public void guardarProducto(Producto producto,Integer stock);
	

}
