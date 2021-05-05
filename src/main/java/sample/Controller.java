package sample;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private JFXTextField display;
    int n1,n2;
    int symbol;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        n1=n2=0;
        symbol=0;

    }


    public void onDigitPress(ActionEvent e) {
        String s=((JFXButton)e.getSource()).getText();
        display.setText(display.getText()+s);
    }

    public void onAddPress(ActionEvent actionEvent) {
    }

    public void onSubtractPress(ActionEvent actionEvent) {
    }

    public void onMultiplyPress(ActionEvent actionEvent) {
    }

    public void onEqualPress(ActionEvent actionEvent) {
    }

    public void onDivPress(ActionEvent actionEvent) {
    }

    public void onClearPress(ActionEvent actionEvent) {
    }
}
