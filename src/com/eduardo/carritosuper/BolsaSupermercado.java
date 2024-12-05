package com.eduardo.carritosuper;

import java.util.ArrayList;
import java.util.List;

//Se crea la clase de tipo generica <T>
public class BolsaSupermercado<T> {
    private List<T> productos; //Se crea la lista para guardar los productos
    private int idProducto; // variables del id del producto
    private int max=5; //Se declara el maximo de tamaño para la lista

    //Se crea el constructor de clase
    public BolsaSupermercado() {
        this.productos = new ArrayList(); //Se inicializa la lista de productos como tipo arraylist
    }

    //metodo get de la lsita de productos
    public List<T> getProductos() {
        return productos;
    }

    //se crea el metodo para agregar productos a la lista
    public void addProducto(T p){
        //Se valida que la lista no exeda el tamaño permitido
        if (this.productos.size() <= max){
            this.productos.add(p);
        }else{ //Si excede el tamaño se manda un mensaje de que no hay mas espacio
            throw new RuntimeException("no hay mas espacio");
        }
    }
}
