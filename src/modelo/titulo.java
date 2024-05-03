package modelo;

import screenmatch.Ent_Sal_Sys;

public class titulo {

	Ent_Sal_Sys ut = new Ent_Sal_Sys();
	private String nombre;
	private int fechaLanzamiento;
	private double evaluacion;
	private boolean incluidoEnElPlanBasico;
	private String sinopsis;
	private int tiempoDeDuracionEnMinutos;
	
	public void muestraFichaTec()
	{
		ut.Scd("****Ficha Tecnica****");
		ut.Scd("Nombre del Titulo: " + nombre);
	    ut.Scd("Lanzamiento: " + fechaLanzamiento);
	    ut.Scd("Duracion: " + getTiempoDeDuracionEnMinutos() + " min");	
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(int fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

	public double getEvaluacion() {
		return evaluacion;
	}


	public boolean isIncluidoEnElPlanBasico() {
		return incluidoEnElPlanBasico;
	}

	public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
		this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getTiempoDeDuracionEnMinutos() {
		return tiempoDeDuracionEnMinutos;
	}

	public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
		this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
	}
}
