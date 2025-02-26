package org.dnyanyog.update_product;

import java.sql.SQLException;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.product.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateProductController {
	@FXML
	private TextField searchProductrNameToUpdate;

	@FXML
	private TextField productName;

	@FXML
	private TextField productPrice;

	@FXML
	private TextField productQuantity;

	@FXML
	private Label errorMessage;

	public void updateButtonClick() throws SQLException, Exception {

		String query = "Update products Set productName ='" + productName.getText() + "',productQuantity='"
				+ productQuantity.getText() + "',productPrice = '" + productPrice.getText() + "'";

		DBUtils.executeQuery(query);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Product Updated Successfully");
		alert.setContentText("Product Edited Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
		new ProductManagement().show();
	}

	public void backButtonClick() throws Exception {
		new ProductManagement().show();

	}

}
