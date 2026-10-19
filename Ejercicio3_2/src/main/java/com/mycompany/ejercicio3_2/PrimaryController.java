package com.mycompany.ejercicio3_2;

import java.util.Random;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class PrimaryController{
    // controles
    @FXML private Button btnIniciar;
    @FXML private ProgressBar prgLiebre, prgTortuga;
    @FXML private Label lblLiebre, lblTortuga;
    
    // objetos
    private Animal a;

    @FXML
    private void iniciar() {
        btnIniciar.setDisable(true);
        prgLiebre.setProgress(0.0);
        prgLiebre.setVisible(true);
        prgTortuga.setProgress(0.0);
        prgTortuga.setVisible(true);
        
        a = new Animal("Liebre");
        lblLiebre.setText(a.toString());
        String laliebre = lblLiebre.getText();
        
        a = new Animal("Tortuga");
        lblTortuga.setText(a.toString());
        String latortuga = lblTortuga.getText();
     
        // hilo tortuga
        Thread tortuga = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    double progreso = i * 0.01;
                    
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            prgTortuga.setProgress(progreso);
                            lblTortuga.setText( latortuga + "¡Está corriendo!" );
                            
                            if( prgLiebre.getProgress() >= 1.0 && progreso >= 1.0 )
                                btnIniciar.setDisable(false);
                        }
                    });
                    
                    try {
                        Thread.sleep(270);
                    } catch (InterruptedException e) {}
                }   
            }   
        });
        
        // hilo liebre
        Thread liebre = new Thread(new Runnable(){
            Random random = new Random();
            int duerme = 40 + random.nextInt(31);
            
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    double progreso = i * 0.01;
                    
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            prgLiebre.setProgress(progreso);   
                            
                            if( prgTortuga.getProgress() >= 1.0 && progreso >= 1.0 )
                                btnIniciar.setDisable(false);
                        }
                    });
                    
                    if ( i == duerme ) {
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lblLiebre.setText( laliebre + "¡Se durmió!" );
                            }
                        });
                        
                        while( prgTortuga.getProgress() < progreso * 2 && prgTortuga.getProgress() < 0.96 ){
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {}
                        }  
                    } else {
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                lblLiebre.setText( laliebre + "¡Está corriendo!" );
                            }
                        });
                        
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {}
                    }  
                }
            }   
        });
        
        tortuga.start();
        liebre.start();    
    }
}
