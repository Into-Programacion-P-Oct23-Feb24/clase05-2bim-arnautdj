/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        System.out.println("Ingrese el tamaño del arreglo");
        int tamanio = entrada.nextInt();
        int[]arreglo=new int[tamanio];
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("Ingrese el valor %d del arreglo\n", i+1);
            arreglo[i]=entrada.nextInt();
        }
        System.out.printf("La suma de los valores del arreglo es: %d\n",
                misterio(arreglo, arreglo.length));
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
