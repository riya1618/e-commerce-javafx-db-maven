package org.dnyanyog.login;

import org.dnyanyog.common.StageHolder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen {

	public void show() throws Exception {

		StageHolder.stage.setTitle("Customer Login");

		Parent actorGroup = FXMLLoader.load(getClass().getResource("/main/LoginScreen.fxml"));

		Scene scene = new Scene(actorGroup, 600, 400);
		StageHolder.stage.setScene(scene);

		StageHolder.stage.show();
	}

}