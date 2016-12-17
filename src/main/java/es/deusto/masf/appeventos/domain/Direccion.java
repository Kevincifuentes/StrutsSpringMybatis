package es.deusto.masf.appeventos.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Direccion {
	
	private int idDIRECCIONES;
	private String direccion;
	private int codigoPostal;
	private String provincia;
	private String ciudad;
	private String idUsuario;
	
	public Direccion(){
		
	}
	
	public Direccion(String direccion, int codigoPostal, String provincia, String ciudad, String idUsuario) {
		super();
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.idUsuario = idUsuario;
	}

	public Direccion(int id, String direccion, int codigoPostal, String provincia, String ciudad, String idUsuario) {
		super();
		this.idDIRECCIONES = id;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.idUsuario = idUsuario;
	}
	public int getId() {
		return idDIRECCIONES;
	}
	public void setId(int id) {
		this.idDIRECCIONES = id;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	

}
