/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Parroquia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class ParroquiaServicio implements IParroquiaServicio {

    private static List<Parroquia> parroquiaList= new ArrayList<>();

    @Override
    public Parroquia crear(Parroquia parroquia) {
      this.parroquiaList.add(parroquia);
      return parroquia;
    }

    @Override
    public Parroquia modificar(int codigoNuevo, Parroquia parroquiaNuevo) {
     var posicion = this.buscarPosicion(this.buscarPorCodigo(codigoNuevo));
     this.listar().get(posicion).setNombre(parroquiaNuevo.getNombre());
     this.listar().get(posicion).setHabitantes(parroquiaNuevo.getHabitantes());
     this.listar().get(posicion).setSistemaVial(parroquiaNuevo.getSistemaVial());
     this.listar().get(posicion).setHabitos(parroquiaNuevo.getHabitos());
     return parroquiaNuevo;
             
    }

    @Override
    public Parroquia eliminar(int codigo) {
        Parroquia parroquia = this.buscarPorCodigo(codigo);
        var posicion= this.buscarPosicion(parroquia);
        this.listar().remove(posicion);
        return parroquia;
        
    }

    @Override
    public Parroquia buscarPorCodigo(int codigo) {
        Parroquia parroquia= null;
        for(var p:this.listar()){
            if(codigo==p.getCodigo()){
                parroquia = p;
                break;
            }
        }
        return parroquia;        
    }

    @Override
    public int buscarPosicion(Parroquia parroquia) {
        
        int posicion =-1;
        for(var p:this.parroquiaList){
            posicion++;
            if(p.getCodigo()==parroquia.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Parroquia> listar() {
        return this.parroquiaList;
    }
    
    
    
}
