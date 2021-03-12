package com.tarea.poo;

public class PersonaTarea {
	String Nombre;
	String Apellido;
	String Signo;
	String Sexo;
	
	//Método Constructor
	public PersonaTarea(String nombre, String apellido, String signo, String sexo) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Signo = signo;
		Sexo = sexo;
	}

	//Método Gets y Sets
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getSigno() {
		return Signo;
	}

	public void setSigno(String signo) {
		Signo = signo;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	@Override
	public String toString() {
		return "PersonaTarea [Nombre=" + Nombre + ", Apellido=" + Apellido + ", Signo=" + Signo + ", Sexo=" + Sexo
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


