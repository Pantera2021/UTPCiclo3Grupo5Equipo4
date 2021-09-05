import java.util.Scanner;
/*  Ejercicio No. 3 Unidad 1. Programa que calcula sueldo de trabajador. Ingresa por teclado el número de horas trabajadas en el mes. La hora se paga a $30.000 */

public class e3u1_sueldo {     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Define la captura de datos por teclado

        int horasmes;  // Define la variable horasmes como entero
        System.out.println("Digite el número de horas trabajadas en el mes: ");
        horasmes = sc.nextInt();
        System.out.println("Salario mes =  " + (horasmes*30000));   // muestra el calculo de horasmes * 30.000 (sueldo mensual)
        sc.close();
    }
}
