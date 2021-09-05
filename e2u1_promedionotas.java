import java.util.Scanner;
 /*  Ejercicio No. 2 Unidad 1. Programa que calcula promedio de 3 notas ingresadas por teclado. Si promedio de las notas >=3 Imprime en pantalla Aprobo. De lo contrario imprime */
public class e2u1_promedionotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // Define la entrada de datos por teclado
        System.out.print("Digite Número  : ");         // Solicita en pantalla digitar Nota 1
        int numero = sc.nextInt();
        switch (numero) {
               case 1:
                    System.out.println("Enero");         // Solicita en pantalla digitar Nota 2
                    break;
                case 2:
                    System.out.println("Febrero");         // Solicita en pantalla digitar Nota 2
                    break;
                case 3:
                    System.out.println("Marzo");         // Solicita en pantalla digitar Nota 2
                    break;
                case 4:
                    System.out.println("Abril");         // Solicita en pantalla digitar Nota 2
                    break;
                case 5:
                    System.out.println("Mayo");         // Solicita en pantalla digitar Nota 2
                    break;
                case 6:
                    System.out.println("Junio");         // Solicita en pantalla digitar Nota 2
                    break;
                case 7:
                    System.out.println("Julio");         // Solicita en pantalla digitar Nota 2
                    break;
                case 8:
                    System.out.println("Agosto");         // Solicita en pantalla digitar Nota 2
                    break;
                case 9:
                    System.out.println("Septiembre");         // Solicita en pantalla digitar Nota 2
                    break;
                case 10:
                    System.out.println("Octubre");         // Solicita en pantalla digitar Nota 2
                    break;
                case 11:
                    System.out.println("Noviembre");         // Solicita en pantalla digitar Nota 2
                    break;
                case 12:
                    System.out.println("Diciembre");         // Solicita en pantalla digitar Nota 2
                    break;
                default: 
                    System.out.println("Mes fuera de rango");         // Solicita en pantalla digitar Nota 2
                    break;
        }
        sc.close();
    }
}
