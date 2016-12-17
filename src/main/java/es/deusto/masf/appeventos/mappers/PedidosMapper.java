package es.deusto.masf.appeventos.mappers;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionException;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import es.deusto.masf.appeventos.domain.Pedido;
import es.deusto.masf.appeventos.domain.Producto;

public interface PedidosMapper {


	List<Pedido> getPedidosId(String id);
		
	List<Producto> getProductosPedido(int num);

	void cancelarPedido(Pedido cat);
	
	void insertarPedido(Pedido ped);
	
	void insertarProductoPedido(Producto p, int idPedido);

}
