package com.mycompany.Ejercicio3_1;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.application.Platform;
import javafx.scene.control.Button;

public class PrimaryController {
    // controles
    @FXML private TextField txtContador;
    @FXML private ProgressBar prgTiempo;
    @FXML private Button btnEsperar;
    
    private int a = 0;

    // botones
    @FXML
    private void contar(){
        a++;
        txtContador.setText( Integer.toString(a) );
    } 
    
    @FXML
    private void esperar(){
        prgTiempo.setProgress(0.0);
        btnEsperar.setDisable(true);
        
        Thread t1 = new Thread( new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    double progreso = i / 10.0; 
                    
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            prgTiempo.setProgress(progreso);
                        }
                    });
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
                
                Platform.runLater( new Runnable() {
                    @Override
                    public void run() {
                        btnEsperar.setDisable(false);
                    }
                });
            }
        });
        
        t1.start();
    }
}
