package org.dnyanyog.search_user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.user.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SearchUserController {
	@FXML
	private TextField searchUserName;

	@FXML
	private TextField getUserName;

	@FXML
	private TextField getUserEmail;

	@FXML
	private TextField getUserId;


	public void searchButtonClick() throws SQLException {
		String searchQuery = "SELECT * FROM users WHERE userName = '" + searchUserName.getText() + "'";
		ResultSet rs = DBUtils.executeQueryGetResult(searchQuery);
		try {
			while (rs.next()) {
				getUserName.setText(rs.getString("userName"));
				getUserId.setText(rs.getString("userId"));
				getUserEmail.setText(rs.getString("userEmail"));
			}
		} catch (Exception e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("User Not Found");
			alert.setContentText("User Not Found!");
			alert.setHeaderText("User Not Found!!!!!");
			alert.show();
		}
	}

	public void backButtonClick() throws Exception {
		new UserManagement().show();

	}

}
