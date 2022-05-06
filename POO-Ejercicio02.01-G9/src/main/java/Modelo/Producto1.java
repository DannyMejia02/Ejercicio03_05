/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Producto1 {
    private int codigo;
    private String marca;
    private int precio;
    private String contenido;
    private Factura factura;

    public Producto1(int codigo, String marca, int precio, String contenido, Factura factura) {
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.contenido = contenido;
        this.factura = factura;
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

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    @Override
    public String toString() {
        return "Producto1{" + "codigo=" + codigo + ", marca=" + marca 
                + ", precio=" + precio + ", contenido=" + contenido 
                + ", factura=" + factura + '}';
    }
    
    
    
}
