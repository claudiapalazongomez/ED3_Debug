package es.studium.debug;

public class Ejercicio1
{

	public static void main(String[] args)
	{		
		boolean esCierto = false;
		while(esCierto == true) //breakpoint en esta l�nea (debemos poner un = m�s para compararlo, porque la respuesta del while debe ser true or false, no una asignaci�n)
		{
		System.out.println("Pues s� que es cierto");
		}
		System.out.println("Pues no que es cierto");
	}

}
