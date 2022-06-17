/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Pedido;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public interface IPedidoServicio {
    
    public Pedido crear(Pedido pedido);
    public Pedido modificar(int codigoPedido, Pedido pedidoNuevo );
    public Pedido eliminar(int codigoPedido);
    public  Pedido buscarPorCodigo(int codigoPedido);
    public int buscarPosicion(Pedido pedido);
    public List<Pedido> listar();
    
}
