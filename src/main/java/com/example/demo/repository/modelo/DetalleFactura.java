package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="detalle_factura")
public class DetalleFactura {
	
	@GeneratedValue(generator ="seq_detalle_factura",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_detalle_factura",sequenceName = "seq_detalle_factura",allocationSize = 1)
	@Id
	@Column(name = "dfac_id")
	private Integer id;
	
	@Column(name = "dfac_precio_uni")
	private BigDecimal precioUni;
	
	@Column(name = "dfac_subtotal")
	private BigDecimal subtotal;
	
	@OneToMany
	@JoinColumn(name="dfac_id_prod")
	private List<Producto>productos;
	
	@OneToOne
	@JoinColumn(name="dfac_id_fac")
	private Factura factura;
	
	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", precioUni=" + precioUni + ", subtotal=" + subtotal + "]";
	}


	//get y set 
	
	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	public Factura getFactura() {
		return factura;
	}


	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public BigDecimal getPrecioUni() {
		return precioUni;
	}


	public void setPrecioUni(BigDecimal precioUni) {
		this.precioUni = precioUni;
	}


	public BigDecimal getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	
	
	

}
