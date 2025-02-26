package org.dnyanyog.welcome;

import org.dnyanyog.common.StageHolder;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class WelcomeScreen {
	public void show() throws Exception {
		StageHolder.stage.setTitle("Customer Login");

		Parent actorGroup = FXMLLoader.load(getClass().getResource("/main/Welcome.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageHolder.stage.setScene(scene);

		StageHolder.stage.show();
	}
	

}
