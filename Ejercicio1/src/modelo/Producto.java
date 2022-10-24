package modelo;

import java.text.ParseException;

public abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto() {
        this.precio = 5000;
        this.nombre = "Producto ";
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
    
    public abstract double Calcular(int numero)throws ParseException;
    
}
