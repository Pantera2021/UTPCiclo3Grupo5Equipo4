import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*  Ejercicio No. 9 Unidad 1. Programa que calcula salario para diferentes edades */
public class e9u1_salarios {
    public static void main(String[] args) throws IOException {   //Notar que readLine() nos obliga a declarar IOException
            Scanner sc = new Scanner(System.in);                                      // Habilita entrada por teclado
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Habilita entrada por teclado

        String mensaje = " ";                                      // Define vriable mensaje     
        int edad;                                                  // Define variable edad
        float salario=0;                                           // Define variable salario

        System.out.println("Por favor ingrese su nombre: ");          //Solicita en pantalla Ingreso del nombre
        String nombre = br.readLine();                              //Guarda en variable nombre el ingreso por teclado
        System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad: ");//Solicita en pantalla Ingreso de edad
        edad = sc.nextInt();                                        // Guarda en variable edad el ingreso por teclado
        System.out.println("Favor digitar Salario: ");              
        salario=sc.nextFloat();                                     // Ingresa Salario por teclado

        if (edad<16) {                                              //  Evalúa edad para menores de edad
                mensaje="No tiene edad para trabajar";              // Guarda resultado en variable mensaje
            } 
        if (edad>=19&&edad<=50) {                                   //  Evalúa edad para rango 19-50
                mensaje="Su Salario es " + (salario*1.05);          // Guarda resultado en variable mensaje
        } 
        if (edad>=51&&edad<= 60) {                                  //  Evalúa edad para rango 51-60
            mensaje="Su Salario es " + (salario*1.10);              // Guarda resultado en variable mensaje
        } 
        if (edad>60) {                                              //  Evalúa edad para mayores a 60
            mensaje="Su Salario es " + (salario*1.15);              // Guarda resultado en variable mensaje
        } 
        System.out.println(mensaje);
        sc.close();
    }
}



