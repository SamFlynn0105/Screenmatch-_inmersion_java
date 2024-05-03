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
	
	public int Ecd(int dat4)
	{
		dat4 = teclado.nextInt();
		teclado.nextLine();
		return dat4;
	}
	
	public String Ecd(String dat5)
	{
		dat5 = teclado.nextLine();
		return dat5;
	}

}
