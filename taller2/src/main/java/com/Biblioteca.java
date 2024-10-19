package com;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiales;

    public Biblioteca() {
        this.materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
        System.out.println("Material agregado: " + material.titulo);
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.titulo.equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        System.out.println("Material no encontrado.");
        return null;
    }

    public void mostrarCatalogo() {
        for (Material material : materiales) {
            material.mostrarInformacion();
            if (material instanceof Libro) {
                ((Libro) material).mostrarDetallesLibro();
            } else if (material instanceof Revista) {
                ((Revista) material).mostrarDetallesRevista();
            } else if (material instanceof Audiovisual) {
                ((Audiovisual) material).mostrarDetallesAudiovisual();
            }
            System.out.println("----------------------");
        }
    }
}

