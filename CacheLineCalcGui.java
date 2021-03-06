import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class CacheLineCalcGui extends Application {

    public void start(Stage stage){
        StringBuilder builder = new StringBuilder();
        TextField cacheData = new TextField("Cache Data");
        TextField numBits = new TextField("Number of Bits");
        Label ansLabel = new Label();
        Button calculate = new Button("Hello World!");
        Pane calcPane = new VBox(10);

        builder.append("The cache line is: ");

        calculate.setOnAction((event) -> {
            int data = Integer.parseInt(cacheData.getCharacters().toString());
            int bits = Integer.parseInt(numBits.getCharacters().toString());
            double ans = ArchitectureCacheLineCalculator.calculate(data, bits);
            builder.append(ans);
            ansLabel.setText(builder.toString());
            calcPane.getChildren().add(ansLabel);
        });

        calcPane.getChildren().addAll(cacheData, numBits, calculate);
        stage.setScene(new Scene(calcPane));
        stage.show();
    }
    
}
