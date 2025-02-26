package org.dnyanyog.update_user;

import org.dnyanyog.common.StageHolder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UpdateUser  {
	public static void main(String[] args) {
		Application.launch(args);
	}

	public void show() throws Exception {

		Parent actorGroup = FXMLLoader.load(getClass().getResource("/user/UpdateUser.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageHolder.stage.setScene(scene);

		StageHolder.stage.show();
	}

}