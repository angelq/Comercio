package com.example.dominio;

public class Comercio {
	
	private String nombre, descripcion, categoria, rubro;
	private Puntuacion puntuacion;
	private Contacto contacto;
	private Comentario comentario;
	private Biblioteca biblioteca;
	private String localizacion;
	private Horario horario;
	
	public Comercio(String nombre, String descripcion, String categoria,
			String rubro, Puntuacion puntuacion, Contacto contacto,
			Comentario comentario, Biblioteca biblioteca, String localizacion,
			Horario horario) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.rubro = rubro;
		this.puntuacion = puntuacion;
		this.contacto = contacto;
		this.comentario = comentario;
		this.biblioteca = biblioteca;
		this.localizacion = localizacion;
		this.horario = horario;
	}
	
	public Comercio(String nombre, String descripcion){
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getRubro() {
		return rubro;
	}

	public void setRubro(String rubro) {
		this.rubro = rubro;
	}

	public Puntuacion getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(Puntuacion puntuacion) {
		this.puntuacion = puntuacion;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public Comentario getComentario() {
		return comentario;
	}

	public void setComentario(Comentario comentario) {
		this.comentario = comentario;
	}

	public Biblioteca getBiblioteca() {
		return biblioteca;
	}

	public void setBiblioteca(Biblioteca biblioteca) {
		this.biblioteca = biblioteca;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
}
