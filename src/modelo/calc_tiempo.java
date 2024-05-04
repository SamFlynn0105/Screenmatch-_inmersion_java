package modelo;

import screenmatch.Ent_Sal_Sys;

public class calc_tiempo extends serie {
	
	
	public void calculoTiempo(int durmin, int temp, int capxtem) {
		Ent_Sal_Sys ut = new Ent_Sal_Sys();
	    	
		int tiempoVisualMin = durmin * temp * capxtem;
		
		int i = 0, horas = 0, dias = 0, contador = 0;
		
		for (i=1;i <= tiempoVisualMin;i++)
		{
			if (contador == 60)
			{
				horas++;
				contador = 0;
			}
			
			if (horas == 24)
			{
				dias++;
				horas = 0;
			}
			contador++;
		}
		
		ut.Scd("Para ver esta serie completa el tiempo necesario es:");
		ut.Scd(dias + " Dias, " + horas + " horas, " + contador + " minutos.");
		ut.Scd("");
        		
	}
}