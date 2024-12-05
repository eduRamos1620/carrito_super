package com.eduardo.carritosuper.modelo;

//Se crea la clase Limpieza que hereda de Producto
public class Limpieza extends Producto{
    private String componentes;
    private double litros;

    //Se crea el constructor con los atributos de la clase padre y la hija
    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }
}
