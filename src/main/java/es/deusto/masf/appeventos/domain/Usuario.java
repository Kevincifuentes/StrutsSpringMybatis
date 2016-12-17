package es.deusto.masf.appeventos.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Usuario {
	
	private String username;
	private int tipo;
	private String password;
	private String email;
	
	public Usuario() {
		
	}
	
	
	
	public Usuario(String username, int tipo, String password, String email) {
		super();
		this.username = username;
		this.tipo = tipo;
		this.password = password;
		this.email = email;
	}



	public Usuario(String usuario, int tipo, String password) {
		super();
		this.username = usuario;
		this.tipo = tipo;
		this.password = password;
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
