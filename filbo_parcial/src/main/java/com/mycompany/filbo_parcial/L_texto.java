/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filbo_parcial;

/**
 *
 * @author roxo2
 */
public class L_texto extends libro {

    
    private String curso;
    private double descuento;
    
    public L_texto(String titulo, String autor, double precio, String curso ) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    
    
    
    @Override
    public double calcularPrecioFinal() {
       descuento = precio*  0.4;
      return precio = precio-descuento;
    
    }
    
    
    @Override
    public String mostrarDatos (){
     return "titulo: " + titulo+"\nAutor: "+autor+"\nPrecio: "+precio + "\nCurso: " + curso;
    }
    
    
    
}
