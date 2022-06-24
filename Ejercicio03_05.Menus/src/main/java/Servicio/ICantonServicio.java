/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Canton;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public interface ICantonServicio {
    
    public Canton crear(Canton canton);
    public Canton modificar(int codigoNuevo, Canton cantonNuevo);
    public Canton eliminar(int codigo);
    public Canton buscarPorCodigo(int codigo);
    public int buscarPosicion(Canton canton);
    public List<Canton> listar();
    
}
