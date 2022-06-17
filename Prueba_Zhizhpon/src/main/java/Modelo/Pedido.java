/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marisolzhizhpon
 */
public class Pedido {
    
    private int codigo;
    private String nombreDelSolicitante;
    private int cantidadSolicitadas;
    private int plazosDeEntrega;
    private String FormaDePedido;

    public Pedido(int codigo, String nombreDelSolicitante, int cantidadSolicitadas, int plazosDeEntrega, String FormaDePedido) {
        this.codigo = codigo;
        this.nombreDelSolicitante = nombreDelSolicitante;
        this.cantidadSolicitadas = cantidadSolicitadas;
        this.plazosDeEntrega = plazosDeEntrega;
        this.FormaDePedido = FormaDePedido;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreDelSolicitante() {
        return nombreDelSolicitante;
    }

    public void setNombreDelSolicitante(String nombreDelSolicitante) {
        this.nombreDelSolicitante = nombreDelSolicitante;
    }

    public int getCantidadSolicitadas() {
        return cantidadSolicitadas;
    }

    public void setCantidadSolicitadas(int cantidadSolicitadas) {
        this.cantidadSolicitadas = cantidadSolicitadas;
    }

    public int getPlazosDeEntrega() {
        return plazosDeEntrega;
    }

    public void setPlazosDeEntrega(int plazosDeEntrega) {
        this.plazosDeEntrega = plazosDeEntrega;
    }

    public String getFormaDePedido() {
        return FormaDePedido;
    }

    public void setFormaDePedido(String FormaDePedido) {
        this.FormaDePedido = FormaDePedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "codigo=" + codigo + ", nombreDelSolicitante=" + nombreDelSolicitante + ", cantidadSolicitadas=" + cantidadSolicitadas + ", plazosDeEntrega=" + plazosDeEntrega + ", FormaDePedido=" + FormaDePedido + '}';
    }
    
    
    
}
