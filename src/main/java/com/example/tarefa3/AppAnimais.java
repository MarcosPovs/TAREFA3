package com.example.tarefa3;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class AppAnimais extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Carrega o arquivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("/animais_app.fxml"));

        // Define o título da janela
        primaryStage.setTitle("Cadastro de Animais");

        // Cria a cena com o layout definido no arquivo FXML
        Scene scene = new Scene(root);

        // Define a cena no Stage (janela) e exibe
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}