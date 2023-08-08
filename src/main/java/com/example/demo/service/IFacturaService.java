package com.example.demo.service;

import java.util.List;
import com.example.demo.repository.modelo.Producto;

public interface IFacturaService {
	
	public void realizarFactura(String cedulaCli,List<Producto>productos);

}
