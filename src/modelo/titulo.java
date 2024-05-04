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
	private int duracionEnMinutos;
	private int temporadas;
	private int episodiosPorTemporad;
	
	public void muestraFichaTec()
	{
		ut.Scd("****Ficha Tecnica****");
		ut.Scd("Nombre del Titulo: " + nombre);
	    ut.Scd("Lanzamiento: " + fechaLanzamiento);
	    ut.Scd("Duracion: " + getTiempoDeDuracionEnMinutos() + " min");	
	}
	
	public void muestraFichaTecSerie()
	{
		ut.Scd("****Ficha Tecnica Serie****");
		ut.Scd("Nombre del Titulo: " + nombre);
	    ut.Scd("Lanzamiento: " + fechaLanzamiento);
	    ut.Scd("Duracion x espisodio: " + duracionEnMinutos + " min");	
	    ut.Scd("Numero de temporadas: " + temporadas);
	    ut.Scd("Numero episodios x temporada: " + episodiosPorTemporad);
	    ut.Scd("Duracion total episodios x temporada: " + getTiempoDeDuracionEnMinutos() + " min");	
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
	
	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}

	public void setDuracionEnMinutos(int duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getEpisodiosPorTemporad() {
		return episodiosPorTemporad;
	}

	public void setEpisodiosPorTemporad(int episodiosPorTemporad) {
		this.episodiosPorTemporad = episodiosPorTemporad;
	}
}
