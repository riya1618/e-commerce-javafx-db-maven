package org.dnyanyog.search_product;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.database.DBUtils;
import org.dnyanyog.product.ProductManagement;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SearchProductController {
	@FXML
	private TextField searchProductName;

	@FXML
	private TextField getProductName;

	@FXML
	private TextField getProductQuantity;

	@FXML
	private TextField getProductPrice;

	@FXML
	Label searchProductMessage;

	public void searchButtonClick() throws SQLException {
		String searchQuery = "SELECT * FROM products WHERE productName = '" + searchProductName.getText() + "';";
		ResultSet rs = DBUtils.executeQueryGetResult(searchQuery);
		try {
			while (rs.next()) {
				getProductName.setText(rs.getString(1));
				getProductQuantity.setText(rs.getString(2));
				getProductPrice.setText(rs.getString(3));
			}
		} catch (Exception e) {
			Alert alert = new Alert(Alert.AlertType.ERROR);
			alert.setTitle("Product Not Found");
			alert.setContentText("Product Not Found!");
			alert.setHeaderText("Product Not Found!!!!!");
			alert.show();
		}
	}

	public void backButtonClick() throws Exception {
		new ProductManagement().show();

	}

}
