package com.eduardo.carritosuper.modelo;

//Se crea la clase NoPerecible que hereda de Producto
public class NoPerecible extends Producto{
    private int contenido;
    private int calorias;

    //Se crea el constructor con los atributos de la clase padre y la hija
    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
