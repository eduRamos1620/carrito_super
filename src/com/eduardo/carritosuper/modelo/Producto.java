package com.eduardo.carritosuper.modelo;

//Se crea la clase padre Producto
public class Producto {
    protected String nombre; //Se crea la variable nombre
    protected Double precio; //Se crea la variable precio

    //Se crea el cosntructor Prducto
    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos get
    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}
