package com.example.dominio;

public class Fijo extends Telefono{
	
	private int prefijo, cuerpo;

	public Fijo(int codArea, int prefijo, int cuerpo) {
		super(codArea);
		this.prefijo = prefijo;
		this.cuerpo = cuerpo;
	}

	public int getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(int prefijo) {
		this.prefijo = prefijo;
	}

	public int getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(int cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	
}
