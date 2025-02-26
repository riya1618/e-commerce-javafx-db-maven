package org.dnyanyog.delete_user;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.user.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteUserController {
	@FXML
	TextField deleteUserName;

	@FXML
	Label deleteMessage;

	public void deleteUserButtonClick() throws Exception {
		String executeQuery = ("DELETE FROM users WHERE userName = '" + deleteUserName.getText() + "';");
		DBUtils.executeQuery(executeQuery);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("User Deleted Successfully");
		alert.setContentText("User Deleted Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
	}

	public void backButtonClick() throws Exception {
		new UserManagement().show();

	}
}
