package org.dnyanyog.delete_product;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.product.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DeleteProductController {
	
	
	@FXML
	TextField deleteProductName;

	@FXML
	Label deleteProductMessage;

	public void deleteButtonClick() throws Exception {
		
		String executeQuery = ("DELETE FROM products WHERE productName = '" + deleteProductName.getText() +"'");
		DBUtils.executeQuery(executeQuery);
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Product Deleted Successfully");
		alert.setContentText("Product Deleted Successfully!");
		alert.setHeaderText("Success!!");
		alert.show();

	}

	public void backButtonClick() throws Exception {
		new ProductManagement().show();

	}

}
