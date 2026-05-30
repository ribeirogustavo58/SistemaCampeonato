package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TelaPrincipalController {

    @FXML
    private void abrirCadastro(ActionEvent event) {
        trocarTela("/view/cadastroTime.fxml");
    }

    @FXML
    private void abrirPartidas(ActionEvent event) {
        trocarTela("/view/partidas.fxml");
    }

    @FXML
    private void abrirTabela(ActionEvent event) {
        trocarTela("/view/tabela.fxml");
    }

    private void trocarTela(String caminho) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(caminho));

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}