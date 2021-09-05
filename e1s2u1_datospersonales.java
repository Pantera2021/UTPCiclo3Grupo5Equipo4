import java.util.Scanner;   // 
import java.text.SimpleDateFormat;
import java.util.Date;
/*  Ejercicio No. 1 Semana No. 2 Unidad 1. Datos personales. Programa que calcula promedio de 3 notas ingresadas por teclado. Si promedio de las notas >=3 Imprime en pantalla Aprobo. De lo contrario imprime 
en pantalla Reprobo. Se ingresa por teclado Nombre estudiante y las 3 notas. Requisitos: Las notas que se ingresan pueden tener decimales.
*/
public class e1s2u1_datospersonales {
    public static void main(String[] args) {
        // var sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);                // Define la entrada de datos por teclado
        System.out.println("Nombre estudiante: ");          // Solicita en pantalla digitar Nombre estudiante: 
        String name = sc.nextLine();
        System.out.println("Introduzca la fecha de nacimiento con formato dd/mm/yyyy");
        String fecha = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fechanacimiento = null;
        String date = fecha;
        fechanacimiento = df.parse(date);
         
    }
}
/*import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Prueba {
    public static void main (String[]args) {
 
        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        Scanner sc = new Scanner(System.in);
        String fecha = sc.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date testDate = null;
        String date = fecha;
        try{
            testDate = df.parse(date);
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+testDate);
        } catch (Exception e){ System.out.println("invalid format");}
 
        if (!df.format(testDate).equals(date)){
            System.out.println("invalid date!!");
        } else {
            System.out.println("valid date");
        }
 
    }
}*/


/*//pasa la fecha de String a Date para la fecha leida por teclado
  private static Date convertirFechaLectura(String fecha){
                        //Formato de la fecha a convertir
   SimpleDateFormat formato = new SimpleDateFormat("MM/yyyy");
   Date dat = null;
   try{
    dat=formato.parse(fecha);
   }catch(ParseException ex){
    
   }
   return dat;
  }

 
//leer entradas del teclado
 private static void lecturaTeclado(){
  Scanner lee=new Scanner(System.in);//lector
  System.out.println("formato fecha "
    + "MM/yyyy -Ej.:03/2016: ");
  String fl=lee.next();//leer fecha
  fechaTeclado = convertirFechaLectura(fl);//pasar fecha a date
 }



FORMATO DE FECHAS:
Dentro del SimpleDateFormat puedes meter la forma en la que introduces la fecha.
Ejemplo:
"yyyyy-mm-dd hh:mm:ss"
y - dígito del año.
m - dígito del mes en formato numérico.
d - dígito del día del mes (si el día es por ejemplo el 1 se introducirá como 01)
h - dígito de la hora del día
m - dígito del minuto
s - dígito del segundo

Dependiendo del SampleDateFormat el formato del Date es distinto:
   String date_s = " 2011-01-18 00:00:00.0";
   SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd hh:mm:ss");
   Date date = dt.parse(date_s);
   SimpleDateFormat dt1 = new SimpleDateFormat("yyyyy-mm-dd");
   System.out.println(dt1.format(date));
*/
