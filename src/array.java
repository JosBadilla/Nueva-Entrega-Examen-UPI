
import java.util.ArrayList;


public class array {
    private static ArrayList<String> codigo = new ArrayList<String>();
  private static ArrayList<String> cantidad = new ArrayList<String>();
  private static ArrayList<String> descripcion = new ArrayList<String>();
   private static ArrayList<Float> precio = new ArrayList<Float>();
  public static String Cantidad_Ropa;
  public static String Descripcion_Ropa;
  public static float Precio_Ropa;
    
    public array(){
     codigo.clear();
     cantidad.clear();
     descripcion.clear();
     precio.clear();
    }

    
    public static void BuscarPlaca(String nplaca){
    
     for (int i = 0; i < codigo.size(); i++) {
           if (nplaca.equals(codigo.get(i)))
           {
             Cantidad_Ropa = cantidad.get(i);
             Descripcion_Ropa = descripcion.get(i);
             Precio_Ropa = precio.get(i);
             break;
           }
        }
    }
    
    public static void getcodigo(String codigo) {
       
      
    }

    public static void getcantidad() {
         
    }

    public static void getprecio() {
       
    }
    public static void getdescripcion() {
       
    }
    public static void setcodigo(String vcodigo) {
      codigo.add(vcodigo);
    }

    public static void setcantidad(String vcantidad) {
       cantidad.add(vcantidad);
    }
    
      public static void setprecio(float vprecio) {
       precio.add(vprecio);
    }
       public static void setdescripcion(String vdescripcion) {
       descripcion.add(vdescripcion);
    
       
    
    
}
}
