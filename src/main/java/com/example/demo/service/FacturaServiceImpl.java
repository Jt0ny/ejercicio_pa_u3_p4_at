package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepository;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;
@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepository facturaRepository;
	
	@Override
	public void realizarFactura(String cedulaCli, List<Producto> productos) {
		Factura fac= new Factura();
		fac.setCedulaCli(cedulaCli);
		fac.setProductos(productos);
		this.facturaRepository.insetar(fac);
		
	}

}
