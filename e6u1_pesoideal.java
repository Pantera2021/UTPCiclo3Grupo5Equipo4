import java.util.Scanner;
/*  Ejercicio No. 6 Unidad 1. Programa que calcula peso ideal para hombre y mujer. Solicita sexo y altura en cm por teclado. Calcula peso ideal
Peso ideal Hombres: altura - 110    Peso ideal Mujeres: altura - 120 */
public class e6u1_pesoideal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Define la entrada de datos por teclado

        System.out.print("Ingrese Género  (Femenino 'F'   Masculino 'M') => :   ");  // Solicita en pantalla digitar Sexo 
        char genero = Character.toUpperCase(sc.next().charAt(0)); // Captura genero pr teclado. Character.toUpperCase() convierte respuesta a Mayúscula 
        System.out.print("Digite su Estatura en cm => :   ");     // Solicita en pantalla digitar Estatura
        int estatura = sc.nextInt();                              // Guarda en variable estatura lo ingresado por teclado

        int menos = 0;
        if (genero =='M') {                      // Evalúa genero
                menos=110;                       // Asignaa menos valor a restar para hombres
        } 
        if (genero == 'F')  {                    // Evalúa genero
                menos=120;                       // Asignaa menos valor a restar para mujeres
        } 
        System.out.println("Su Peso ideal es  =>    "+(estatura-menos)+ " Kg");  // Imprime en pantalla Peso ideal
        sc.close();
    } 
}