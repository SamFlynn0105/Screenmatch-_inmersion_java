package screenmatch;

import java.util.Scanner;

public class Ent_Sal_Sys {
	
	Scanner teclado = new Scanner(System.in);
	
	public void Scd(String Cad1) 
	{
		System.out.println(Cad1);
		
	}
	
	public void Scd(int dat) 
	{
		System.out.println(dat);
	    
	}
	
	public void Scd(double dat1) 
	{
		System.out.println(dat1);
	    
	}
	
	public void Scd(boolean dat2) 
	{
		System.out.println(dat2);
	}
	
	public double Ecd(double dat3)
	{
		dat3 = teclado.nextDouble();
		return dat3;
	}

}
