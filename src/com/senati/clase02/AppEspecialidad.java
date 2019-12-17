package com.senati.clase02;

public class AppEspecialidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Especialidad especialidad1 = new Especialidad("111","Ciencias","matematicas","2");
		Especialidad especialidad2 = new Especialidad("112","Letras","Lenguaje","1");
		Especialidad especialidad3 = new Especialidad("113","Artes","Dibujo","2");
		
		System.out.println(especialidad1.toString());
		System.out.println(especialidad2.toString());
		System.out.println(especialidad3.toString());
	}

}
