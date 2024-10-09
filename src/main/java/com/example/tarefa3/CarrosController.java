package com.example.tarefa3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;


public class CarrosController {

    // Campos de texto para entrada de dados
    @FXML
    private TextField marcaField;
    @FXML
    private TextField modeloField;
    @FXML
    private TextField anoField;

    // Botão de salvar
    @FXML
    private Button salvarButton;

    // Tabela para exibir os carros cadastrados
    @FXML
    private TableView<Carros> tableView;

    // Colunas da tabela
    @FXML
    private TableColumn<Carros, String> marcaColumn;
    @FXML
    private TableColumn<Carros, String> modeloColumn;
    @FXML
    private TableColumn<Carros, Integer> anoColumn;

    // Lista observável para armazenar os carros
    private ObservableList<Carros> carros = FXCollections.observableArrayList();

    // Método de inicialização
    @FXML
    public void initialize() {
        // Configurar as colunas da tabela
        marcaColumn.setCellValueFactory(new PropertyValueFactory<>("marca"));
        modeloColumn.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        anoColumn.setCellValueFactory(new PropertyValueFactory<>("ano"));

        // Vincular a lista observável à tabela
        tableView.setItems(carros);

        // Configurar a ação do botão "Salvar"
        salvarButton.setOnAction(e -> salvarCarro());
    }

    // Método para salvar um carro
    private void salvarCarro() {
        // Obter os valores dos campos de texto
        String marca = marcaField.getText();
        String modelo = modeloField.getText();
        String ano = anoField.getText();

        // Criar um novo objeto Carro e adicioná-lo à lista
        Carros novoCarro = new Carros(marca, modelo, ano);
        carros.add(novoCarro);

        // Limpar os campos de texto
        marcaField.clear();
        modeloField.clear();
        anoField.clear();
    }
}
