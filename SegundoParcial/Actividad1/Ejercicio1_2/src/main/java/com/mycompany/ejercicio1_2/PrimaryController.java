package com.mycompany.ejercicio1_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController implements Initializable{
    // controles
    @FXML private TextField txtDinero;
    @FXML private TextArea txtCantidades, txtResultados;
    
    private Dinero[] money;

    // las acciones
    @FXML
    private void borrar() {
        txtDinero.clear();
        txtResultados.clear();
    }
    
    @FXML
    private void calcular() {
        int total = Integer.parseInt(txtDinero.getText() );
        for(Dinero d : money){
            int valor = d.Valor();
            int cantidad = total / valor;
            
            if (total >= valor) {
                txtResultados.appendText(cantidad + "\n");
                total = total % valor;
            } else {
                txtResultados.appendText("0\n");
            }
        }
    }

    // el iniciailizable
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        money = new Dinero[]{
            new Dinero(0, 500),
            new Dinero(0, 200),
            new Dinero(0, 100),
            new Dinero(0, 50),
            new Dinero(0, 20),
            new Dinero(1, 10),
            new Dinero(1, 5),
            new Dinero(1, 2),
            new Dinero(1, 1) 
        };
        
        for(Dinero d : money){
            txtCantidades.appendText(d.toString() + "\n");
        }
    }
}
