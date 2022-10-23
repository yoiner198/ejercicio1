package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author conmu
 */
public class Perecedero extends Producto{
    protected String fCaducacion;
    protected Date fActual;
    protected int dias;

    public Perecedero() {
        this.fCaducacion="25/10/2022";
        
    }


    public Perecedero(String fCaducacion, Date fActual, int dias, String nombre, double precio) {
        super(nombre, precio);
        this.fCaducacion = fCaducacion;
        this.fActual = fActual;
        this.dias = dias;
    }

    public String getfCaducacion() {
        return fCaducacion;
    }

    public void setfCaducacion(String fCaducacion) {
        this.fCaducacion = fCaducacion;
    }

    public Date getfActual() {
        return fActual;
    }

    public void setfActual(Date fActual) {
        this.fActual = fActual;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
     

    @Override
    //El error esta en este metodo
    public double Calcular(int numero) throws ParseException {
        
        SimpleDateFormat fecha = new SimpleDateFormat("dd/mm/yyyy");
        Calendar calendario = Calendar.getInstance();
        Date fActual = calendario.getTime();
 
        String fechaActual = fecha.format(fActual);
        Date fechahoy = fecha.parse(fechaActual);
        Date fechav = fecha.parse(this.fCaducacion);
        
        long calc = fechahoy.getTime()-fechav.getTime();
        TimeUnit unidad = TimeUnit.DAYS;
        this.dias = (int)unidad.convert(calc, TimeUnit.MILLISECONDS);
        
        super.precio = (numero*super.precio);
        
        switch(this.dias){
         case 1:
               super.precio=(super.precio/4);
             break;
         case 2:
             super.precio=(super.precio/3);
             break;
         case 3:
             super.precio=(super.precio/2);
             break;
         default:
             break;
             
        }  

        return super.precio;
    }
    
    
    
}
