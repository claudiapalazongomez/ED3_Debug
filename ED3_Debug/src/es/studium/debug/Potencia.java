package es.studium.debug;

import java.util.Scanner;

public class Potencia
{

	public static void main(String[] args)
	{
		//Error en tiempo de compilación por un paréntesis de más (error de sintaxis). Si no lo hacemos, no podemos ejecutarlo
		Scanner teclado = new Scanner(System.in);
		int base, exp, i;
		int resultado=1;
		System.out.println("Indicar el valor de la base:");
		base = teclado.nextInt();
		System.out.println("Indicar el valor del exponente:");
		exp = teclado.nextInt();
		teclado.close();
		for (i=1;i<=exp;i++)
		{
		resultado=resultado*base; //la ejecución se para en la línea en la que ponemos el breakpoint
		} //si le damos a Step Over cuando tenemos un breakpoint, ejecuta esa línea (le podemos dar las veces que queramos y vemos como se comporta el bucle)
		System.out.println("El número "+base+" elevado a "+exp+" es igual a "+resultado);

	}

}
