import java.util.Scanner;
/*  Ejercicio No. 10 Unidad 1. Programa que calcula la serie fibonacci para un numero ingresado por teclado */
public class e10u1_fibonacci {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                  // Define la captura de datos por teclado
        int numero;                                                           // Define la variable numero como entero    
        int x=0;                                                              // Define la variable x como entero  
        int y=1;                                                              // Define la variable y como entero  
        int z=0;                                                              // Define la variable z como entero  
        System.out.println("Digite Número: ");                            // Solicita en pantalla digitar el primer número
        numero=sc.nextInt();                                              // Captura en la variable numero lo digiatdo  

        System.out.println(x);                                            // Imprime en pantalla primer número de la serie 0  
        do                                                                // Ingresa al ciclo while
        {
           z=(y+x);                                                       // Calcula z
           System.out.println(y);                                         // Imprime en pantalla y
           x=y;                                                           // Guarda en x valor de y
           y=z;                                                           // Guarda en z valor de y
        }
        while (z<numero);                                                 // retorna al ciclo mientras sea verdadero  
    sc.close();
    }
}
