package es.deusto.masf.appeventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import es.deusto.masf.appeventos.domain.Pedido;
import es.deusto.masf.appeventos.domain.Producto;
import es.deusto.masf.appeventos.mappers.EventosMapper;
import es.deusto.masf.appeventos.mappers.PedidosMapper;

public class PedidosService {
	
	@Autowired
    PedidosMapper pedidosMapper;
	
	public List<Pedido> getPedidosId(String id){
		return pedidosMapper.getPedidosId(id);
	}
	
	public List<Producto> getProductosPedido(int num){
		return pedidosMapper.getProductosPedido(num);
	}

	public void cancelarPedido(Pedido cat){
		 pedidosMapper.cancelarPedido(cat);
	}
	
	public void insertarPedido(Pedido ped){
		pedidosMapper.insertarPedido(ped);
	}
	
	public void insertarProductoPedido(Producto p, int idPedido){
		pedidosMapper.insertarProductoPedido(p, idPedido);
	}

}
