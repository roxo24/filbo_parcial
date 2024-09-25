/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filbo_parcial;

/**
 *
 * @author roxo2
 */
public abstract class libro {
    protected String titulo;
    protected String autor;
    protected double precio;

    public libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    public void setTitulo (String titulo)
{
    this.titulo = titulo;
}
    
    public void setautor (String autor)
{
    this.autor = autor;
}
    
    public void setprecio (double precio)
{
    this.precio = precio;
}
    public String gettitulo (){
    return titulo;
    }
    public String getautor (){
    return autor;
    }
    public double getprecio (){
    return precio;
    }
    
    public abstract double calcularPrecioFinal();
    public abstract String mostrarDatos ();
}
