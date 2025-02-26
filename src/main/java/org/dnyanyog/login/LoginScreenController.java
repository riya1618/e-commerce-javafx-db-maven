package org.dnyanyog.login;

import java.sql.ResultSet;
import org.dnyanyog.database.DBUtils;
import org.dnyanyog.welcome.WelcomeScreen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginScreenController {
	@FXML
	TextField userId;

	@FXML
	TextField password;

	@FXML
	Label errorMessage;

	public void loginButtonClick() throws Exception {

		String query = "SELECT * FROM users WHERE userId='" + userId.getText() + "' AND password = '"
				+ password.getText() + "'";
		ResultSet rs = DBUtils.executeQueryGetResult(query);

		if (rs.next()) {
			errorMessage.setText("Login Successfull");
			WelcomeScreen welcomeScreen = new WelcomeScreen();
			welcomeScreen.show();

		} else {
			errorMessage.setText("Login Failed");
		}

	}
}