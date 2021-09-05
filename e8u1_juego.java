import java.util.Scanner;
/* Ejercicio 8 Unidad 1. Programa que juega Piedra Papel y Tijera */

public class e8u1_juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                                    // Define la captura de datos por teclado
        String quiengana = "";                                                  // Define la variable quiengana
        char letrajg1 = ' ';                                                    // Define la variable letrajg1 
        char letrajg2 = ' ';                                                    // Define la variable letrajg2
        char sigue = 'S';                                                       // Define la variable letrajg2
        System.out.println("Piedra(P) Papel(L) y Tijera(T)");

        do                                                                      // Inicia ciclo de juego
        {
            System.out.print("Jugador 1 vamos  =>   ");
            letrajg1 = Character.toUpperCase(sc.next().charAt(0));  // Ingresa letra por teclado Jugador1. Convierte a Mayúscula y guarda en letrajg1
            System.out.print("Jugador 2 dale   =>   ");
            letrajg2 = Character.toUpperCase(sc.next().charAt(0));  // Ingresa letra por teclado Jugador2. Convierte a Mayúscula y guarda en letrajg2

            if (letrajg1=='P' || letrajg1 =='p') {                  // Evalua juego para jugador 1 con P
                switch (letrajg2)                                   // Estructura Switch para jugador 2 
                { 
                  case 'P': 
                     quiengana="Empate"; 
                     break; 
                  case 'L': 
                     quiengana="Gana Jugador 2"; 
                     break; 
                  case 'T': 
                     quiengana="Gana Jugador 1"; 
                     break; 
                }
            }

            if (letrajg1=='L' || letrajg1 =='l') {                  // Evalua juego para jugador 1 con L
                switch (letrajg2)                                   // Estructura Switch para jugador 2
                { 
                  case 'P': 
                     quiengana="Gana Jugador 1"; 
                     break; 
                  case 'L': 
                     quiengana="Empate"; 
                     break; 
                  case 'T': 
                     quiengana="Gana Jugador 2"; 
                     break; 
                }
            }

            if (letrajg1=='T' || letrajg1 =='t') {                   // Evalua juego para jugador 1 con T
                switch (letrajg2)                                    // Estructura Switch para jugador 2
                { 
                  case 'P': 
                     quiengana="Gana Jugador 1"; 
                     break; 
                  case 'L': 
                     quiengana="Gana Jugador 1"; 
                     break; 
                  case 'T': 
                     quiengana="Empate"; 
                     break; 
                }
            }
            System.out.println(quiengana);                             // Imprime en pantalla resultado juego
            System.out.println("Continúan Jugando (S:Sí   N:No) ? ");  // Pregunta si continua con el juego
            sigue = Character.toUpperCase(sc.next().charAt(0));        // Ingresa respuesta por teclado y lo guarda en Mayúscula en variable sigue 
        }
        while ( sigue =='S');                                          // Retorna al ciclo mientras sea verdadero
     sc.close();
    }
}   
   