package controler;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Users;
public class SignUpControler {

    @FXML
    private TextField username;

    @FXML
    private TextField password;
    @FXML
    private Button close;

    @FXML
    private TextField email;

	Users u;
    @FXML
    void onSubmit(ActionEvent event) {
    	if(username.getText().equals("") || password.getText().equals("") || email.getText().equals(""))
    		JOptionPane.showMessageDialog(null, "username, password or email is blank");

    	else
    	 u = new Users(username.getText(),password.getText(),email.getText());


    }
}
