package es.studium.debug;

import java.util.Scanner;

public class SumaFuncion
{

	public static void main(String[] args)
	{
		//Error en tiempo de compilaci�n por un par�ntesis de m�s
		Scanner teclado = new Scanner(System.in);
		int num1,num2;
		System.out.println("Indicar un n�mero:");
		num1 = teclado.nextInt();
		System.out.println("Indicar otro n�mero:");
		num2 = teclado.nextInt();
		teclado.close();
		System.out.println("La suma de los dos n�meros es:" +suma(num1,num2)); //le asignamos el breakpoint y lo ejecutamos en modo depurador
	}

	public static int suma (int a,int b)
	{
		return a+b;
	}
	
}
