/* Shaun Dobbs
 * CSCI 1302
 * Assignment 4
 * March 9, 2016
 * Purpose : Create a graphical user interface that represents a simple cell phone
 */

package passign4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class PAssign4 extends Application {

    public void start(Stage primaryStage) {
        Image img = new Image("snake.jpg");
        ImageView imgView = new ImageView(img);
        imgView.setFitHeight(150);
        imgView.setFitWidth(150);
        
        
        Button b0 = new Button("0");
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        Button b4 = new Button("4");
        Button b5 = new Button("5");
        Button b6 = new Button("6");
        Button b7 = new Button("7");
        Button b8 = new Button("8");
        Button b9 = new Button("9");
        Button pound = new Button("#");
        Button star = new Button("*");
        Button call = new Button("CALL");
        Button end = new Button("END");

        call.setStyle("-fx-color:green;");
        end.setStyle("-fx-color:red;");

        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.TOP_CENTER);
        gp1.setHgap(5.0);
        gp1.setVgap(5.0);
        gp1.add(b1, 0, 0);
        gp1.add(b2, 1, 0);
        gp1.add(b3, 2, 0);
        gp1.add(b4, 0, 1);
        gp1.add(b5, 1, 1);
        gp1.add(b6, 2, 1);
        gp1.add(b7, 0, 2);
        gp1.add(b8, 1, 2);
        gp1.add(b9, 2, 2);
        gp1.add(star, 0, 3);
        gp1.add(b0, 1, 3);
        gp1.add(pound, 2, 3);

        GridPane gp2 = new GridPane();
        gp2.setAlignment(Pos.TOP_CENTER);
        gp2.setHgap(3.0);
        gp2.setVgap(2.0);
        gp2.add(call, 0, 4);
        gp2.add(end, 2, 4);

        VBox vb = new VBox();
        vb.getChildren().addAll(imgView, gp1, gp2);

        Scene scene = new Scene(vb, 200, 330);

        vb.setAlignment(Pos.CENTER);

        primaryStage.setTitle("Nokia Brick Phone");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
