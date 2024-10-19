package com;

public class Revista extends Material {
    private int numeroEdicion;
    private String mesPublicacion;

    public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String getTipoMaterial() {
        return "Revista";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        return 1.0 * diasPrestamo; 
    }

    public void mostrarDetallesRevista() {
        mostrarInformacion();
        System.out.println("Número de edición: " + numeroEdicion);
        System.out.println("Mes de publicación: " + mesPublicacion);
    }
}

