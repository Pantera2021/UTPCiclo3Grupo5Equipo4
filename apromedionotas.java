import java.util.Scanner;
/*  Ejercicio No. 2 Unidad 1. Programa que calcula promedio de 3 notas ingresadas por teclado. Si promedio de las notas >=3 Imprime en pantalla Aprobo. De lo contrario imprime 
en pantalla Reprobo. Se ingresa por teclado Nombre estudiante y las 3 notas. Requisitos: Las notas que se ingresan pueden tener decimales.
*/
public class apromedionotas {
    public static void main(String[] args) {
        // var sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);                // Define la entrada de datos por teclado
        double sumNotas=0;
        double notas=0;
        int NUM_NOTAS=3;

        System.out.println("Nombre estudiante: ");          // Solicita en pantalla digitar Nombre estudiante: 
        String name = sc.nextLine();
        
        // Captura en la variable estudiante el nombre digitado 
        for (int n=1; n<=NUM_NOTAS; n++) {
            System.out.print("Digite nota # " + n + " ...  ");
            notas=sc.nextDouble();
            sumNotas=sumNotas+notas;
        }
        if ((sumNotas/NUM_NOTAS)>=3.0) {                                //  Evalúa si promedio >=3.0
            System.out.println("Aprobado");         //  Si es verdadero Imprime en pantalla Aprobado
   
        }   
        else 
        {
            System.out.println("Reprobado");        //  Si no se cumple la condición Imprime en pantalla Reprobado    
        }   
   sc.close();


    }
}
