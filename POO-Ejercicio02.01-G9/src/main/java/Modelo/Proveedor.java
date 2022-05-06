/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.logging.Logger;

/**
 *
 * @author marisolzhizhpon
 */
public class Proveedor {
    private int codigo;
    private String empresa;
    private String transporte;
    private int venta;
    private Producto producto;

    public Proveedor(int codigo, String empresa, String transporte, int venta, Producto producto) {
        this.codigo = codigo;
        this.empresa = empresa;
        this.transporte = transporte;
        this.venta = venta;
        this.producto = producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigo=" + codigo + ", empresa=" + empresa 
                + ", transporte=" + transporte + ", venta=" + venta 
                + ", producto=" + producto + '}';
    }

    
    
    
    
}
