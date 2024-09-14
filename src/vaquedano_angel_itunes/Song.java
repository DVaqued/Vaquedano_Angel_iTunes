/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaquedano_angel_itunes;

/**
 *
 * @author angel
 */
public class Song {

    private int codigo = 0;
    private String nombre = null;
    private double precio = 0;
    private int sumaDeEstrellas = 0;
    private int cantidadReviews = 0;

    public Song(){
    }
    
    public Song(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        sumaDeEstrellas = 0;
        cantidadReviews = 0;
    }

    public void addStars(int stars) {
        if (stars >= 0 && stars <= 5) {
            stars += sumaDeEstrellas;
            cantidadReviews++;
        }
    }

    public double songRating() {
        double rating;
        rating = sumaDeEstrellas / cantidadReviews;
        return rating;
    }
        public String print() {
        return codigo+" - "+nombre+" - "+precio+" - "+songRating();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
        
}
