// package java;

import java.util.Random;
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

    // Ejercicio 4 (Básico):
    // Escribe un método que reciba un número entero y devuelva si es
    // par o impar.

    // Ejercicio 5 (Básico):
    // Escribe un método que reciba un número entero y devuelva si es
    // un número primo o no.

    // Ejercicio 6 (Básico):
    // Escribe un método que genere un array de números aleatorios y
    // devuelva cuál es el número mayor.

    public static int numMayor() {
        Random rd = new Random();
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rd.nextInt(100);
        }

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }





    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     * lo resuelvan automáticamente.
     */

    public static void contarPalabras() {

        Scanner sc = new Scanner(System.in);

        // que ingresen las palabras
        System.out.println("ingresa las palabras");
        // guardamos las palabras
        String[] inputs = sc.nextLine().split(" ");

        int cantidadPalabras = inputs.length;

        if (cantidadPalabras <= 1) {
            System.out.println("Ingresaste solo una palabra, no se puede comparar con otra.");
            return; // Termina el método temprano de forma segura
        }

        int i = 0;
        String[] palabras = inputs;
        String[] palabrasActuales = palabras;
        for (i = 0; i < cantidadPalabras; i++) {

            // System.out.println(palabrasActuales[i]);

            if (palabrasActuales[i] != null) {
                int contador = 1;
                String palabraActual = palabrasActuales[i];

                for (int j = i + 1; j < cantidadPalabras; j++) {

                    if (palabrasActuales[i].equalsIgnoreCase(palabrasActuales[j])) {
                        contador++;
                        palabrasActuales[j] = null;

                    }

                }

                if (contador > 1) {
                    System.out.println("La palabra '" + palabraActual + "' se repite " + contador + " veces.");
                } else {
                    System.out.println("La palabra '" + palabraActual + "' no se repite.");
                }

            }

        }

    }

    public static void main(String[] args) {

        System.out.println("El numero mayor generado aleatoriamente es: " + numMayor());

        contarPalabras();

    }

}
