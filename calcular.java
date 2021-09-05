import java.util.Scanner;
/* Programa que calcula el doble y el triple de un número ingresado por teclado */

public class calcular {
    
    // Atributos
    public double capital;
    public double intereses;
    public int tiempo;


    // Constructores
    public calcular()
   {
       this.capital=0;
       this.intereses=0;
       this.tiempo =0;
   } 

   public calcular(double pcapital, double pintereses, int ptiempo)
   {
     this.capital=pcapital;
     this.intereses=pintereses;
     this.tiempo=ptiempo;
   }
 
   public double CalValorFuturo()
   {
       double valorFuturo=0;
       valorFuturo=capital*(Math.pow((1+(intereses/100)),tiempo));
       return valorFuturo;
   }

   public double CalValorPresente()
   {
    double valorPresente=0;
    valorPresente=capital/(Math.pow((1+(intereses/100)),tiempo));
    return valorPresente;
   }
    
    public static void main(String[] args) throws Exception
    {
        // Instanciamiento

        calcular resultadoInversionF = new calcular(2000000.0,5.0,10);
        System.out.println("Valor Futuro $ "+resultadoInversionF.CalValorFuturo());
        calcular resultadoInversionP = new calcular(2000000.0,5.0,10);
        System.out.println("Valor Presente $ "+resultadoInversionP.CalValorPresente());

    }
}
