module com.mycompany.ejercicio1_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1_3 to javafx.fxml;
    exports com.mycompany.ejercicio1_3;
}
