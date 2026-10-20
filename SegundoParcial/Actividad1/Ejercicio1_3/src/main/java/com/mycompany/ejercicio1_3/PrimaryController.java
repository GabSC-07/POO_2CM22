package com.mycompany.ejercicio1_3;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    // controles
    @FXML private TextField txtNumero, txtCifras, txtImpares, txtPares, txtTotal, txtMayor, txtMenor;
    @FXML private TextArea txtDivisores; 

    @FXML
    private void analizar() {
        int cantidad = Integer.parseInt(txtNumero.getText() );
        
        SeparaDigitos s = new SeparaDigitos(cantidad);
        int[] digitos = s.obtenerDigitos();
        
        txtCifras.setText( Integer.toString(s.cantidadCifras(digitos) )  );
        txtImpares.setText(Integer.toString(s.sumaImpares(digitos) ) );
        txtPares.setText(Integer.toString(s.sumaPares(digitos) ) );
        txtTotal.setText(Integer.toString(s.sumaTotal(digitos) ) );
        txtMayor.setText(Integer.toString(s.cifraMayor(digitos) ) );
        txtMenor.setText(Integer.toString(s.cifraMenor(digitos) ) );
        txtDivisores.setText(s.toString());
    }
    
    @FXML
    private void limpiar() {
        txtNumero.clear();
        txtCifras.clear();
        txtImpares.clear();
        txtPares.clear();
        txtTotal.clear();
        txtMayor.clear();
        txtMenor.clear();
        txtDivisores.clear();
    }
}
