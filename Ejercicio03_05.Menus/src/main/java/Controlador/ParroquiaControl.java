/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Canton;
import Modelo.Parroquia;
import Servicio.ParroquiaServicio;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class ParroquiaControl {
    
    private ParroquiaServicio parroquiaServicio = new ParroquiaServicio();
    
    public Parroquia crearParroquia(String [] args){
        Canton canton = null;
        Parroquia parroquia = new Parroquia(Integer.valueOf(args[0]), args[1], Integer.valueOf(args[2]), args[3], args[4], args[5], canton);
        this.parroquiaServicio.crear(parroquia);
        return parroquia;
    }
    public Parroquia buscarParroquia(String arg){
        return this.parroquiaServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    public Parroquia eliminar(String arg){
        return this.parroquiaServicio.eliminar(Integer.valueOf(arg));
    }
    public Parroquia modificar(String [] args){
        Canton canton = null;
        Parroquia propietarioNuevo = new Parroquia(Integer.valueOf(args[0]), args[1], Integer.valueOf(args[2]), args[3], args[4], args[5], canton);
        this.parroquiaServicio.modificar(Integer.valueOf(args[0]), propietarioNuevo);
        return propietarioNuevo;
    }

    public List<Parroquia> listar() {
        return this.parroquiaServicio.listar();
    }

    

    


    

    

    
    
    
    
    
    
}
