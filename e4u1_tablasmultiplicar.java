import java.util.Scanner;
/*  Ejercicio No. 4 Unidad 1. Programa que calcula la tabla de multiplicar (del 0 al 10) del número ingresado por teclado  */

public class e4u1_tablasmultiplicar {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Define la captura de datos por teclado

        int tablanumero;  // Define la variable tablanumero como entero
        System.out.println("Digite la Tabla del que ? ");
        tablanumero = sc.nextInt();
        
        System.out.println("Tabla del " + tablanumero);

        for (int x = 0; x<= 10; x++)
            System.out.println(tablanumero + " x " + x + " = " + ( tablanumero * x ));
        sc.close();            
    }
}
