import java.util.Scanner;
import java.util.Random;
/*  Ejercicio No. 5 Unidad 1. Programa que genera número aleatorio entre 1 y 100. Por teclado usuario ingresa número y cundo sea igual finaliza programa.
Si el número ingresao es mayor que aleatorio que imprima "Número buscado menor". De lo contrario que imprima "Número buscado es mayor" */
public class e5u1_aleatorio {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                  // Define la captura de datos por teclado
		int min = 1;                                                          // Define variable min cómo límite mínimo para generar aleatorio 
		int max = 100;                                                        // Define variable max cómo límite máximo para generar aleatorio
		Random random = new Random();                                         // Habilita función Random
		int aleatorio = random.nextInt(max + min) + min;                      // Genera número aleatorio entre min y max  y lo guarda en variable aleatorio

        int numerodigitado;                                                   // Define la variable numerodigitado como entero
        int x=1;
        while (x == 1)
        {
            System.out.println("Digite Número:");                              // Solicita en pantalla que digite el número
            numerodigitado=sc.nextInt();                                       // Guarda en variable numerodigitado el ingreso por teclado
            if (numerodigitado<aleatorio) {                                    // Evalúa si numerodigitado < que aleatorio
                System.out.println("El número que busca es Mayor");            // Imprime en pantalla que aleatorio es Mayor
            }  
            if (numerodigitado>aleatorio) {                                    // Evalúa si numerodigitado > que aleatorio
                System.out.println("El número que busca es Menor");            // Imprime en pantalla que aleatorio es Menor 
            }  
            if (numerodigitado==aleatorio) {                                   // Evalúa si numerodigitado =  que aleatorio
                System.out.println("Felicitaciones... Acertó");                // Imprime en pantalla que acerto
                x=0;                                                           // Iguala x a cero para salir del while
            }  
        }
        sc.close();
    }
}
