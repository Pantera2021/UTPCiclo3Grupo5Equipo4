import java.util.Scanner;
/*  Ejercicio No. 1 Unidad 1. Programa que suma, resta, multiplica y divide dos números ingresados por teclado */

public class e1u1_operaciones {     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Define la captura de datos por teclado

        int numero1;  // Define la variable Numero1 como entero
        int numero2;  // Define la variable Numero1 como entero

        System.out.println("Digite Primer Número: ");   // Solicita en pantalla digitar el primer número
        numero1=sc.nextInt();                           // Captura en la variable numero1 lo digiatdo  
        System.out.println("Digite Segundo Número: ");  // Solicita en pantalla digitar el primer número
        numero2 = sc.nextInt();                         // Captura en la variable numero2 lo digiatdo

        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + ( numero1 + numero2) );         // Muestra en pantalla el resultado de la suma
        System.out.println("La diferencia entre " + numero1 + " y " + numero2 + " es " + (numero1 - numero2) ); // Muestra en pantalla la diferecia

        System.out.println("El producto de " + numero1 + " por " + numero2 + " es " + (numero1 * numero2) );    // Muestra en pantalla el producto
        System.out.println("El cociente entre  " + numero1 + " y " + numero2 + " es " + (numero1 / numero2) );  // Muestra en pantalla el cociente
        sc.close();
    }
}
