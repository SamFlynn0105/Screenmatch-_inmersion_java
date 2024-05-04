package modelo;

public class serie extends titulo {
	
	private double evalUsuario;
	
	@Override
	public int getTiempoDeDuracionEnMinutos() {
		// TODO Auto-generated method stub
	    return getDuracionEnMinutos() * getEpisodiosPorTemporad() * getTemporadas();
	}
	

	public double getEvalUsuario() {
		return evalUsuario;
	}


	public void setEvalUsuario(double evalUsuario) {
		this.evalUsuario = evalUsuario;
	}
	
	
}
