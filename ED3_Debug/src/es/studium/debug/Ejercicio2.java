package es.studium.debug;

public class Ejercicio2
{

	public static void main(String[] args)
	{
		int a = 3;
		int b = 6;
		int c = 8;
		int d, e;
		d = suma(a, b);
		e = multiplicar(b, c); //breakpoint
		for(int i = 0; i < 10; i++)
		{
			a = i * 2 - e; //breakpoint
		}
	}

	private static int multiplicar(int operador1, int operador2)
	{
		int resultado = 0;
		for(int i = 0; i < operador2; i++)
		{
			resultado = suma(resultado, operador1);
		}
		return resultado;
	}
	private static int suma(int sumando1, int sumando2)
	{
		int resultado = sumando1 + sumando2;
		return resultado;
	}


}
