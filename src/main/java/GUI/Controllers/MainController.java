package GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.util.Objects;


public class MainController {
    @FXML
    private Button btnPlay;

    public void onClickBtnPrevious(ActionEvent actionEvent) {
        System. out. println("BtnPrevious");
    }

    public void onClickBtnPlay(ActionEvent actionEvent) {
        System. out. println("BtnPlay");
        if(Objects.equals(btnPlay.getText(), "▶"))
            btnPlay.setText("⏸");
        else btnPlay.setText("▶");



    }

    public void onClickBtnNext(ActionEvent actionEvent) {
        System. out. println("BtnNext");
    }

    public void onSldrSong(MouseEvent mouseEvent) {
        System. out. println("SldrSong");
    }

    public void onSldrVolume(MouseEvent mouseEvent) {
        System. out. println("SldrVolume");
    }

    public void onClickBtnFilter(ActionEvent actionEvent) {
        System. out. println("BtnFilter");
    }

    public void onClickBtnPlaylistsNew(ActionEvent actionEvent) {
        System. out. println("BtnPlaylistsNew");
    }

    public void onClickBtnPlaylistsEdit(ActionEvent actionEvent) {
        System. out. println("BtnPlaylistsEdit");
    }

    public void onClickBtnPlaylistsDelete(ActionEvent actionEvent) {
        System. out. println("BtnPlaylistsDelete");
    }

    public void onClickBtnUp(ActionEvent actionEvent) {
        System. out. println("BtnUp");
    }

    public void onClickBtnDown(ActionEvent actionEvent) {
        System. out. println("BtnDown");
    }

    public void onClickBtnSelectedPDelete(ActionEvent actionEvent) {
        System. out. println("BtnSelectedPDelete");
    }

    public void onClickBtnTransfer(ActionEvent actionEvent) {
        System. out. println("BtnTransfer");
    }

    public void onClickBtnAllSongsNew(ActionEvent actionEvent) {
        System. out. println("BtnAllSongsNew");
    }

    public void onClickBtnAllSongsEdit(ActionEvent actionEvent) {
        System. out. println("BtnAllSongsEdit");
    }

    public void onClickBtnAllSongsDelete(ActionEvent actionEvent) {
        System. out. println("BtnAllSongsDelete");
    }
}
