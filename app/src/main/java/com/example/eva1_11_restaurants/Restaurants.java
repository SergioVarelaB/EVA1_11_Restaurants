package com.example.eva1_11_restaurants;

public class Restaurants {
    private int imagen;
    private String nombre;
    private String descripcion;

    public Restaurants(){
        imagen = R.drawable.f3;
        nombre = "Golden bridge";
        descripcion = "El infierno";
    }

    public Restaurants(int imagen, String nombre, String descripcion) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
