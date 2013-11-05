package com.example.dominio;

public class Horario {
	
	private String diasSemana, hora, turno;

	public Horario(String diasSemana, String hora, String turno) {
		super();
		this.diasSemana = diasSemana;
		this.hora = hora;
		this.turno = turno;
	}

	public String getDiasSemana() {
		return diasSemana;
	}

	public void setDiasSemana(String diasSemana) {
		this.diasSemana = diasSemana;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
}
