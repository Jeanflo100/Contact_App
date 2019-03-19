package jeanflo.contact_app;

import java.io.IOException;
import jeanflo.contact_app.service.StageService;
import jeanflo.contact_app.service.ViewService;
import javafx.application.Application;
import javafx.stage.Stage;

public class ContactApp extends Application {

	public ContactApp() {

	}

	@Override
	public void start(Stage primaryStage) {
		StageService.initPrimaryStage(primaryStage);
		StageService.showView(ViewService.getView("HomeScreen"));
	}

	public static void main(String[] args) throws IOException {
		launch(args);
	}
}
