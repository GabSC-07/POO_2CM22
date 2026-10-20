package com.mycompany.ejercicio1_4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    // controles
    @FXML private TextField txtNumero;
    @FXML private TextArea txtResultados;
    
    private Multiplicar tabla;
    private int num;

    @FXML
    private void calcular() {
        num = Integer.parseInt( txtNumero.getText() );
        for (int i = 1; i <= 10; i++) {
            tabla = new Multiplicar(num, i);
            txtResultados.appendText(tabla.toString() );
        }   
    }
    
    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtResultados.clear();
    }
}
