/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Factura {
    private int codigo;
    private String nombreProducto;
    private int precioProducto;
    private int iva;
    private int total;

    public Factura(int codigo, String nombreProducto, int precioProducto, int iva, int total) {
        this.codigo = codigo;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.iva = iva;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(int precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", iva=" + iva + ", total=" + total + '}';
    }
    
    
    
}
