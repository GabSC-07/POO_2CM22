module com.mycompany.ejercicio1_2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1_2 to javafx.fxml;
    exports com.mycompany.ejercicio1_2;
}
