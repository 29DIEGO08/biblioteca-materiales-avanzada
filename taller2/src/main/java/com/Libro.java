package com;

public class Libro extends Material {
    private String isbn;
    private int numeroPaginas;

    public Libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroPaginas) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getTipoMaterial() {
        return "Libro";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 2.0; 
        double tarifa = tarifaBase * diasPrestamo;
        if (numeroPaginas > 500) {
            tarifa += 5.0; 
        }
        return tarifa;
    }

    public void mostrarDetallesLibro() {
        mostrarInformacion();
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}

