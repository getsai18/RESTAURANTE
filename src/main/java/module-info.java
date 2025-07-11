module mx.edu.utez.demo_restaurante {
    requires javafx.controls;
    requires javafx.fxml;


    opens mx.edu.utez.demo_restaurante to javafx.fxml;
    exports mx.edu.utez.demo_restaurante;
}