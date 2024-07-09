package com.example.contador;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;

public class HelloController {

    // Counters
    private int contador1 = 0;
    private int contador2 = 0;

    // Label of Numbers (1)
    @FXML
    private Label lbl_1;

    // Label of Numbers (2)
    @FXML
    private Label lbl_2;

    // Label of Name (1)
    @FXML
    public Label tf_1;

    // Label of Name (2)
    @FXML
    public Label tf_2;

    // Events with Arrow Keys (U can change it with any other key from the Keyboard)
    @FXML
    public void accion(KeyEvent event) {
        switch (event.getCode()){
            case UP:
                suma1();
                break;
            case DOWN:
                resta1();
                break;
            case RIGHT:
                suma2();
                break;
            case LEFT:
                resta2();
                break;
        }
    }

    // +1   Number 1
    public void suma1() {
        this.contador1++;
        this.lbl_1.setText(String.valueOf(this.contador1));
    }

    // -1   Number 1
    public void resta1(){
        this.contador1--;
        this.lbl_1.setText(String.valueOf(this.contador1));
    }

    // +1   Number 2
    public void suma2() {
        this.contador2++;
        this.lbl_2.setText(String.valueOf(this.contador2));
    }

    // -1   Number 2
    public void resta2(){
        this.contador2--;
        this.lbl_2.setText(String.valueOf(this.contador2));
    }

    ///////////////////////////////////// CHANGE NAMES //////////////////////////////////////

    public void initialize() {

        // Change Name of 1
        this.tf_1.setText("MUERTES");

        //Change Name of 2
        this.tf_2.setText("FLEXIONES");
    }

}