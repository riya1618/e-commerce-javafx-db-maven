package org.dnyanyog.product;

import java.io.IOException;

import org.dnyanyog.common.StageHolder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ProductManagement {
	public static void main(String[] args) {
		Application.launch(args);
	}

	public void show() throws IOException {

		Parent actorGroup = FXMLLoader.load(getClass().getResource("/product/ProductManagement.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageHolder.stage.setTitle("Product Management");
		StageHolder.stage.setScene(scene);

		StageHolder.stage.show();

	}

}
