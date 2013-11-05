package com.example.dominio;

import java.sql.Date;

public class Comentario {
	
	private int puntuacion;
	private String comentario, usuario;
	private Date fecha;
	
	public Comentario(int puntuacion, String comentario, String usuario,
			Date fecha) {
		super();
		this.puntuacion = puntuacion;
		this.comentario = comentario;
		this.usuario = usuario;
		this.fecha = fecha;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
