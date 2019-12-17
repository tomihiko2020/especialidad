package com.senati.clase02;

public class Materia {
	String nobre_materia;
	String Num_de_horas;
	public Materia(String nobre_materia, String num_de_horas) {
		super();
		this.nobre_materia = nobre_materia;
		Num_de_horas = num_de_horas;
	}
	public String getNobre_materia() {
		return nobre_materia;
	}
	public void setNobre_materia(String nobre_materia) {
		this.nobre_materia = nobre_materia;
	}
	public String getNum_de_horas() {
		return Num_de_horas;
	}
	public void setNum_de_horas(String num_de_horas) {
		Num_de_horas = num_de_horas;
	}
	@Override
	public String toString() {
		return "Materia [nobre_materia=" + nobre_materia + ", Num_de_horas=" + Num_de_horas + "]";
	}
	
}
