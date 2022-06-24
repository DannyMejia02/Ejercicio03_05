/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Canton;
import Modelo.Pais;
import Modelo.Parroquia;
import Servicio.CantonServicio;
import Servicio.PaisServicio;
import Servicio.ParroquiaServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class PaisControl {
    
    private PaisServicio paisServicio = new PaisServicio();
    private CantonServicio cantonServicio = new CantonServicio();
    private ParroquiaServicio parroquiaServicio = new ParroquiaServicio();
    
    public Pais crearPais(String [] args){
        Canton aucantonto = this.cantonServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Parroquia parroquia = this.parroquiaServicio.buscarPorCodigo(Integer.valueOf(args[5]));
        Pais pais = new Pais(Integer.valueOf(args[0]), args [1], args[2], Integer.valueOf(args[3]), args[4], args[5]);
        this.paisServicio.crear(pais);
        return pais;
        
    }
    
    public Pais buscarPais(String arg){
        return this.paisServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Pais eliminar(String arg){
        return this.paisServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Pais modificar(String [] args){
        Canton canton = this.cantonServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Parroquia parroquia = this.parroquiaServicio.buscarPorCodigo(Integer.valueOf(args[5]));
            Pais paisNuevo = new Pais(Integer.valueOf(args[0]), args [1], args[2], Integer.valueOf(args[3]), args[4], args[5]);
            this.paisServicio.modificar(Integer.valueOf(args[0]), paisNuevo);
           return paisNuevo;
}
    
    public List<Pais> listar(){
        return this.paisServicio.listar();
                
    }
    
}
