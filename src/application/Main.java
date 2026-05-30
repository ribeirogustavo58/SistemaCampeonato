package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(
                getClass().getResource("/view/telaPrincipal.fxml")
        );

        Scene scene new Scene(root, 900, 600);

        stage.setTitle("E-Sports Championship CS2");

        Stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        lauch();
    }
}