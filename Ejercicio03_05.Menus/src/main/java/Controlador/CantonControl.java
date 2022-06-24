/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Canton;
import Modelo.Pais;
import Servicio.CantonServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class CantonControl {
    
    private CantonServicio cantonServicio = new CantonServicio();

    public Canton crearCanton(String [] args){
        Pais pais = null;
        Canton canton = new Canton(Integer.valueOf(args[0]), args[1], args[2], Integer.valueOf(args[3]), args[4], pais);
        this.cantonServicio.crear(canton);
        return canton;
    }
    
    public Canton buscarCanton(String arg){
        return this.cantonServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Canton eliminar(String arg){
        return this.cantonServicio.eliminar(Integer.valueOf(arg));
    }
    public Canton modificar(String []args){
        Pais pais = null;
        Canton cantonNuevo = new Canton(Integer.valueOf(args[0]), args[1], args[2], Integer.valueOf(args[3]), args[4], pais);
        this.cantonServicio.modificar(Integer.valueOf(args[0]), cantonNuevo);
        return cantonNuevo;
    }
    public List<Canton> listar(){
        return this.cantonServicio.listar();
    }

    
    
    
    
}
