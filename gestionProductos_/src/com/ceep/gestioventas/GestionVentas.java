package com.ceep.gestioventas;

import com.ceep.domain.*;

public class GestionVentas {

    public static void main(String[] args) {
        // Objetos PRODUCTOS
        Producto p1 = new Producto("Galetas", 3.5);
        Producto p2 = new Producto("Chocolate", 3);
        Producto p3 = new Producto("Pastas", 4.75);

        Orden o1 = new Orden();//Objeto ORDEN
        o1.agregarProducto(p3);
        o1.agregarProducto(p2);
        o1.agregarProducto(p1);
        o1.mostrarOrden();

        Orden o2 = new Orden(); //OJO!! SI DECLARO ANTES DA ERROR!!
        o2.agregarProducto(p3);
        o2.agregarProducto(p3);
        o2.agregarProducto(p3);
        o2.mostrarOrden();
        
        Orden o3 = new Orden();
        o3.agregarProducto(p3);
        o3.agregarProducto(p2);
        o3.agregarProducto(p1);
        o3.agregarProducto(p3);
        o3.agregarProducto(p2);
        o3.agregarProducto(p1);
        o3.agregarProducto(p3);
        o3.agregarProducto(p2);
        o3.agregarProducto(p1);
        o3.agregarProducto(p3);
        o3.agregarProducto(p2);
        o3.agregarProducto(p1);
        o3.mostrarOrden();
    }
}
