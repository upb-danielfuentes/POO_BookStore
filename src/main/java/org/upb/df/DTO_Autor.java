package org.upb.df;

public class DTO_Autor {
    private String ID_Autor;
    private String Nombre_Autor;
    private String Apellido_Autor;
    private String Nacionalidad;
    private String Fecha_Nacimiento;
    private String Genero;

    public DTO_Autor() {
        ID_Autor = "";
        Nombre_Autor = "";
        Apellido_Autor = "";
        Nacionalidad = "";
        Fecha_Nacimiento = "";
        Genero = "";
    }

    public DTO_Autor(String ID_Autor, String nombre_Autor, String apellido_Autor, String nacionalidad, String fecha_Nacimiento, String genero) {
        this.ID_Autor = ID_Autor;
        Nombre_Autor = nombre_Autor;
        Apellido_Autor = apellido_Autor;
        Nacionalidad = nacionalidad;
        this.Fecha_Nacimiento = fecha_Nacimiento;
        Genero = genero;
    }

    public String getID_Autor() {
        return ID_Autor;
    }

    public void setID_Autor(String ID_Autor) {
        this.ID_Autor = ID_Autor;
    }

    public String getNombre_Autor() {
        return Nombre_Autor;
    }

    public void setNombre_Autor(String nombre_Autor) {
        Nombre_Autor = nombre_Autor;
    }

    public String getApellido_Autor() {
        return Apellido_Autor;
    }

    public void setApellido_Autor(String apellido_Autor) {
        Apellido_Autor = apellido_Autor;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.Fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
