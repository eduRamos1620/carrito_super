package com.eduardo.carritosuper.modelo;

//Se crea la clase hija Frutas que hereda de Productos
public class Fruta extends Producto{
    private double peso;
    private String color;

    //Se crea el constructor con los atributos de la clase padre y la hija
    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
