package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Time;
import util.Dados;

public class CadastroTimeController {

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtCapitao;

    @FXML
    private void cadastrar() {

        String nome = txtNome.getText();
        String capitao = txtCapitao.getText();

        if(nome.isEmpty() || capitao.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Preencha todos os campos!");
            alert.show();

            return;
        }

        Time time = new Time(
                nome,
                "CS2",
                capitao,
                5
        );

        Dados.times.add(time);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Time cadastrado com sucesso!");
        alert.show();

        txtNome.clear();
        txtCapitao.clear();
    }
}