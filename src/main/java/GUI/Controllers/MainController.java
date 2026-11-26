package GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;


public class MainController {
    @FXML
    private Button btnPlay;

    public void onClickBtnPrevious(ActionEvent actionEvent) {
        System. out. println("BtnPrevious");
    }

    public void onClickBtnPlay(ActionEvent actionEvent) {
        System.out.println("BtnPlay");
        if (Objects.equals(btnPlay.getText(), "▶"))
            btnPlay.setText("⏸");
        else btnPlay.setText("▶");



    }
        private void openWindow(String fxmlFile, String title) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();
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

    public void onClickBtnPlaylistsNew(ActionEvent actionEvent) throws IOException {
        openWindow("/PlaylistNameView.fxml","New Playlist");
    }

    public void onClickBtnPlaylistsEdit(ActionEvent actionEvent) throws IOException {
        openWindow("/PlaylistNameView.fxml","Edit Song");
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

    public void onClickBtnAllSongsNew(ActionEvent actionEvent) throws IOException {
        openWindow("/EditSongView.fxml","New Song");
    }

    public void onClickBtnAllSongsEdit(ActionEvent actionEvent) throws IOException {
        openWindow("/EditSongView.fxml","Edit Song");

    }
    public void onClickBtnAllSongsDelete(ActionEvent actionEvent) {
        System. out. println("BtnAllSongsDelete");
    }

}