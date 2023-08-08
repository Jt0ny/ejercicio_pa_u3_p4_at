package com.example.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IFacturaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioPaU3P4AtApplication implements CommandLineRunner {

	@Autowired
	private IProductoService iProductoService;
	@Autowired
	private IFacturaService facturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4AtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Producto p1=new Producto();
		p1.setCategoria("Jarabe");
		p1.setCodigoBarras("123456");
		p1.setNombre("Buprex");
		p1.setPrecio(new BigDecimal(20));
		p1.setStock(2);
		this.iProductoService.guardarProducto(p1, 5);
		
		Producto p2 = new Producto();
		p2.setCategoria("A");
		p2.setCodigoBarras("1222");
		p2.setNombre("Bux");
		p2.setPrecio(new BigDecimal(20));
		p2.setStock(2);
		this.iProductoService.guardarProducto(p2, 2);
		
		List<Producto>productos = new ArrayList<>();
		productos.add(p1);
		productos.add(p2);
		
		
		Factura fac=new Factura ();
		fac.setProductos(productos);
		
		
	}

}
