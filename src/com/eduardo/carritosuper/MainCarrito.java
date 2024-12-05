package com.eduardo.carritosuper;

import com.eduardo.carritosuper.modelo.*;

public class MainCarrito {
    public static void main(String[] args) {
        //Se crea el objeto de la clase Fruta
        BolsaSupermercado<Fruta> frutas = new BolsaSupermercado<>();
        //Se agregan las frutas a la lista
        frutas.addProducto(new Fruta("Fresa", 45.0, 3, "roja"));
        frutas.addProducto(new Fruta("Manzana", 15.0, 4, "verdad"));
        frutas.addProducto(new Fruta("Platano", 30.0, 5, "amarillo"));
        frutas.addProducto(new Fruta("Mango", 60.0, 3, "Amarillo"));
        frutas.addProducto(new Fruta("Sandia", 15.0, 6, "verde"));

        //Se recorre la lista para imprimir en consola
        for (Fruta f: frutas.getProductos()){
            System.out.println("La " + f.getNombre() + " " + f.getColor());
            System.out.println("Cuesta " + f.getPrecio() + " el kg");
            System.out.println("Y usted lleva " + f.getPeso() + "kg");
            System.out.println("==================================");
        }

        BolsaSupermercado<Limpieza> limpieza = new BolsaSupermercado<>();

        limpieza.addProducto(new Limpieza("escoba", 35.0, "palo y escoba", 0.0));
        limpieza.addProducto(new Limpieza("Cloro", 40.0, "Hipoclorito", 2.0));
        limpieza.addProducto(new Limpieza("Suavitel", 50.0, "suavizuante", 1.0));
        limpieza.addProducto(new Limpieza("jabon de manos", 15.0, "coco y miel", 0.500));
        limpieza.addProducto(new Limpieza("desengrasante", 60.0, "quita grasa", 1.0));

        for (Limpieza l: limpieza.getProductos()){
            System.out.println("La " + l.getNombre() + " de componentes " + l.getComponentes());
            System.out.println("Cuesta " + l.getPrecio() + " el L");
            System.out.println("Y usted lleva " + l.getLitros() + "L");
            System.out.println("==================================");
        }

        BolsaSupermercado<NoPerecible> noperecible = new BolsaSupermercado<>();

        noperecible.addProducto(new NoPerecible("atun", 35.0, 1, 28));
        noperecible.addProducto(new NoPerecible("frijoles", 40.0, 2, 25));
        noperecible.addProducto(new NoPerecible("maiz", 50.0, 1, 10));
        noperecible.addProducto(new NoPerecible("pasta", 15.0, 2, 50));
        noperecible.addProducto(new NoPerecible("frjol negro", 60.0, 3, 10));

        for (NoPerecible np: noperecible.getProductos()){
            System.out.println("La " + np.getNombre() + " con " + np.getContenido() + "g contenido");
            System.out.println("Cuesta " + np.getPrecio() + " el L");
            System.out.println("Y usted lleva " + np.getCalorias());
            System.out.println("==================================");
        }

        BolsaSupermercado<Lacteo> lacteo = new BolsaSupermercado<>();

        lacteo.addProducto(new Lacteo("leche", 35.0, 1, 28));
        lacteo.addProducto(new Lacteo("yogurt", 40.0, 2, 25));
        lacteo.addProducto(new Lacteo("licuado", 50.0, 1, 10));
        lacteo.addProducto(new Lacteo("queso", 15.0, 2, 50));
        lacteo.addProducto(new Lacteo("crema", 60.0, 3, 10));

        for (Lacteo l: lacteo.getProductos()){
            System.out.println("La " + l.getNombre() + " con " + l.getProteinas() + "g proteinas");
            System.out.println("Cuesta " + l.getPrecio() + " el L");
            System.out.println("Y usted lleva " + l.getCantidad());
            System.out.println("==================================");
        }
    }
}
