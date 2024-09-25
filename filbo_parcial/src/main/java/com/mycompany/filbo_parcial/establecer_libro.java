/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filbo_parcial;
import java.util.Scanner;
/**
 *
 * @author roxo2
 */
public class establecer_libro {
    public static void main(String[] args) {
    Scanner teclado =  new Scanner (System.in);
    
        System.out.println("bienvenido a la filbo, cuantos libros deseas comprar?");
        int num  = teclado.nextInt();
    String titulo[] = new String [num];
    String autor[]= new String [num];
    double precio[]= new double [num];
    String curso[]= new String [num];
    String facu[]= new String [num];
    String genero[]= new String [num];
    libro mislibros[] = new libro[num];
        for (int i = 0; i < num; i++) {
            System.out.println("si el libro " + i + " es de texto ingresa 1 ");
            System.out.println("si el libro es de la universidad de cundinamarca ingresa 2 ");
            System.out.println("si el libro es una novela ingresa 3 ");
            int des = teclado.nextInt();
            
            switch (des) {
                case 1 -> {
                    System.out.println("Ingrese el titulo del libro " + i +" :");
                    titulo[i] = teclado.next();
                    System.out.println("Ingrese el autor del libro");
                    autor [i]= teclado.next();
                    System.out.println("Ingrese el precio original del libro");
                    precio[i] = teclado.nextDouble();
                    System.out.println("Ingrese el curso del libro ");
                    curso[i] = teclado.next();
                    
                    mislibros[i] = new L_texto(titulo[i],autor[i],precio[i], curso[i]);
                    
                }
                case 2 -> {
                    System.out.println("Ingrese el titulo del libro " + i +" :");
                    titulo[i] = teclado.next();
                    System.out.println("Ingrese el autor del libro");
                    autor [i]= teclado.next();
                    System.out.println("Ingrese el precio original del libro");
                    precio[i] = teclado.nextDouble();
                    System.out.println("Ingrese la facultad del libro ");
                    facu[i] = teclado.next();
                    
                    mislibros[i] = new L_cundinamarca(titulo[i],autor[i],precio[i], facu[i]);
                    
                }
                case 3 -> {
                    System.out.println("Ingrese el titulo del libro " + i +" :");
                    titulo[i] = teclado.next();
                    System.out.println("Ingrese el autor del libro");
                    autor [i]= teclado.next();
                    System.out.println("Ingrese el precio original del libro");
                    precio[i] = teclado.nextDouble();
                    System.out.println("Ingrese el tipo de novela del libro ");
                    System.out.println("hay novela historica, romantica, policiaca \nrealista, ciencia ficcion y aventura ");
                    genero[i] = teclado.next();
                    
                    mislibros[i] = new L_novela(titulo[i],autor[i],precio[i], genero[i]);
                    
                }
                default -> {
                    System.out.println("numero equivocado");
                }
            }
            }
        for (libro libres: mislibros) {
            libres.calcularPrecioFinal();
             
            System.out.println (libres.mostrarDatos ()) ;
            System.out.println("");
            
            
            
        }   



}}