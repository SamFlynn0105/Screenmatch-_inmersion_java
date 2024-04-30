package screenmatch;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ent_Sal_Sys ut = new Ent_Sal_Sys();
		
		ut.Scd("Bienvenidos a la inmersion en Java");
		//ut.icd("Pelicula Matrix");
		
		int fechaDeLanzamiento = 1999;
		double evaluacion = 4.5;
		boolean IcluidoEnElPlanBasico = true;
		String nombre = "Matrix";
		@SuppressWarnings("unused")
		String sinopsis = """
				la mejor pelicula del fin del milenio
				""";
		
		double mediaEvaluacionUsuario = 0;
		ut.Scd("Pelicula: " + nombre);
		ut.Scd(fechaDeLanzamiento);
		ut.Scd(evaluacion);
		ut.Scd(IcluidoEnElPlanBasico);
		
		double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
		ut.Scd("Media Evluacion: " + mediaEvaluacion);
		
		if (fechaDeLanzamiento >= 2023)
		{
			ut.Scd("Pelicula actual");
		} 
		else {
			ut.Scd("Pelicula retro");
		}
		
		for (int i = 0; i < 3; i++)
		{
		    ut.Scd("ingresa la evaluacion para la pelicula: ");
		    double notaMatrix = ut.Ecd(0);
		    mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
		    
		}
		
		ut.Scd("Calificacion media usuario");
		double mediacalc = mediaEvaluacionUsuario / 3;
		ut.Scd(mediacalc);
		

	}

}
