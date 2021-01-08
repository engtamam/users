package controler;

import java.io.IOException;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.Users;

public class UsersContoller  {

    @FXML
    private TableView<Users> col_table;
    @FXML
    private TableColumn col_userName;
    @FXML
    private TableColumn col_password;
    @FXML
    private TableColumn col_email;

    @FXML
    void onAdd(ActionEvent event) {
    	Stage addStage = new Stage();
    	FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(getClass().getResource("/interfaces/SignUp.fxml"));
    	try {
			addStage.setScene(new Scene(loader.load()));
		} catch (IOException e) {}
    	addStage.setTitle("add user");
    	addStage.show();
    }

    @FXML
    void onDelete(ActionEvent event) {

    }

    @FXML
    void onUpdate(ActionEvent event) {

    }
}
