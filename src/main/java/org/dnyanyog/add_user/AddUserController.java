package org.dnyanyog.add_user;

import java.sql.SQLException;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.user.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AddUserController {
	@FXML
	TextField userName;

	@FXML
	TextField userId;

	@FXML
	TextField userEmail;

	@FXML
	TextField password;
	
	@FXML
	TextField confirmPassword;
	

	@FXML
	Label errorMessage;

	public void addUserButtonClick() throws SQLException {
		String userAddQuery = ("INSERT INTO users(userName,userId,userEmail,password,confirmPassword) VALUES ('"
				+ userName.getText() + "', '" + userId.getText() + "', '" + userEmail.getText() + "','"
				+ password.getText() + "','"+confirmPassword.getText()+"');");
		DBUtils.executeQuery(userAddQuery);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("User Added Successfully");
		alert.setContentText("User Added Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();

		System.out.println("User Added Successfully");
		errorMessage.setText("User Added Successfully");
	}

	public void backButtonClick() throws Exception {
		new UserManagement().show();
	}

}
