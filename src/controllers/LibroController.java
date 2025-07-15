package controllers;
import models.Book;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import models.Book;

public class LibroController {

    public Map<Book, Book> procesarLibros(List<Book> libros) {
        Map<Book, Book> map = new TreeMap<>();
        for (Book libro : libros) {
            map.put(libro, libro); 
        }
        for (Map.Entry<Book, Book> entry : map.entrySet()) {
            Book libro = entry.getKey();
            System.out.println("Título: " + libro.getTitulo() + ", Año: " + libro.getAnio());
        }

        return map;
    }
}

