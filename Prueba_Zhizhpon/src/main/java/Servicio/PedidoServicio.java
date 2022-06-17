/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pedido;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class PedidoServicio implements IPedidoServicio{
    
    private static List<Pedido> pedidoList = new ArrayList<>();

    @Override
    public Pedido crear(Pedido pedido) {
        this.pedidoList.add(pedido);
        return pedido;
    }

    @Override
    public Pedido modificar(int codigoPedido, Pedido pedidoNuevo) {
        var posicion = this.buscarPosicion(this.buscarPorCodigo(codigoPedido));
        this.listar().get(posicion).setNombreDelSolicitante(pedidoNuevo.getNombreDelSolicitante());
        this.listar().get(posicion).setCantidadSolicitadas(pedidoNuevo.getCantidadSolicitadas());
        this.listar().get(posicion).setPlazosDeEntrega(pedidoNuevo.getPlazosDeEntrega());
        this.listar().get(posicion).setFormaDePedido(pedidoNuevo.getFormaDePedido());
        
        return pedidoNuevo;
    }

    @Override
    public Pedido eliminar(int codigoPedido) {
        Pedido pedido = this.buscarPorCodigo(codigoPedido);
        var posicion = this.buscarPosicion(pedido);
        this.listar().remove(posicion);
        return pedido;
    }

    @Override
    public Pedido buscarPorCodigo(int codigoPedido) {
        Pedido pedido = null;
        for(var b: this.pedidoList){
            if(codigoPedido == b.getCodigo()){
                pedido = b;
                break;
            }
            
        }
        return pedido;
    }

    @Override
    public int buscarPosicion(Pedido pedido) {
        int posicion = -1;
        for(var b: this.pedidoList){
            posicion++;
            if(b.getCodigo()== pedido.getCodigo()){
                break;
            }
                
        }
        return posicion; 
    }

    @Override
    public List<Pedido> listar() {
        return this.pedidoList;
    }
    
    
}
