/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Marius
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
     @FXML
    private TextField text;
    
    private Student myStudent;
    private Boolean access= false;
     
    
    @FXML
    private void textAction(ActionEvent event) {
        if(access){
            label.setText("Correct name :)");
        }
        else{
            label.setText("Wrong,try again ;)");
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      myStudent=new Student();
        
        text.textProperty().addListener(new ChangeListener(){
    
     @Override
     public void changed(ObservableValue observable,Object oldVal,Object newVal){
    access=text.getText().equals(myStudent.getName());
    }
});
    }
}
    

