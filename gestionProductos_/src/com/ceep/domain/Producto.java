package com.ceep.domain;
//Un producto se agrega a una orden

public class Producto {

    private final int idProducto; //final para que no varíe 
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //constructores
    public Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this();//referencia la contructor vacío
        this.nombre = nombre;
        this.precio = precio;
    }

    //G&S
    public int getIdProducto() {
        return this.idProducto; //se puede poner el this por buena práctica
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" idProducto: ").append(idProducto);
        sb.append("\n nombre: ").append(nombre);
        sb.append("\n precio: ").append(precio);
        System.out.println("");
        return sb.toString();
    }

}
