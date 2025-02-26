package org.dnyanyog.product;

import org.dnyanyog.add_product.AddProduct;
import org.dnyanyog.delete_product.DeleteProduct;
import org.dnyanyog.search_product.SearchProduct;
import org.dnyanyog.update_product.UpdateProduct;
import org.dnyanyog.welcome.WelcomeScreen;

public class ProductManagementController {
	public void addProductButtonClick() throws Exception {
		new AddProduct().show();

	}

	public void updateProductButtonClick() throws Exception {
		new UpdateProduct().show();

	}

	public void searchProductButtonClick() throws Exception {
		new SearchProduct().show();

	}

	public void deleteProductButtonClick() throws Exception {
		new DeleteProduct().show();

	}

	public void backButtonClick() throws Exception {
		new WelcomeScreen().show();

	}

}
