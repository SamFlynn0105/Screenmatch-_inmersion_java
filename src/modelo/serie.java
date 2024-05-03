package modelo;

public class serie extends titulo {
	
	private int temporadas;
	private int episodiosPorTemporad;
	private int duracionEnMinutos;
	
	@Override
	public int getTiempoDeDuracionEnMinutos() {
		// TODO Auto-generated method stub
		return duracionEnMinutos * episodiosPorTemporad * temporadas;
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
	public int getDuracionEnMinutos() {
		return duracionEnMinutos;
	}
	public void setDuracionEnMinutos(int duracionEnMinutos) {
		this.duracionEnMinutos = duracionEnMinutos;
	}
	
	
}
