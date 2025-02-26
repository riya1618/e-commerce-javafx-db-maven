package org.dnyanyog.update_product;

import org.dnyanyog.common.StageHolder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UpdateProduct {
	public static void main(String[] args) {
		Application.launch(args);
	}

	
	public void show( ) throws Exception {
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/product/UpdateProduct.fxml"));
		
		Scene scene = new Scene(actorGroup, 600, 400);
		StageHolder.stage.setTitle("Update Product");
		StageHolder.stage.setScene(scene);

		StageHolder.stage.show();
	}


}
