
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class arraylist {
     static ArrayList<String> codigo  = new ArrayList<>();
   static ArrayList<Boolean> activo  = new ArrayList<>();
   static ArrayList<Integer> precio  = new ArrayList<>();
   static ArrayList<String> cantidad  = new ArrayList<>();
   static int SiActivo, NoActivo;
   static int consecutivo;

    static void setSiActivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setNoActivo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public arraylist() {
          consecutivo = 1;
          SiActivo = 0;
          NoActivo = 0;
    }
    
    public arraylist(String nombre) {}
    
    public static void Buscarporcodigo( String Nombre){
        
        Boolean encontrado = false;
        String actvo="No esta activo";
        for (int i = 0; i < arraylist.codigo.size(); i++) 
        {
            
            if (arraylist.codigo.get(i).toLowerCase().equals(Nombre.toLowerCase())) 
            {
                encontrado = true;
                if ( arraylist.activo.get(i)) {
                    String ropa = "Si esta activo";
                }
               JOptionPane.showMessageDialog(null, "codigo: " +arraylist.codigo.get(i) +  "c:\\temp\\articulo\\  : \" + precio: " + arraylist.activo.get(i) + "c:\\temp\\articulo\\  : " + precio + "c:\\temp\\articulo\\  : " + cantidad);
               break;
            }
           
        }
                 if (!encontrado) JOptionPane.showMessageDialog(null, "NO existe");
    }

    
    public static int getConsecutivo() {
        return consecutivo;
    }
   
    
    public   void setConsecutivo() {
        arraylist.consecutivo ++;
    }
    
     public    void setConVehiculo() {
        arraylist.SiActivo ++;
    }
    
      public   void setSinVehiculo() {
       arraylist.NoActivo ++;
    }
      
       public static  int getConVehiculo() {
        return SiActivo;
    }

public static  int getSinVehiculo() {
        return NoActivo;
    }
    
    public void SetSalvarDatos(String codigo, boolean activo, int precio, String cantidad )
    {
        codigo.add(codigo);
        activo.add(activo);
        precio.add(precio);
        cantidad.add(cantidad);
    }
    
    
    
}
