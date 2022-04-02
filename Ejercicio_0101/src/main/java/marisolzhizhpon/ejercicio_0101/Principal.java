/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marisolzhizhpon.ejercicio_0101;

/**
 *
 * @author marisolzhizhpon
 */
public class Principal {
    public static void main(String[] args){
        var gatito = new Gato();
        gatito.nombre = "Sammy";
        gatito.raza = "Siberiano";
        gatito.edad = "18 meses";
        gatito.peso = "3,6kg";
        
        System.out.println("El gato se llama: "+gatito.nombre
                +" La raza del gato es : "+gatito.raza
                +" La edad del gato es: "+gatito.edad
                +" El peso del gato es: "+gatito.peso);
        
        var gato = new Gato();
        gato.nombre = "Milo";
        gato.raza = "Ragdoll";
        gato.edad = "5 años";
        gato.peso = "4,2kg";
        
        System.out.println("El gato se llama: "+gato.nombre
                +" La raza del gato es : "+gato.raza
                +" La edad del gato es: "+gato.edad
                +" El peso del gato es: "+gato.peso);
        
        var carro = new Carro();
        carro.modelo = "Versa";
        carro.año = "2016";
        carro.motor = "Gasolina";
        carro.recorrido = "1.000km";
        
        System.out.println("El modelo del carro es: "+carro.modelo
                +" El año del carro es : "+carro.año
                +" El motor del carro es: "+carro.motor
                +" El recorrido del carro es: "+carro.recorrido);
        
        var carro1 = new Carro();
        carro1.modelo = "Chevrolet";
        carro1.año = "2021";
        carro1.motor = "Diesel";
        carro1.recorrido = "8.000km";
        
        System.out.println("El modelo del carro es: "+carro1.modelo
                +" El año del carro es : "+carro1.año
                +" El motor del carro es: "+carro1.motor
                +" El recorrido del carro es: "+carro1.recorrido);
        
        var libro = new Libro();
        libro.titulo = "Una vida perfecta";
        libro.codigo = "ISBN 875-4023467345";
        libro.autor = "Miguel de Cervantes";
        libro.idioma = "Español";
        
        System.out.println("El titulo del libro es: "+libro.titulo
                +" El codigo del libro es : "+libro.codigo
                +" El autor del libro es: "+libro.autor
                +" El idioma del libro es: "+libro.idioma);
        
        var libro1 = new Libro();
        libro1.titulo = "Salvaje de corazon";
        libro1.codigo = "ISBN 142-6893245171";
        libro1.autor = "Gabriel Garcia";
        libro1.idioma = "Ingles";
        
        System.out.println("El titulo del libro es: "+libro1.titulo
                +" El codigo del libro es : "+libro1.codigo
                +" El autor del libro es: "+libro1.autor
                +" El idioma del libro es: "+libro1.idioma);
        
        var mochila = new Mochila();
        mochila.precio = "20 dolares";
        mochila.color = "Blanco y Rojo";
        mochila.tamaño = "Mediano";
        mochila.peso = "4 kilos";
        
        System.out.println("El precio de la mochila es: "+mochila.precio
                +" El color de la mochila es : "+mochila.color
                +" El tamaño de la mochila es: "+mochila.tamaño
                +" El tipo de mochila es: "+mochila.peso);
        
        var mochila1 = new Mochila();
        mochila1.precio = "80 dolares";
        mochila1.color = "Gris y Negro";
        mochila1.tamaño = "Grande";
        mochila1.peso = "25 litros";
        
        System.out.println("El precio de la mochila es: "+mochila1.precio
                +" El color de la mochila es : "+mochila1.color
                +" El tamaño de la mochila es: "+mochila1.tamaño
                +" El tipo de mochila es: "+mochila1.peso);
        
        var producto = new Producto();
        producto.nombre = "Arroz";
        producto.codigo = "Codigo EAN-13";
        producto.calidad = "Malo";
        producto.marca = "Conejo Reventon";
        
        System.out.println("El nombre del producto es: "+producto.nombre
                +" El codigo del producto es : "+producto.codigo
                +" La calidad del producto es: "+producto.calidad
                +" La marca del producto es: "+producto.marca);
        
        var producto1 = new Producto();
        producto1.nombre = "Aceite";
        producto1.codigo = "Codigo UPC-A";
        producto1.calidad = "Bueno";
        producto1.marca = "Girasol";
        
        System.out.println("El nombre del producto es: "+producto1.nombre
                +" El codigo del producto es : "+producto1.codigo
                +" La calidad del producto es: "+producto1.calidad
                +" La marca del producto es: "+producto1.marca);
    }
    
}
