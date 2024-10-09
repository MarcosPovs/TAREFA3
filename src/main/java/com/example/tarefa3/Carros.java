package com.example.tarefa3;

import javafx.beans.property.SimpleStringProperty;

public class Carros {

    private SimpleStringProperty marca;
    private SimpleStringProperty modelo;
    private SimpleStringProperty ano;

    public Carros(String marca, String modelo, String ano) {
        this.marca = new SimpleStringProperty(marca);
        this.modelo = new SimpleStringProperty(modelo);
        this.ano = new SimpleStringProperty(ano);
    }

    // Métodos para acessar as propriedades
    public SimpleStringProperty marcaProperty() {
        return marca;
    }

    public SimpleStringProperty modeloProperty() {
        return modelo;
    }

    public SimpleStringProperty anoProperty() {
        return ano;
    }

    // Getters e Setters
    public String getMarca() {
        return marca.get();
    }

    public void setMarca(String marca) {
        this.marca.set(marca);
    }

    public String getModelo() {
        return modelo.get();
    }

    public void setModelo(String modelo) {
        this.modelo.set(modelo);
    }

    public String getAno() {
        return ano.get();
    }

    public void setAno(String ano) {
        this.ano.set(ano);
    }
}
