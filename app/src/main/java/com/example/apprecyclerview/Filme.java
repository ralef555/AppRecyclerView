package com.example.apprecyclerview;

public class Filme {

    private String titulo;
    private String ano;
    private String genero;

    public Filme(String titulo, String genero, String ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

}
