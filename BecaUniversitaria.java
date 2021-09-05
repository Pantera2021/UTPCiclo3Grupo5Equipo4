/* Programa Beca Universitaria */

public class BecaUniversitaria {
    
    // Atributos
    public int tiempo;
    public double monto;
    public double interes;

   
   // Constructor que recibe parametros
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres)
   {
    tiempo=pTiempo;
    monto=pMonto;
    interes=pInteres;
   }
 
    // Constructor que no recibe parametros
    public BecaUniversitaria()
   {
       tiempo =0;
       monto=0.0;
       interes=0.0;
    } 

   public double calcularInteresSimple()
   {
       //double valorIS=0;
       //valorIS=monto*((interes/100)*tiempo);
       //return valorIS;
       return monto*((interes/100)*tiempo);
   }

   public double calcularInteresCompuesto()
   {
    //double valorIC=0;
    // valorIC=monto*(Math.pow((1+(interes/100)),tiempo)-1);
    // return valorIC;
    return (monto*(Math.pow((1+(interes/100)),tiempo)-1));
   }
    
   public String compararInversion(int pTiempo, double pMonto, double pInteres)
   {
    double Diferencia=0;
    String Mensaje;
    // Mensaje = "  "   
    Diferencia = calcularInteresCompuesto()-calcularInteresSimple();
    if (Diferencia>0 )
    {
        Mensaje = "La diferencia entre la proyección de interés compuesto e interés simple es: $" + Diferencia;
    }
    else
    { 
        Mensaje="No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";    
    }
        return (Mensaje);
   }


    //public static void main(String[] args) throws Exception
    public static void main(String[] args) 
    {
        // Instanciamiento

        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple(60,13000.0,1.4));
        //System.out.println(becaUniversitaria.calcularInteresCompuesto());
        //System.out.println(becaUniversitaria.compararInversion(60,13000.0,1.4));

    }
}
