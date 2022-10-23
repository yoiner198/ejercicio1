package vista;

import java.text.ParseException;
import modelo.Nperecedero;
import modelo.Perecedero;
import modelo.Producto;

public class Consola {
    public  static void main (String[] args) throws ParseException{
        
       //Producto ListaProductos[] = new Producto[5];
       Perecedero ListaProductos[] = new Perecedero[1];
       Nperecedero ListaProducto[] = new Nperecedero[1];
       
       ListaProductos[0]=new Perecedero();
       ListaProducto[0]=new Nperecedero();


       double suma=0;
       for(int i=0;i<ListaProductos.length;i++){
           suma=ListaProductos[i].Calcular(5);
           System.out.println("El precio tatal de productos es: "+suma);
       }
        
      
      
    }
    
}