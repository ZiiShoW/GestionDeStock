/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Login extends Application {

    @Override
    public void start(Stage stage) throws Exception {
       
       

      Parent root = FXMLLoader.load(getClass().getResource("/GUI/Login.fxml"));
      
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.setTitle("Login");
      stage.show();
      

    }
    
    
    
    
    
}
