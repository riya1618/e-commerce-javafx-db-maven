package org.dnyanyog;

import org.dnyanyog.common.StageHolder;
import org.dnyanyog.login.LoginScreen;
import javafx.application.Application;
import javafx.stage.Stage;

public class EcommerceMain extends Application {
	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(Stage primaryStage)throws Exception {
		StageHolder.stage=primaryStage;
		new LoginScreen().show();
		
	}
}
