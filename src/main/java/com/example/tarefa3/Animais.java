package com.example.tarefa3;

import javafx.beans.property.SimpleStringProperty;

public class Animais {
    private SimpleStringProperty raca;
    private SimpleStringProperty alimentacao  ;
    private SimpleStringProperty sexo;

    public Animais(String raca, String alimentacao, String sexo) {
        this.raca = new SimpleStringProperty(raca);
        this.alimentacao = new  SimpleStringProperty(alimentacao);
        this.sexo = new SimpleStringProperty(sexo);
    }

    // Métodos para acessar as propriedades
    public SimpleStringProperty racaProperty() {
        return raca;
    }

    public SimpleStringProperty alimentacaoProperty() {
        return alimentacao;
    }

    public SimpleStringProperty sexoProperty() {
        return sexo;
    }


    // Getters e Setters
    public String getRaca() {
        return raca.get();
    }

    public void setRaca(String raca) {
        this.raca.set(raca);
    }

    public String getAlimentacao() {
        return alimentacao.get();
    }

    public void setDieta(String alimentacao) {
        this.alimentacao.set(alimentacao);
    }

    public String getSexo() {
        return sexo.get();
    }

    public void setSexo(String sexo) {
        this.sexo.set(sexo);
    }
}
