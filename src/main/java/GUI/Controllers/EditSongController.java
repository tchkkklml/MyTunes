package GUI.Controllers;

import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Node;

public class EditSongController {

    public TextField txtFilePath;
    public TextField txtTitle;
    public TextField txtArtist;
    public ComboBox listCategory;

    @FXML private Button onBtnCancel;
    @FXML private Button onBtnSave;


    @FXML
    private void onBtnChoose(ActionEvent actionEvent) {
    }

    @FXML
    private void onBtnCancel(ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();

    }

    @FXML
    private void onBtnSave(ActionEvent actionEvent) {

        Stage stage = (Stage) onBtnSave.getScene().getWindow();
        stage.close();
    }
}
