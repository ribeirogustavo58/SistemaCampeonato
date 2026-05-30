package controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Partida;
import model.Time;
import util.Dados;

public class PartidasController {

    @FXML
    private ComboBox<Time> cbTimeA;

    @FXML
    private ComboBox<Time> cbTimeB;

    @FXML
    private TextField txtScoreA;

    @FXML
    private TextField txtScoreB;

    @FXML
    private TableView<Partida> tabelaPartidas;

    @FXML
    public void initialize() {

        cbTimeA.setItems(
                FXCollections.observableArrayList(Dados.times)
        );

        cbTimeB.setItems(
                FXCollections.observableArrayList(Dados.times)
        );

        tabelaPartidas.setItems(
                FXCollections.observableArrayList(Dados.partidas)
        );
    }

    @FXML
    private void lancarPartida() {

        Time timeA = cbTimeA.getValue();
        Time timeB = cbTimeB.getValue();

        int scoreA = Integer.parseInt(txtScoreA.getText());
        int scoreB = Integer.parseInt(txtScoreB.getText());

        Partida partida = new Partida(
                timeA,
                timeB,
                scoreA,
                scoreB
        );

        Dados.partidas.add(partida);

        tabelaPartidas.setItems(
                FXCollections.observableArrayList(Dados.partidas)
        );

        txtScoreA.clear();
        txtScoreB.clear();
    }
}