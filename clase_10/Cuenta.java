package clase_10;

import clase_10.Persona;

public class Cuenta {
    private Persona titular;
    private double cantidad;

    public Cuenta() {
        // Constructor vacío
    }

    public Cuenta(Persona titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    // Setters y Getters
    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Método mostrar()
    public void mostrar() {
        System.out.println("Titular: " + titular.getNombre());
        System.out.println("Cantidad: " + cantidad);
    }

    // Método ingresar()
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método retirar()
    public void retirar(double cantidad) {
        this.cantidad -= cantidad;
    }
}
