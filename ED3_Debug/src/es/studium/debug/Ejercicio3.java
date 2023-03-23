package es.studium.debug;

public class Ejercicio3
{

	public static void main(String[] args)
	{
		String mensaje = "Las veces que se ha ejecutado el bucle son: ";
		int contador = 1;
		while (contador < 100) 
		{
			System.out.println(mensaje + contador);
			contador++;
		}
	}

}
