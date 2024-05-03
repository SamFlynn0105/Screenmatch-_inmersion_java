package screenmatch;

import modelo.pelicula;

public class principal {
	
	public void muestraElMenu() {
		
		Ent_Sal_Sys ut = new Ent_Sal_Sys();
		pelicula pelusu = new pelicula();
				
		int opcion = 0;
		
		while (opcion != 9)
		{
			String menu = """
					Bienvenido a Screenmatch
					1.- Registrar nueva pelicula
					2.- Registrar Serie
					
					9.- Salir
					""";
			ut.Scd(menu);
			opcion = ut.Ecd(opcion);
			
			switch (opcion) {
			case 1: {
				
				ut.Scd("Ingrese titulo de la pelicula: ");
				String nombre = ut.Ecd(null);
				ut.Scd("Ingrese fecha de lanzamiento: ");
				int fechaDeLanzamiento = ut.Ecd(0);
				ut.Scd("Ingrese la duracion en minutos: ");
				int duracionEnMinutos = ut.Ecd(0);
				
				pelusu.setNombre(nombre);
				pelusu.setFechaLanzamiento(fechaDeLanzamiento);
				pelusu.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
				pelusu.muestraFichaTec();
				
				break;
			}
			
			case 9: {
				ut.Scd("Salimos del programa...");
                break;			
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		    opcion = 0;	
		}
		
	}

}
