package com.example.tarefa3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CarrosController {

    @FXML
    private TextField marcaField;

    @FXML
    private TextField modeloField;

    @FXML
    private TextField anoField;

    @FXML
    private TableView<Carros> tabelaCarros;

    @FXML
    private TableColumn<Carros, String> colunaMarca;

    @FXML
    private TableColumn<Carros, String> colunaModelo;

    @FXML
    private TableColumn<Carros, Integer> colunaAno;

    private ObservableList<Carros> listaCarros;

    @FXML
    public void initialize() {
        // Configurar as colunas da tabela
        colunaMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        colunaModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        colunaAno.setCellValueFactory(new PropertyValueFactory<>("ano"));

        // Inicializar a lista de carros e vinculá-la à tabela
        listaCarros = FXCollections.observableArrayList(CarrosRepository.getCarros());
        tabelaCarros.setItems(listaCarros);
    }

    @FXML
    public void salvarCarro() {
        try {
            String marca = marcaField.getText();
            String modelo = modeloField.getText();
            String ano =anoField.getText();

            // Criar um novo carro e adicionar à lista e ao repositório
            Carros novoCarro = new Carros(marca, modelo, ano);
            CarrosRepository.adicionar(novoCarro);
            listaCarros.add(novoCarro);

            // Limpar os campos após salvar
            marcaField.clear();
            modeloField.clear();
            anoField.clear();
        } catch (NumberFormatException e) {
            // Tratar caso o campo "ano" seja inválido
            System.out.println("Erro: Ano inválido.");
        }
    }

    @FXML
    public void voltarMenu(ActionEvent event) throws IOException {
        // Voltar para o menu principal
        Parent menuRoot = FXMLLoader.load(getClass().getResource("/MenuPrincipal.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(menuRoot);
        stage.setScene(scene);
        stage.show();
    }
}
