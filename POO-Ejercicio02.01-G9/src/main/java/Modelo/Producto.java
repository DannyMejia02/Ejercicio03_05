/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Producto {
    private int codigo;
    private String marca;
    private int precio;
    private String contenido;
    private String tamaño;

    public Producto(int codigo, String marca, int precio, String contenido, String tamaño) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.contenido = contenido;
        this.tamaño = tamaño;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", marca=" + marca + ", precio=" + precio + ", contenido=" + contenido + ", tama\u00f1o=" + tamaño + '}';
    }
    
    
    
}
