package com.example.tarefa3;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MenuPrincipalController {

    private Stage stage;
    private Scene scene;

    // Métodos para trocar de tela com base no botão clicado

    public void handleCarros(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/carro_app.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    // Aqui você pode adicionar métodos semelhantes para os outros botões
    public void handleAnimais(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/animais_app.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void handleTela2(ActionEvent event) {
        // Carregar Tela 2
    }
    // E assim por diante...
}
