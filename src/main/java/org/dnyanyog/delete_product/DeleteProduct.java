package org.dnyanyog.delete_product;

import org.dnyanyog.common.StageHolder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteProduct {
	public static void main(String[] args) {
		Application.launch(args);
	}

	public void show( ) throws Exception {
		Parent actorGroup = FXMLLoader.load(getClass().getResource("/product/DeleteProduct.fxml"));
		
		Scene scene = new Scene(actorGroup, 600, 400);
		StageHolder.stage.setTitle("Delete Product");
		StageHolder.stage.setScene(scene);

		StageHolder.stage.show();
	}


}
