package vista;

import java.text.DecimalFormat;
import java.text.ParseException;
import modelo.Nperecedero;
import modelo.Perecedero;
import modelo.Producto;

public class Consola {
    public  static void main (String[] args) throws ParseException{
        
       DecimalFormat df = new DecimalFormat("#.0");
        
       Perecedero ListaProductos[] = new Perecedero[5];
       Nperecedero ListaProductosN[] = new Nperecedero[5];
       
       System.out.println("--------- PRODUCTOS PERECEDEROS ---------");
       
       for(int i=0;i<ListaProductos.length;i++){
           
           ListaProductos[i] = new Perecedero();
           ListaProductos[i].setNombre("producto perecedero "+(i+1));
           ListaProductos[i].setPrecio(Math.random()*100000+5000);
           System.out.println("\nEl precio total del" + ListaProductos[i].getNombre()+" es: "+df.format(ListaProductos[i].Calcular(2))+"$ pesos");
       }
       
       System.out.println("\n--------- PRODUCTOS NO PERECEDEROS ---------");
       
       for(int i=0;i<ListaProductosN.length;i++){
           ListaProductosN[i]=new Nperecedero();
           ListaProductosN[i].setNombre("producto no perecedero "+(i+1));
           ListaProductosN[i].setPrecio(Math.random()*100000+5000);
           System.out.println("\nEl precio total del" + ListaProductosN[i].getNombre()+" es: "+df.format(ListaProductosN[i].Calcular(2))+"$ pesos");
       }

    }
    
}