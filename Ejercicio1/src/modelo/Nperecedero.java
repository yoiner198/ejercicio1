package modelo;

public class Nperecedero extends Producto{
    protected double iva;

    public Nperecedero() {
        this.iva = 15;
    }

    public Nperecedero(double iva) {
        this.iva = iva;
    }

    public Nperecedero(double iva, String nombre, double precio) {
        super(nombre, precio);
        this.iva = iva;
    }

    @Override
    public double Calcular(int numero) {
        
        this.iva = this.iva/100;
        super.precio = (numero*super.precio);
        super.precio =super.precio+(super.precio*this.iva);
        
        return super.precio;
        
    }
    
 
    
}
