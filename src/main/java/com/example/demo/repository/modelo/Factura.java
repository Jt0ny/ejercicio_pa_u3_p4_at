package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
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
@Table(name="factura")
public class Factura {

	@GeneratedValue(generator ="seq_factura",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_factura",sequenceName = "seq_factura",allocationSize = 1)
	@Id
	@Column(name = "fact_id")
	private Integer id;
	
	@Column(name = "fact_fecha")
	private LocalDate fecha;
	
	@Column(name = "fact_cedula_cli")
	private String cedulaCli;
	
	@Column(name = "fact_total_fac")
	private BigDecimal totalFac;
	
	@OneToOne(mappedBy = "factura",cascade = CascadeType.ALL)
	private DetalleFactura detalleFactura;
	
	
	@OneToMany
	@JoinColumn(name="fac_id_prod")
	private List<Producto>productos;
	
	
	public List<Producto> getProductos() {
		return productos;
	}


	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}


	@Override
	public String toString() {
		return "Factura [id=" + id + ", fecha=" + fecha + ", cedulaCli=" + cedulaCli + ", totalFac=" + totalFac + "]";
	}


	//get y set 
	
	public Integer getId() {
		return id;
	}



	public DetalleFactura getDetalleFactura() {
		return detalleFactura;
	}


	public void setDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFactura = detalleFactura;
	}


	public void setId(Integer id) {
		this.id = id;
	}



	public LocalDate getFecha() {
		return fecha;
	}



	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}



	public String getCedulaCli() {
		return cedulaCli;
	}



	public void setCedulaCli(String cedulaCli) {
		this.cedulaCli = cedulaCli;
	}



	public BigDecimal getTotalFac() {
		return totalFac;
	}



	public void setTotalFac(BigDecimal totalFac) {
		this.totalFac = totalFac;
	}
	
	
	
}
