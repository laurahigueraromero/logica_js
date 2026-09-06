package java;

import java.util.Scanner;

public class Main {

    // Ejercicio 1 (Básico):
    // Escribe un método que reciba un número entero y devuelva si es
    // positivo, negativo o cero.

public static String tipoNumero(int numero) {
    String tiponumero;
    if (numero == 0) {
        tiponumero = "El número es cero";
    } else if (numero > 0) {
        tiponumero = "El número es positivo";
    } else {
        tiponumero = "El número es negativo";
    }
    return tiponumero;
}

    // Ejercicio 2 (Básico):
    // Escribe un método que reciba un número entero y calcule su
    // factorial (por ejemplo, factorial de 5 es 5*4*3*2*1 = 120).

    public static int factorial(int numero) {

        int numeroFactorial = 1;

        for (int i = 1; i <= numero; i++) {

            numeroFactorial = numeroFactorial * i;

        }

        return numeroFactorial;

    }

    // Ejercicio 3 (Intermedio):
    // Escribe un método que reciba un array de números enteros y
    // devuelva la suma de todos los que sean múltiplos de 3 o de 5.

    public static int arrayDeNumeros(int[] numeros) {

        int multiplo = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % 3 == 0 || numeros[i] % 5 == 0) {

                multiplo += numeros[i];

            }

        }

        return multiplo;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ejercicio 1: Ingrese un número entero para determinar si es positivo, negativo o cero:");
        int numero = sc.nextInt();
        String resultadoTipoNumero = tipoNumero(numero);
        System.out.println(resultadoTipoNumero);    



       

    }

}
