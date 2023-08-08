package com.example.demo.service;

import java.time.LocalDate;


public interface IDetalleFacturaService{

	public void generarReporte(LocalDate fechaFac,String cateforia);
}
