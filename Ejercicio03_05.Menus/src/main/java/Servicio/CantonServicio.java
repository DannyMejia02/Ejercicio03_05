/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Canton;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class CantonServicio implements ICantonServicio {
    
    private static List<Canton> cantonList = new ArrayList<>();

    @Override
    public Canton crear(Canton canton) {
        this.cantonList.add(canton);
        return canton;
    }

    @Override
    public Canton modificar(int codigoNuevo, Canton cantonNuevo) {
        var posicion = this.buscarPosicion(this.buscarPorCodigo(codigoNuevo));
        this.listar().get(posicion).setNombre(cantonNuevo.getNombre());
        this.listar().get(posicion).setClima(cantonNuevo.getClima());
        this.listar().get(posicion).setPoblacion(cantonNuevo.getPoblacion());
        this.listar().get(posicion).setTradicion(cantonNuevo.getTradicion());
        return cantonNuevo;
    }

    @Override
    public Canton eliminar(int codigo) {
        Canton canton = this.buscarPorCodigo(codigo) ;
        var posicion = this.buscarPosicion(canton);
        this.listar().remove(posicion);
        return canton;
    }

    @Override
    public Canton buscarPorCodigo(int codigo) {
        Canton canton = null;
        for(var a:this.listar()){
            if(codigo==a.getCodigo()){
                canton=a;
                break;
            }
        }
        return canton;
    }

    @Override
    public int buscarPosicion(Canton canton) {
        int posicion = -1;
        for(var a:this.cantonList){
            posicion++;
            if(a.getCodigo()==canton.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Canton> listar() {
        return this.cantonList;
    }
}
    
    
    

