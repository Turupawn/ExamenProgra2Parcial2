import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class ClasePadre
{
	String getNombreClase()
	{
		return "Soy tipo ClasePadre";
	}
}

class ClaseHijoA
{
}

class ClaseHijoB
{
}

public class Ejercicios
{
	
	//Devuelve a divido entre b, si b es cero devuelve 0.
	//Sugerencia: Usar try catch
	//3 puntos
	static int dividir(int a, int b)
	{
		return -1;
	}
	
	//Escribe la tabla del 7 en un archivo con nombre "path"
	//4 puntos
	static void escribirTablaDe7(String path)
	{
	}
	
	//Devuelve cuantas veces existe el numero num_buscar en un archivo
	//4 puntos
	static int cuantasVecesExiste(String path,int num_buscar)
	{
		return -1;
	}
	
	
	//Implementar las clases en la parte superior de este archivo y la funcion siguiente de modo que:
	//Si la clase es de tipo "ClasePadre" devuelve: "Soy tipo ClasePadre"
	//Si la clase es de tipo "ClaseHijoA" devuelve: "Soy tipo ClaseHijoA"
	//Si la clase es de tipo "ClaseHijoB" devuelve: "Soy tipo ClaseHijoB"
	//4 puntos
	static String getNombreClase(ClasePadre p)
	{
		return p.getNombreClase();
	}
	
	public static void main(String args[])
	{
		int arreglo[] = new int[6];
		System.out.print(arreglo.length);
	}
}
