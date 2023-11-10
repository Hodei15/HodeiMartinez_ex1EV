package com.example.hodeimartinez_ex1ev.Objetos;

public class Lugar {
    private String img;
    private String titulo;
    private int puntuacion;
    private String descripcion;

    public Lugar(String img, String titulo, int puntuacion, String descripcion) {
        this.img = img;
        this.titulo = titulo;
        this.puntuacion = puntuacion;
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
