import java.util.Scanner;
public class datospersona{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // inicializa scanner
            String nombre;
            int edad;
            System.out.println("por favor digite nombre. ");
            nombre=sc.nextLine();
            System.out.println("Ingrese edad: ");
            edad=sc.nextInt();
            System.out.println("nombre: " + nombre);
            System.out.println("Edad: "+ edad);


            
        }

    }
}
