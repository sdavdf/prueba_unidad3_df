package com.uce.edu.demo.repository.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="detalle")
public class DetalleVenta {

	@Id
	@Column(name="dell_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator ="dell_id_seq" )
	@SequenceGenerator(name="dell_id_seq", sequenceName = "dell_id_seq", allocationSize =1 )
	private Integer id;
	
	@Column(name="dell_cantidad")
	private Integer cantidad;
	
	@Column(name="dell_precio_unitario")
	private BigDecimal precioUnitario;
	
	@Column(name="dell_subtotal")
	private BigDecimal subtotal;
	
	@Column(name="dell_id_venta")
	private String idVenta;
	
	@Column(name="dell_id_producto")
	private String idProducto;
	
	@ManyToOne
	@JoinColumn(name = "deta_id_venta")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name = "deta_id_producto")
	private Producto producto;
	
	// SET y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public String getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}

	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	
	
}
