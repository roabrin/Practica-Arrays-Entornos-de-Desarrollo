package Util;

import java.util.Arrays;

public class MisArrays {

	public class Notas {
	    
	    
	}
	/**
	 * Estos son metodos que van a devolver diferentes funciones
	 * @param array
	 * @return devuelve un int que es la media de todos los numeros
	 */

	public static int mediaNotas(int[] array) {
		int sum = 0;
        for (int nota : array) {
            sum += nota;
        }
        return sum / array.length;
    }
	/**
	 * medianaNotas -Recibe un array de números enteros entre 0 y 10 y devuelve en un float la mediana con decimales de dicho array.
	 * @param array
	 * @return
	 */
	
	 public static int medianaNotas(int[] array) {
	        Arrays.sort(array);
	        int mediana;
	        int totalNotas = array.length;
	        if (totalNotas % 2 == 0) {
	            mediana = ((int)array[totalNotas/2] + (int)array[totalNotas/2 - 1])/2;
	        } else {
	            mediana = (int) array[totalNotas/2];
	        }
	        return mediana;
	    }
	 
	 
	 public static int maximaNota(int[] array) {
	        int max = array[0];
	        for (int nota : array) {
	            if (nota > max) {
	                max = nota;
	            }
	        }
	        return max;
	    }
	 
	 public static int minimaNota(int[] array) {
	        int min = array[0];
	        for (int nota : array) {
	            if (nota < min) {
	                min = nota;
	            }
	        }
	        return min;
	    }
	 
}

