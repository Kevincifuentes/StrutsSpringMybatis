package es.deusto.masf.appeventos.mappers;

import java.io.Reader;
import java.util.List;

import es.deusto.masf.appeventos.domain.Direccion;
import es.deusto.masf.appeventos.domain.Usuario;

public interface UsuariosMapper {

	 Usuario loginUsuario(String username);
	 void updateUsuario(Usuario user) throws Exception;
	
	 Direccion obtenerDireccion(String username);

	void insertarDireccion(Direccion dir);
	void updateDireccion(Direccion dir) throws Exception;
	
	void insertarUsuario(Usuario usr);

}
