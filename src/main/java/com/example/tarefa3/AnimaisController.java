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

public class AnimaisController {

    @FXML
    private TextField racaField;

    @FXML
    private TextField alimentacaoField;

    @FXML
    private TextField sexoField;

    @FXML
    private TableView<Animais> tabelaAnimais;

    @FXML
    private TableColumn<Animais, String> colunaRaca;

    @FXML
    private TableColumn<Animais, String> colunaAlimentacao;

    @FXML
    private TableColumn<Animais, String> colunaSexo;

    private ObservableList<Animais> listaAnimais;

    @FXML
    public void initialize() {
        // Configurar as colunas da tabela
        colunaRaca.setCellValueFactory(new PropertyValueFactory<>("raca"));
        colunaAlimentacao.setCellValueFactory(new PropertyValueFactory<>("alimentacao"));
        colunaSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));

        // Inicializar a lista de carros e vinculá-la à tabela
        listaAnimais = FXCollections.observableArrayList(AnimaisRepository.getAnimais());
        tabelaAnimais.setItems(listaAnimais);
    }

    @FXML
    public void salvarAnimais() {
        try {
            String raca = racaField.getText();
            String alimentacao = alimentacaoField.getText();
            String sexo = sexoField.getText();

            // Criar um novo Animal e adicionar à lista e ao repositório
            Animais novoAnimal = new Animais(raca, alimentacao, sexo);
            AnimaisRepository.adicionar(novoAnimal);
            listaAnimais.add(novoAnimal);

            // Limpar os campos após salvar
            racaField.clear();
            alimentacaoField.clear();
            sexoField.clear();
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
