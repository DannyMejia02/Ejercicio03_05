/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.g9_unidad03_ejercicio02;

/**
 *
 * @author marisolzhizhpon
 */
public class Principal {
    public  static  void  main ( String [] args ) {
        var  v1 = new  VentanaA("INSCRIBETE");
        v1 . setVisible (true);
        
        var  v2 = new  VentanaB("DATOS PERSONALES");
        v2 . setVisible (true);
        
        var v3 = new VentanaC("INFORMACION DE CARRERA");
        v3.setVisible(true);
        
        var v4 = new VentanaD("CREAR GRUPO");
        v4.setVisible(true);
        
        var v5 = new VentanaE("MATRICULA TERMINADA");
        v5.setVisible(true);
    }
    
}
