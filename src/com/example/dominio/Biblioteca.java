package com.example.dominio;

public class Biblioteca {
	
	private Imagen imagen;
	private Video video;
	private String nombre;
	
	public Biblioteca(Imagen imagen, Video video, String nombre) {
		super();
		this.imagen = imagen;
		this.video = video;
		this.nombre = nombre;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
