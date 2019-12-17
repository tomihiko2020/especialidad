package com.senati.clase02;


public class Especialidad extends Materia {
	String idEspecialidad;
	String Nombre;
	public Especialidad(String idEspecialidad, String nombre, String nobre_materia, String num_de_horas) {
		super(nobre_materia, num_de_horas);
		this.idEspecialidad = idEspecialidad;
		Nombre = nombre;
	}
	public String getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(String idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	@Override
	public String toString() {
		return "Especialidad [idEspecialidad=" + idEspecialidad + ", Nombre=" + Nombre + ", nobre_materia="
				+ nobre_materia + ", Num_de_horas=" + Num_de_horas + "]";
	}
	
	
}
