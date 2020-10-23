package com.niverarrigonni.petagram;

public class Mascota {
    private String nombre;
    private int raiting;
    private int foto;


    public Mascota(int foto, String nombre, int raiting) {
        this.foto = foto;
        this.nombre = nombre;
        this.raiting = raiting;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
