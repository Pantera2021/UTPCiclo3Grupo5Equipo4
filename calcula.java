import java.util.Scanner;
/* Programa que calcula el doble y el triple de un número ingresado por teclado */

public class calcula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre estudiante: ");
        String estudiante = sc.next();
        int dato;
        System.out.println("Digite n•mero: ");
        dato=sc.nextInt();
        int doble = dato * 2;
        int triple = dato * 3;
        System.out.println("El doble de " + dato + " es " + doble);
        System.out.println("El triple de " + dato + " es " + triple);

    }
}
