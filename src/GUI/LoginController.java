/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author root
 */
public class LoginController implements Initializable {

    
    @FXML
    private Label lblLog;
    @FXML
    private Button btnAdmin;
    @FXML
    private Button btnUser;
    @FXML
    private void AdminLog(ActionEvent event) throws IOException{
    
    Parent parent = FXMLLoader.load(getClass().getResource("/GUI/Admin.fxml"));
    Stage stage =new Stage();
    Scene scene = new Scene(parent);
    stage.setScene(scene);
    stage.setTitle("Admin Login");
    stage.show();
    
    }
    @FXML
    private void UserLog(ActionEvent event){
    
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
