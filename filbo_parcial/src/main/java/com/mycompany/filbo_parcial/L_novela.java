/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filbo_parcial;

/**
 *
 * @author roxo2
 */
public class L_novela extends libro{

    
    
    private String genero;
    private double descuento;
    
    public L_novela(String titulo, String autor, double precio, String genero) {
        super(titulo, autor, precio);
        this.genero = genero;
    }

    @Override
    public double calcularPrecioFinal() {
        descuento = precio*  0.15;
        return precio = precio-descuento;
    
    }
    
    
    @Override
    public String mostrarDatos (){
     return "titulo " + titulo+"\nAutor: "+autor+"\nPrecio: "+precio + "\nGenero: " + genero;
    }
    
}
