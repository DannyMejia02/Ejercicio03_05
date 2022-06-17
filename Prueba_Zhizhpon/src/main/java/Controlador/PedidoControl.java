/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pedido;
import Servicio.PedidoServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class PedidoControl {
    
    private final PedidoServicio pedidoServicio = new PedidoServicio();
    
    public Pedido crear(String [] args) {
        var codigoPedido = Integer.valueOf(args[0]);
        var nombredelsolicitantePedido = args[1];
        var cantidadsolicitadasPedido = Integer.valueOf(args[2]);
        var plazosdeentrega = Integer.valueOf(args[3]);
        var formadepedido = args[4];
        
        var pedido = new Pedido(codigoPedido, nombredelsolicitantePedido, cantidadsolicitadasPedido, plazosdeentrega, formadepedido);
        this.pedidoServicio.crear(pedido);
        return pedido;
    }
    
    public List<Pedido> listar() {
        return this.pedidoServicio.listar();
    }
    
}
