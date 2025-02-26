package org.dnyanyog.update_user;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.user.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class UpdateUserController {
	@FXML
	TextField userNameToUpdate;

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

	public void updateUserButtonClick() throws Exception {
		String query = "Update users Set userName ='" + userName.getText() + "',userId='"
				+ userId.getText() + "',userEmail = '" + userEmail.getText() + "',password='"+password.getText()+"',confirmPassword='"+confirmPassword.getText()+"' "
						+ "where userName='"+userNameToUpdate.getText()+"' ";

		DBUtils.executeQuery(query);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("User Updated Successfully");
		alert.setContentText("User Updated Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
		new UserManagement().show();
	}

	public void backButtonClick() throws Exception {
		new UserManagement().show();

	}

}
