package screenmatch;

import modelo.calc_tiempo;
import modelo.pelicula;
import modelo.serie;

public class principal {
	
	public void muestraElMenu() {
		
		Ent_Sal_Sys ut = new Ent_Sal_Sys();
		pelicula pelusu = new pelicula();
		serie serieUsuario = new serie();
		calc_tiempo tiempoVisual = new calc_tiempo();
				
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
			
			case 2: {
				
				ut.Scd("Ingrese titulo de la serie: ");
				String nombre = ut.Ecd(null);
				ut.Scd("Ingrese fecha de lanzamiento: ");
				int fechaDeLanzamiento = ut.Ecd(0);
				ut.Scd("Ingrese tiempo de duracion minutos x episodio: ");
				int duracionxcap = ut.Ecd(0);
				ut.Scd("Ingrese numero de temporadas: ");
				int numeroTemporadas = ut.Ecd(0);
				ut.Scd("Ingrese episodios x temporadas: ");
				int episodiosxTemp = ut.Ecd(0);
				
				serieUsuario.setNombre(nombre);
				serieUsuario.setFechaLanzamiento(fechaDeLanzamiento);
				serieUsuario.setDuracionEnMinutos(duracionxcap);
				serieUsuario.setTemporadas(numeroTemporadas);
				serieUsuario.setEpisodiosPorTemporad(episodiosxTemp);
				//serieUsuario.setEvalUsuario(4.5);
				serieUsuario.muestraFichaTecSerie();
				tiempoVisual.calculoTiempo(duracionxcap,numeroTemporadas,episodiosxTemp);
				
				//ut.Scd(serieUsuario.getEvalUsuario());
				
				break;
			}
			
			case 9: {
				ut.Scd("Salimos del programa...");
                break;			
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		
		}
		
	}

}
