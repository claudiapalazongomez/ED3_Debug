package es.studium.debug;

public class Ejercicio1
{

	public static void main(String[] args)
	{		
		boolean esCierto = false;
		while(esCierto == true) //breakpoint en esta línea (debemos poner un = más para compararlo, porque la respuesta del while debe ser true or false, no una asignación)
		{
		System.out.println("Pues sí que es cierto");
		}
		System.out.println("Pues no que es cierto");
	}

}
