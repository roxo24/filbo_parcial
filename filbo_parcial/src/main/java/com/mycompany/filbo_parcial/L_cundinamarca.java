/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filbo_parcial;

/**
 *
 * @author roxo2
 */
public class L_cundinamarca extends libro {

    private String facultad;
    private double descuento;
    
    
    public L_cundinamarca(String titulo, String autor, double precio, String facultad) {
        super(titulo, autor, precio);
        this.facultad = facultad;
    }
    
    

    @Override
    public double calcularPrecioFinal() {
      descuento = precio*  0.25;
      return precio = precio-descuento;
    }
    
    
    @Override
    public String mostrarDatos (){
     return "titulo: " + titulo+"\nAutor: "+autor+"\nPrecio: "+precio + "\nFacultad: " + facultad;
    }
    
}
