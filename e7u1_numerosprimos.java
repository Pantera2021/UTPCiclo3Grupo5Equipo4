import java.util.Scanner;
/*  Ejercicio No. 7 Unidad 1. Programa que determina si un numero ingresado por teclado es primo */
public class e7u1_numerosprimos {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                  // Define la captura de datos por teclado
        int numero;                                                           // Define la variable numero como entero    
        String esprimo = "";                                                       // Define la variable esprimo como entero
        char sigue = 'S';

        do
        {
            System.out.println("Digite Número: ");                            // Solicita en pantalla digitar el primer número
            numero=sc.nextInt();                                              // Captura en la variable numero1 lo digiatdo  
            int x=1;
            for (x=numero-1;x>=2;x--)
                if ((numero%x)==0) {
                   esprimo="Número es Compuesto";
                }
                else  {
                   esprimo="Número es Primo";
                }
            System.out.println(esprimo);                            // Solicita en pantalla digitar el primer número
            System.out.println("Continúa evaluando Números (S:Sí   N:No) ? ");                            // Solicita en pantalla digitar el primer número
            sigue = sc.next().charAt(0);                                              // Captura en la variable sigue lo digiatdo  
        }
        while ( sigue =='S' || sigue =='s');
    sc.close();
    }
}
