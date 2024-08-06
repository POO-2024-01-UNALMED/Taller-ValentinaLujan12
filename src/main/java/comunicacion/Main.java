package comunicacion;

import comunicacion.Alfabeto;
import comunicacion.Fabula;
import comunicacion.Libro;
import comunicacion.Periodico;
import comunicacion.Tesis;

public class Main {

    public static void main(String[] args) {
        // Crear instancias de las clases
        Alfabeto alfabeto = new Alfabeto("alfabeto griego, occidente",
                new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"},
                "Alfabeto latino");
        Fabula fabula = new Fabula("pensamiento", "La tortuga y la liebre", "Esopo", 2,
                "no se debe uno burlar de los demas, ni presumir o ser vanidoso", "Cuento corto");
        Libro libro = new Libro("Creacion", "El resplandor", "Stephen King", 599, "N/A", "Doubleday", "Primera", "Escrito largo");
        Periodico periodico = new Periodico("Investigacion", "Se encontro la solucion", "Colombiano", 6, "20/12/2020", "Cura del covid", "Escrito informativo");
        Tesis tesis = new Tesis("Pensamiento expansivo", "Recomendador", "Alejandro", 20, "Recomendar asignaturas", new String[]{"Primero", "Segundo"},
                "Se hace trabajo futuro", "[1] Maquinaria", "Escrito investigativo");

        // Probar métodos de las clases
        System.out.println("=== Alfabeto ===");
        System.out.println("Interpretacion: " + alfabeto.interpretacion());
        System.out.println("Cantidad de letras: " + alfabeto.cantidadLetras());
        System.out.println("toString: " + alfabeto.toString());

        System.out.println("\n=== Fabula ===");
        System.out.println("Interpretacion: " + fabula.interpretacion());
        System.out.println("Palabras totales: " + fabula.palabrasTotales(140));
        System.out.println("toString: " + fabula.toString());

        System.out.println("\n=== Libro ===");
        System.out.println("Interpretacion: " + libro.interpretacion());
        System.out.println("Palabras totales: " + libro.palabrasTotales(140));
        System.out.println("toString: " + libro.toString());

        System.out.println("\n=== Periodico ===");
        System.out.println("Interpretacion: " + periodico.interpretacion());
        System.out.println("Palabras totales: " + periodico.palabrasTotales(140));
        System.out.println("toString: " + periodico.toString());

        System.out.println("\n=== Tesis ===");
        System.out.println("Interpretacion: " + tesis.interpretacion());
        System.out.println("Palabras totales: " + tesis.palabrasTotales(140));
        System.out.println("toString: " + tesis.toString());
    }
}

