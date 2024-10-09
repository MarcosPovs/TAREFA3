package com.example.tarefa3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class AppCarros extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Carrega o arquivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/carro_app.fxml"));

        // Define o título da janela
        primaryStage.setTitle("Cadastro de Carros");

        // Cria a cena com o layout definido no arquivo FXML
        Scene scene = new Scene(root);

        // Define a cena no Stage (janela) e exibe
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(); // Inicia a aplicação JavaFX
    }
}
