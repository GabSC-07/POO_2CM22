package com.mycompany.ejercicio1_1;

import java.time.LocalDate;
import java.time.Period;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {
    // Mis controles
    @FXML private TextArea txtEdad;
    @FXML private TextArea txtFecha;
    
    @FXML
    private void calcular() {      
        String[] partes = txtFecha.getText().split("/");
        int dia = Integer.parseInt( partes[0] );
        int mes = Integer.parseInt( partes[1] );
        int anio = Integer.parseInt( partes[2] );
        
        LocalDate fechaActual = LocalDate.now();       
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        
        int edadanios = Period.between(fechaNacimiento, fechaActual).getYears();
        int edadmeses = Period.between(fechaNacimiento, fechaActual).getMonths();        
        txtEdad.setText("Tienes " + edadanios + " años con " + edadmeses + " meses");
    }
    
    @FXML
    private void limpiar() {      
        txtEdad.setText("");
        txtFecha.setText("");
    }
}
