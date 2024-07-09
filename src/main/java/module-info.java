module com.example.contador {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.contador to javafx.fxml;
    exports com.example.contador;
}