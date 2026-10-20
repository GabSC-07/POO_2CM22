module com.mycompany.ejercicio1_1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1_1 to javafx.fxml;
    exports com.mycompany.ejercicio1_1;
}
