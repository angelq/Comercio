package com.example.dominio;

public class Imagen extends Biblioteca {
	
	private int id;
	private String nombre;
	
	public Imagen(Imagen imagen, Video video, String nombre, int id,
			String nombre2) {
		super(imagen, video, nombre);
		this.id = id;
		nombre = nombre2;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
