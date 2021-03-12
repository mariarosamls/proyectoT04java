package com.tarea.poo;

public class Profesor extends PersonaTarea{
	String Dni;
	String Grado;
	String Especialidad;
	
	public Profesor(String nombre, String apellido, String signo, String sexo, String dni, String grado,
			String especialidad) {
		super(nombre, apellido, signo, sexo);
		Dni = dni;
		Grado = grado;
		Especialidad = especialidad;
	}


	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

	public String getGrado() {
		return Grado;
	}

	public void setGrado(String grado) {
		Grado = grado;
	}

	public String getEspecialidad() {
		return Especialidad;
	}

	public void setEspecialidad(String especialidad) {
		Especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Profesor [Dni: " + Dni + ", Grado: " + Grado + ", Especialidad: " + Especialidad + ", Nombre: " + Nombre
				+ ", Apellido: " + Apellido + ", Signo: " + Signo + ", Sexo: " + Sexo + "]";
	}
	
	
	
	
	
}
