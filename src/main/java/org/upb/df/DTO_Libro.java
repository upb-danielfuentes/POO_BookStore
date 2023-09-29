package org.upb.df;

public class DTO_Libro {
    private String ISBN;
    private String Titulo;
    private String Id_Autor;
    private String Id_Genero;
    private String Descripcion;
    private int CantPag;

    public DTO_Libro() {
        ISBN = "";
        Titulo = "";
        Id_Autor = "";
        Id_Genero = "";
        Descripcion = "";
        CantPag = 0;
    }

    public DTO_Libro(String ISBN, String titulo, String id_Autor, String id_Genero, String descripcion, int cantPag) {
        this.ISBN = ISBN;
        this.Titulo = titulo;
        this.Id_Autor = id_Autor;
        this.Id_Genero = id_Genero;
        this.Descripcion = descripcion;
        this.CantPag = cantPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getId_Autor() {
        return Id_Autor;
    }

    public void setId_Autor(String id_Autor) {
        Id_Autor = id_Autor;
    }

    public String getId_Genero() {
        return Id_Genero;
    }

    public void setId_Genero(String id_Genero) {
        Id_Genero = id_Genero;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getCantPag() {
        return CantPag;
    }

    public void setCantPag(int cantPag) {
        CantPag = cantPag;
    }
}
