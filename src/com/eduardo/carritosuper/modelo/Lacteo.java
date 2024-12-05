package com.eduardo.carritosuper.modelo;

//Se crea la clase Lacteo que hereda de Producto
public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;

    //Se crea el constructor con los atributos de la clase padre y la hija
    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
