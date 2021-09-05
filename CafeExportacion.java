  
public class CafeExportacion extends Cafe{ 
    // Constantes  
    private final static Integer  CIF_BASE = 20;
    // Atributos
    private Integer  cif;
    private boolean  verde;

    //Constructor 
    public CafeExportacion(){ 
        // Código 
        this(PRECIO_BASE, PESO_BASE, CALIDAD_C_BASE, CIF_BASE, false);
    } 
    
    public CafeExportacion(Double precioBase, Integer peso){ 
        // Código 
        this(precioBase, peso, CALIDAD_C_BASE, CIF_BASE, false);
        //super(precioBase, peso);
        //this.calidadC = CALIDAD_C_BASE;
        //this.cif = cif;
        //this.verde = verde;
    } 
    
    public CafeExportacion(Double precioBase, Integer peso, char calidadC, Integer cif, boolean verde){ 
        // Código 
        super(precioBase, peso, calidadC);
        this.cif = cif;
        this.verde = verde;
    } 
    
    // Métodos 
    public Double calcularPrecio(){ 
        // Código 
        Double adicion=super.calcularPrecio();
        if (verde){
            adicion +=50.0;
         }
         Double precioBase=super.getPrecioBase();
         if (cif>40){
            adicion += precioBase*0.30;
         }
         //System.out.println("Cafe Exportación:  " + precio); 
         return adicion;

    } 
}






