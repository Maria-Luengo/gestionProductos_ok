package com.ceep.domain;

import java.util.Scanner;

//es una clase a la que se agrega "Producto"
public class Orden {

    private final int idOrden;
    Producto productos[];
    private static int contadorOrdenes;
    private static int contadorProductos; //Buevo contador
    private final static int MAX_PRODUCTOS = 10;

    //constructores
    public Orden() {
        productos = new Producto[Orden.MAX_PRODUCTOS];
        this.idOrden = ++Orden.contadorOrdenes;
        Orden.contadorProductos = 0;
    }

    //metodos
    public void agregarProducto(Producto producto) {
        if (Orden.contadorProductos < Orden.MAX_PRODUCTOS) {
            productos[Orden.contadorProductos++] = producto;
        } else {
            System.out.println("Has alcanzado el máximo de productos por orden ("
                    + Orden.MAX_PRODUCTOS + ")");
        }
    }

    public double calcularTotal() {
        var resultado = 0.0;
        for (int i = 0; i < Orden.contadorProductos; i++) {
            resultado += productos[i].getPrecio();
        }
        return resultado;
    }

    public void mostrarOrden() {
        System.out.println("ID de orden: " + this.idOrden);
        for (int i = 0; i < Orden.contadorProductos; i++) {
            System.out.println("- Nombre producto " + i + ": " + productos[i].getNombre());
            System.out.println("- Precio producto " + i + ": " + productos[i].getPrecio());
        }
        System.out.println("TOTAL: " + calcularTotal());
        System.out.println("");
    }

}
