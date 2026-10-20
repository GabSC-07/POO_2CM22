package com.mycompany.ejercicio1_5;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    // cotroles
    @FXML private Label lblAlimentos, lblRefrigerios, lblTransporte, lblTelefono, lblOtros;
    @FXML private TextField txtAlimentos, txtRefrigerios, txtTransporte, txtTelefono, txtOtros, txtTotal, txtMayor;

    private int alimentos, refrigerios, transporte, telefono, otros;
    
    private Gastos[] g;
    
    @FXML
    private void calcularEstadisticas() {
        alimentos = Integer.parseInt(txtAlimentos.getText() );
        refrigerios = Integer.parseInt(txtRefrigerios.getText() );
        transporte = Integer.parseInt(txtTransporte.getText() );
        telefono = Integer.parseInt(txtTelefono.getText() );
        otros = Integer.parseInt(txtOtros.getText() );
    
        int total = alimentos + refrigerios + transporte + telefono + otros;
        txtTotal.setText(Integer.toString(total) );
        
        g = new Gastos[]{
            new Gastos(lblAlimentos.getText(), alimentos),
            new Gastos(lblRefrigerios.getText(), refrigerios),
            new Gastos(lblTransporte.getText(), transporte),
            new Gastos(lblTelefono.getText(), telefono),
            new Gastos(lblOtros.getText(), otros)
        };
        
        String nombre = "";
        int alto = 0;
        for(Gastos x : g){
            int valor = x.getCantidad();
            
            if (valor >= alto) {
                alto = valor;
                nombre = x.getNombre();
            }
        }       
        txtMayor.setText(nombre);
    }
    
    @FXML
    private void limpiar() {
        txtAlimentos.clear();
        txtRefrigerios.clear();
        txtTransporte.clear();
        txtTelefono.clear();
        txtOtros.clear();
        txtTotal.clear();
        txtMayor.clear();
        
    }
}
