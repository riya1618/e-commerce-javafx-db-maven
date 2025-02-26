package org.dnyanyog.welcome;

import java.io.IOException;

import org.dnyanyog.product.ProductManagement;
import org.dnyanyog.user.UserManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class WelcomeScreenController {
	@FXML
	Button userManagement;

	@FXML
	Button productManagement;

	@FXML
	Button exit;

	public void userManagementButtonClick() throws Exception {
		new UserManagement().show();
	}

	public void productManagementButtonClick() throws IOException {
		new ProductManagement().show();

	}

	public void exitButtonClick() {
		System.exit(0);
	}

}
