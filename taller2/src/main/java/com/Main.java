package com;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "1234567890", 417);
        Revista revista1 = new Revista("National Geographic", "Varios", 2023, 5, "Octubre");
        Audiovisual audiovisual1 = new Audiovisual("Interstellar", "Christopher Nolan", 2014, "Blu-ray", 169);

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(audiovisual1);

        biblioteca.mostrarCatalogo();

        Material encontrado = biblioteca.buscarMaterial("Cien años de soledad");
        if (encontrado != null) {
            encontrado.prestar();
        }

        encontrado.devolver();
    }
}
