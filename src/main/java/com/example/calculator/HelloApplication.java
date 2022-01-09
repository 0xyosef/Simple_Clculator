package com.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {
        Label Yosef=new Label("Yosef Mahmoud");
        Label id=new Label(" 20-00740");
        Label result=new Label();
        Label result_1=new Label();
        Label result_2=new Label();
        Label result_3=new Label();

        //label sum
        Label sum=new Label("+");
        //label mines
        Label mines=new Label("-");
        //label *
        Label mul=new Label("*");
        //label /
        Label div=new Label("/");

        //button Equals
        Button Equals=new Button("=");
        Button Equals1=new Button("=");
        Button Equals2=new Button("=");
        Button Equals_1=new Button("=");
        //TextField sum
        TextField textF_sum=new TextField();
        TextField textF_sum1=new TextField();
        //TextField mines
        TextField textF_mines=new TextField();
        TextField textF_mines1=new TextField();
        //TextField multiply
        TextField textF_mul=new TextField();
        TextField textF_mul1=new TextField();
       //TextField div
        TextField textF_div=new TextField();
        TextField textF_div1=new TextField();



        GridPane grid=new GridPane();
        grid.setPadding(new Insets(20,20,20,10));
        grid.setHgap(15);
        grid.setVgap(15);
        grid.setAlignment(Pos.TOP_CENTER);
        VBox box=new VBox();
        //label Name.id
        Yosef.setTranslateX(150);
        Yosef.setTranslateY(0);
        id.setTranslateX(160);
        id.setTranslateY(20);
        grid.getChildren().add(Yosef);
        grid.getChildren().add(id);

        //grind sum
        grid.add(textF_sum,0,2);
        grid.add(textF_sum1,2,2);
        grid.add(sum,1,2);
        grid.add(Equals,3,2);
        grid.add(result,4,2);



        //grind mines
        grid.add(textF_mines,0,3);
        grid.add(textF_mines1,2,3);
        grid.add(mines,1,3);
        grid.add(Equals1,3,3);
        grid.add(result_1,4,3);

        //grind multiply
        grid.add(textF_mul,0,4);
        grid.add(textF_mul1,2,4);
        grid.add(mul,1,4);
        grid.add(Equals2,3,4);
        grid.add(result_2,4,4);
        //grind div
        grid.add(textF_div,0,5);
        grid.add(textF_div1,2,5);
        grid.add(div,1,5);
        grid.add(Equals_1,3,5);
        grid.add(result_3,4,5);
            //Action
        Equals.setOnAction(actionEvent -> {
            //sum operate
            try {


            int n1=Integer.parseInt(textF_sum.getText().toString());
            int n2=Integer.parseInt(textF_sum1.getText().toString());
            int Sum=n1+n2;
            result.setText(String.valueOf(Sum));
            }
            catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Invailed Value", ButtonType.OK);
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
            }
        });

        //mines operation
        Equals1.setOnAction(actionEvent1 -> {
            try {


            int n_mines=Integer.parseInt(textF_mines.getText().toString());
            int n_mines1=Integer.parseInt(textF_mines1.getText().toString());
            int Mines=n_mines-n_mines1;
            result_1.setText(String.valueOf(Mines));
            }
            catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Invailed Value", ButtonType.OK);
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
            }
        });
        Equals2.setOnAction(actionEvent1 -> {
            //multiply op
                try {
                    int n_mul = Integer.parseInt(textF_mul.getText().toString());
                    int n_mul1 = Integer.parseInt(textF_mul1.getText().toString());
                    int Mul = n_mul * n_mul1;
                    result_2.setText(String.valueOf(Mul));
                }
                catch (Exception e){
                    Alert alert = new Alert(Alert.AlertType.INFORMATION, "Invailed Value", ButtonType.OK);
                    alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                    alert.show();
                }



        });
        Equals_1.setOnAction(actionEvent -> {
            try {
            int n_div=Integer.parseInt(textF_div.getText().toString());
            int n_div1=Integer.parseInt(textF_div1.getText().toString());
            int Div=(n_div / n_div1);

            result_3.setText(String.valueOf(Div));
            }
            catch (Exception e){
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "Invailed Value", ButtonType.OK);
                alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                alert.show();
            }
        });
        Scene scene=new Scene(grid,300,300);
        stage.setTitle("Calculator");

        stage.setMinWidth(500);
        stage.setMinHeight(300);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}