module com.mycompany.ejercicio1_4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1_4 to javafx.fxml;
    exports com.mycompany.ejercicio1_4;
}
