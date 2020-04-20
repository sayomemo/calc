import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class calc extends Application {
  String title1 = "calc";
  String msg2Error = "!!Input Error";
  int w1 = 400;
  int h1 = 300;
  int o1 = 10;
  int o2 = 10;
  int fontSize1 = 16;
  int spacing1 = 10;
  Font fnt1 = new Font(fontSize1);
  String ansPrefix = "";

  public static void main(String[] args){
    Application.launch(args);
  }

  public void start(Stage stage) throws Exception {
    stage.setTitle(title1);
    stage.setWidth(w1);
    stage.setHeight(h1);
    Label labArg1 = new Label("”1:");
    labArg1.setFont(fnt1);
    TextField tf1 = new TextField();
    tf1.setFont(fnt1);
    HBox hb1 = new HBox(o2);
    hb1.getChildren().addAll(labArg1, tf1);

    Label labArg2 = new Label("”2:");
    labArg2.setFont(fnt1);
    TextField tf2 = new TextField();
    tf2.setFont(fnt1);
    HBox hb2 = new HBox(o2);
    hb2.getChildren().addAll(labArg2, tf2);

    Label labAns = new Label("‰ð“š:");
    labAns.setFont(fnt1);
    TextField tfAns = new TextField();
    tfAns.setFont(fnt1);
    HBox hbAns = new HBox(o2);
    hbAns.getChildren().addAll(labAns, tfAns);
    Button btnAdd  =new Button("+");
    btnAdd.setFont(fnt1);
    btnAdd.setOnAction(
    event ->
    {
      String str1 = tf1.getText();
      String str2 = tf2.getText();
      if(str1 != null && str1.length() >= 1 &&
      str2 != null && str2.length() >= 1
      ){
        try{
          double x1 = Double.parseDouble(str1);
          double x2 = Double.parseDouble(str2);
          double y1 = x1 + x2;
          tfAns.setText(ansPrefix + y1);
        }
        catch(Exception exc){
          tfAns.setText(msg2Error);
        }
      }
    }
    );
    Button btnSbst  =new Button("-");
    btnSbst.setFont(fnt1);
    btnSbst.setOnAction(
    event ->
    {
      String str1 = tf1.getText();
      String str2 = tf2.getText();
      if(str1 != null && str1.length() >= 1 &&
      str2 != null && str2.length() >= 1
      ){
        try{
          double x1 = Double.parseDouble(str1);
          double x2 = Double.parseDouble(str2);
          double y1 = x1 - x2;
          tfAns.setText(ansPrefix + y1);
        }
        catch(Exception exc){
          tfAns.setText(msg2Error);
        }
      }
    }
    );
    Button btnMlt  =new Button("*");
    btnMlt.setFont(fnt1);
    btnMlt.setOnAction(
    event ->
    {
      String str1 = tf1.getText();
      String str2 = tf2.getText();
      if(str1 != null && str1.length() >= 1 &&
      str2 != null && str2.length() >= 1
      ){
        try{
          double x1 = Double.parseDouble(str1);
          double x2 = Double.parseDouble(str2);
          double y1 = x1 * x2;
          tfAns.setText(ansPrefix + y1);
        }
        catch(Exception exc){
          tfAns.setText(msg2Error);
        }
      }
    }
    );
    Button btnDiv  =new Button("/");
    btnDiv.setFont(fnt1);
    btnDiv.setOnAction(
    event ->
    {
      String str1 = tf1.getText();
      String str2 = tf2.getText();
      if(str1 != null && str1.length() >= 1 &&
      str2 != null && str2.length() >= 1
      ){
        try{
          double x1 = Double.parseDouble(str1);
          double x2 = Double.parseDouble(str2);
          double y1 = x1 / x2;
          tfAns.setText(ansPrefix + y1);
        }
        catch(Exception exc){
          tfAns.setText(msg2Error);
        }
      }
    }
    );

    HBox hbOprators = new HBox(o2);
    hbOprators.getChildren().addAll(btnAdd, btnSbst, btnMlt, btnDiv);
    VBox root = new VBox();
    root.setPadding(new Insets(o1, o1, o1, o1));
    root.setSpacing(spacing1);
    root.getChildren().addAll(
    hb1,
    hb2,
    hbAns,
    hbOprators
    );
    Scene scene1 = new Scene(root);
    stage.setScene(scene1);
    stage.show();
  }
}
