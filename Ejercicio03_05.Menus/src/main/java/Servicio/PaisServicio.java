/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Pais;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marisolzhizhpon
 */
public class PaisServicio implements IPaisServicio {

    private static List<Pais> paisList = new ArrayList<>();

    @Override
    public Pais crear(Pais pais) {
        this.paisList.add(pais);
        return pais;
    }

    @Override
    public Pais modificar(int codigoNuevo, Pais paisNuevo) {
        var posicion = this.buscarPosicion(this.buscarPorCodigo(codigoNuevo));
        this.listar().get(posicion).setNombre(paisNuevo.getNombre());
        this.listar().get(posicion).setEconomia(paisNuevo.getEconomia());
        this.listar().get(posicion).setPoblacion(paisNuevo.getPoblacion());
        this.listar().get(posicion).setCultura(paisNuevo.getCultura());
        return paisNuevo;
    }

    @Override
    public Pais eliminar(int codigo) {
        Pais pais = this.buscarPorCodigo(codigo) ;
        var posicion = this.buscarPosicion(pais);
        this.listar().remove(posicion);
        return pais;
    }

    @Override
    public Pais buscarPorCodigo(int codigo) {
        Pais pais = null;
        for(var a:this.listar()){
            if(codigo==a.getCodigo()){
                pais=a;
                break;
            }
        }
        return pais;
    }

    @Override
    public int buscarPosicion(Pais pais) {
        int posicion = -1;
        for(var a:this.paisList){
            posicion++;
            if(a.getCodigo()==pais.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Pais> listar() {
        return this.paisList;
    }
    
}
