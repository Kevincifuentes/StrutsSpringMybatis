package es.deusto.masf.appeventos.services;

import org.springframework.beans.factory.annotation.Autowired;

import es.deusto.masf.appeventos.domain.Direccion;
import es.deusto.masf.appeventos.domain.Usuario;
import es.deusto.masf.appeventos.mappers.PedidosMapper;
import es.deusto.masf.appeventos.mappers.UsuariosMapper;

public class UsuariosService {
	
	@Autowired
    UsuariosMapper usuariosMapper;
	
	public Usuario loginUsuario(String username){
		return usuariosMapper.loginUsuario(username);
	}
	 public void updateUsuario(Usuario user) throws Exception{
		 usuariosMapper.updateUsuario(user);
	 }
	
	 public Direccion obtenerDireccion(String username){
		 return usuariosMapper.obtenerDireccion(username);
	 }

	public void insertarDireccion(Direccion dir){
		usuariosMapper.insertarDireccion(dir);
	}
	public void updateDireccion(Direccion dir) throws Exception{
		usuariosMapper.updateDireccion(dir);
	}
	
	public void insertarUsuario(Usuario usr){
		usuariosMapper.insertarUsuario(usr);
	}

}
