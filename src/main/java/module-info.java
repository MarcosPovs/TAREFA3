module com.example.tarefa3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.tarefa3 to javafx.fxml;
    exports com.example.tarefa3;
}
