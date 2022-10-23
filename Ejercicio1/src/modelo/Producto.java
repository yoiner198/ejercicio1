package modelo;

import java.text.ParseException;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto() {
        this.precio = 5000;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double Calcular(int numero)throws ParseException{
        return 0;
    }
    
}
