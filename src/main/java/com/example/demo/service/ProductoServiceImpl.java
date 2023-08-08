package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IProductoRepository;
import com.example.demo.repository.modelo.Producto;
@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository ;
	@Override
	public void guardarProducto(Producto producto, Integer stock) {
		
		if(producto.getStock()==0) {
			producto.setStock(stock);;
		       this.iProductoRepository.insetar(producto);
			}else {
				Integer in=producto.getStock()+stock;
				producto.setStock(in);
				this.iProductoRepository.actualizar(producto);		
			}
	}


}
