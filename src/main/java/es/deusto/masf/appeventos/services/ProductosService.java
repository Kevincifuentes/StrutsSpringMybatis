package es.deusto.masf.appeventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.deusto.masf.appeventos.domain.Producto;
import es.deusto.masf.appeventos.mappers.PedidosMapper;
import es.deusto.masf.appeventos.mappers.ProductosMapper;

public class ProductosService {
	
	@Autowired
    ProductosMapper productoMapper;
	
	public List<Producto> getProductos(){
		return productoMapper.getProductos();
	}

}
