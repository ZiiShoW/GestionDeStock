/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DaoAdmin;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author root
 */
public class AdminController implements Initializable {
    
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtPass;
    @FXML
    private Button btnLogin ;
    
     @FXML
     private void btnLogA(){
         
         DaoAdmin da = new DaoAdmin();
         
         
        System.out.println(da.log(txtName.getText(), txtPass.getText())); 
     
     }
     

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
