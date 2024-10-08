/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaquedano_angel_itunes;

/**
 *
 * @author angel
 */
public class JTunes {

    Song s = new Song();

    public static Song[] songs;

    public JTunes() {

    }

    public JTunes(int cantidadCanciones) {
        songs = new Song[cantidadCanciones];
    }

    public void addSong(int codigo, String nombre, double precio) {
        if (searchSong(codigo) == null) { // Cambiado a != null
            for (int i = 0; i < songs.length; i++) {
                if (songs[i] == null) {
                    songs[i] = new Song(codigo, nombre, precio);
                    break; 
                }
            }
        }
    }

    public Song searchSong(int codigo) {
        for (Song s : songs) {
            if (s != null && s.getCodigo() == codigo) {
                return s;
            }
        }
        return null;
    }

    public String rateSong(int codigo, int cantidadEstrellas) {
        Song song = searchSong(codigo);
        if (song != null) {
            song.addStars(cantidadEstrellas);
            song.songRating();
            return song.print();
        }
        return "El codigo de la cancion que ingresaste no existe.";
    }

    public String[] printSongs() {
        String[] registeredSongs = new String[songs.length];
        int index=0;
        for (Song s: songs) {
            if (s != null) {
                registeredSongs[index]=s.print();
                index++;
            }
        }
        return registeredSongs;
    }
}
