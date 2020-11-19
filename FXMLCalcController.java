import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import calculator.ArchitectureCacheLineCalculator;

public class FXMLCalcController {
    @FXML private Text actiontarget;
    @FXML private String data;
    @FXML private String bits;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        StringBuilder builder = new StringBuilder();
        builder.append("The answer is: " + ArchitectureCacheLineCalculator.calculate(Integer.parseInt(data), Integer.parseInt(bits)));
        actiontarget.setText(builder.toString());
    }

}