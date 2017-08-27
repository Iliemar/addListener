/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Marius
 */public class Student {
    private final StringProperty name;
    
    public Student(){
        name= new SimpleStringProperty("45");
    }
    public final String getName(){
        return name.get();
    }
    public final void setName(String newName){
        name.setValue(newName);
    }
    public StringProperty nameProperty(){
        return name;
    }
}
