module com.mycompany.ejercicio1_5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1_5 to javafx.fxml;
    exports com.mycompany.ejercicio1_5;
}
