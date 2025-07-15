package models;

public class Book implements Comparable<Book> {
    private String titulo;
    private String autor;
    private int anio;

    public Book(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book other = (Book) obj;
        return this.anio == other.anio &&
               this.titulo != null && this.titulo.equals(other.titulo);
    }

    @Override
    public int hashCode() {
        int result = titulo != null ? titulo.hashCode() : 0;
        result = 31 * result + anio;
        return result;
    }

   @Override
    public int compareTo(Book other) {
    int cmp = other.titulo.compareTo(this.titulo); 
    if (cmp != 0) {
        return cmp;
    }
    return Integer.compare(other.anio, this.anio);
}
}
