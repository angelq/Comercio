package com.example.dominio;

public class Contacto {
	
	private String mail, nombre, apellido, pagWeb;
	private Telefono telefono;
	
	public Contacto(String mail, String nombre, String apellido, String pagWeb,
			Telefono telefono) {
		super();
		this.mail = mail;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pagWeb = pagWeb;
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPagWeb() {
		return pagWeb;
	}

	public void setPagWeb(String pagWeb) {
		this.pagWeb = pagWeb;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	
	
	
}
