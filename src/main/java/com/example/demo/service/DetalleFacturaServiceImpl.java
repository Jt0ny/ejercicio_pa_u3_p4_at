package com.example.demo.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IDetalleFacturaRepository;
import com.example.demo.repository.modelo.DetalleFactura;
@Service
public class DetalleFacturaServiceImpl implements 	IDetalleFacturaService {

	@Autowired
	private IDetalleFacturaRepository detalleFacturaRepository;

	@Override
	public void generarReporte(LocalDate fechaFac, String cateforia) {
		
		
	}
	

		
	

}
