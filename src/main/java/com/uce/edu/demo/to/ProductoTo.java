package com.uce.edu.demo.to;

public class ProductoTo {
	
	private String codigo;
	private String nombre;
	private String categoria;
	private Integer stock;
	
	public ProductoTo() {
		// TODO Auto-generated constructor stub
	}	
	
	public ProductoTo(String codigo, String nombre, String categoria, Integer stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.categoria = categoria;
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "ProductoTo [codigoBarras=" + codigo+ ", nombre=" + nombre + ", categoria=" + categoria
				+ ", stock=" + stock + "]";
	}

	// SET y GET
	public String getCodigoBarras() {
		return codigo;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigo= codigoBarras;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	
}
