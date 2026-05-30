package controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import model.Time;
import util.Dados;

public class TabelaController {

    @FXML
    private TableView<Time> tabelaTimes;

    @FXML
    private TableColumn<Time, Integer> colPos;

    @FXML
    private TableColumn<Time, String> colEquipe;

    @FXML
    private TableColumn<Time, Integer> colPontos;

    @FXML
    private TableColumn<Time, Integer> colVitorias;

    @FXML
    private TableColumn<Time, Integer> colDerrotas;

    @FXML
    private TableColumn<Time, Integer> colSaldo;

    @FXML
    public void initialize() {

        tabelaTimes.setItems(
                FXCollections.observableArrayList(Dados.times)
        );
    }
}