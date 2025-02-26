package org.dnyanyog.add_product;

import java.io.IOException;
import java.sql.SQLException;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.product.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class AddProductController {
	@FXML
	TextField productName;

	@FXML
	TextField productPrice;

	@FXML
	TextField productQuantity;

	public void addProductSubmitClick() throws SQLException, IOException {

		String addProductQuery = ("INSERT INTO products(productName,productPrice,productQuantity) VALUES ('"
				+ productName.getText() + "', '" + productPrice.getText() + "', '" + productQuantity.getText() + "');");
		DBUtils.executeQuery(addProductQuery);
		System.out.println("product Added Successfully");
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Product Added Successfully");
		alert.setContentText("Product Added Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();
        
	}
	public void backButtonClick() throws Exception {
		new ProductManagement().show();	
	}

}
