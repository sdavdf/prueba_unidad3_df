package com.uce.edu.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.modelo.Producto;

@Service
public class GestorSupermercadoServiceImpl implements IGestorSupermercadoService{

	@Autowired
	private IVentaService iVentaService;
	
	@Autowired
	private IDetalleVentaService iDetalleVentaService;
	
	@Autowired
	private IProductoService iProductoService;
	
	@Override
	@Transactional
	public void ingresarProducto(Producto producto, Integer Stock) {
		// TODO Auto-generated method stub
		Producto produc = this.iProductoService.buscarPorCodigoBarras(producto.getCodigoBarras());
		if(produc == null) {
			producto.setStock(Stock);
			this.iProductoService.insertar(producto);
		}else {
			produc.setStock(produc.getStock()+1);
			this.iProductoService.actualizar(producto);
		}
	}

	@Override
	public void realizarVenta(List<Producto> produ, String cedulaCliente, String numeroVenta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public Producto consultarStock(String codigoBarras) {
		
		Producto p = this.iProductoService.buscarPorCodigoBarrasNative(codigoBarras);
		return p;
	}
	
//	@Override
//	public void realizarVenta(, String cedulaCliente, String numeroVenta) {
		// TODO Auto-generated method stub
//		try {
////			Producto venta = this.iProductoRepository.buscar(cant
//		}
//		
//	}





//	@Override
//	public void realizarVenta(String codigoBarras, Integer cantidad, String cedulaCliente, String numeroVenta) {
//		// TODO Auto-generated method stub
//		
//	}
	
	
	
}
