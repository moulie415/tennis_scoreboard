package com.company;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;
import java.util.Scanner;



/**
 * Created by MOULIE415 on 26/11/2016.
 */
public class ViewFX extends Application {
    private Label prevSets = new Label("PREVIOUS SETS");
    private Label sets = new Label("SETS");
    private Label games = new Label("GAMES");
    private Label points = new Label("POINTS");

    private TextField p1FirstSet = new TextField();
    private TextField p2FirstSet = new TextField();
    private TextField p1SecondSet = new TextField();
    private TextField p2SecondSet = new TextField();
    private TextField p1ThirdSet = new TextField();
    private TextField p2ThirdSet = new TextField();
    private TextField p1FourthSet = new TextField();
    private TextField p2FourthSet = new TextField();

    private TextField p1Name = new TextField();
    private TextField vs = new TextField("VS.");
    private TextField p2Name = new TextField();

    private TextField p1Sets = new TextField("0");
    private TextField p2Sets = new TextField("0");

    private TextField p1Games = new TextField("0");
    private TextField p2Games = new TextField("0");

    private TextField p1Points = new TextField("0");
    private TextField p2Points = new TextField("0");

    private Button p1WinPoint = new Button("Win Point");
    private Button p2WinPoint = new Button("Win Point");
    private ControllerFX controller;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter name of Player 1");
        String player1 = keyboard.nextLine().toUpperCase();

        System.out.println("enter name of Player 2");
        String player2 = keyboard.nextLine().toUpperCase();

        Match model = new Match();
        controller = new ControllerFX(model, this,  player1, player2);
        primaryStage.setTitle("Tennis");


        p1WinPoint.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               controller.buttonClicked(event);
            }
        });
        p2WinPoint.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                controller.buttonClicked(event);
            }
        });
        HBox root = new HBox();
        VBox buttons = new VBox();
        BorderPane scoring = new BorderPane();
        GridPane section3 = new GridPane();
        VBox section2 = new VBox();
        VBox section1 = new VBox();
        GridPane setsBox  = new GridPane();
        HBox labelBox = new HBox();
        HBox topGap = new HBox();
        HBox bottomGap = new HBox();

        setsBox.setHgap(2);
        setsBox.setVgap(2);
        section3.setHgap(2);
        section3.setVgap(2);

        setsBox.setPadding(new Insets(0,2,0,0));

        p1WinPoint.getStyleClass().add("button-class");
        p2WinPoint.getStyleClass().add("button-class");

        prevSets.setPadding(new Insets(0,0,0,2));
        prevSets.getStyleClass().add("scoring-text");
        sets.getStyleClass().add("scoring-text");
        games.getStyleClass().add("scoring-text");
        points.getStyleClass().add("scoring-text");

        p1Name.getStyleClass().add("names-section");
        vs.getStyleClass().add("names-section");
        p2Name.getStyleClass().add("names-section");

        p1FirstSet.getStyleClass().add("scoring");
        p2FirstSet.getStyleClass().add("scoring");
        p1SecondSet.getStyleClass().add("scoring");
        p2SecondSet.getStyleClass().add("scoring");
        p1ThirdSet.getStyleClass().add("scoring");
        p2ThirdSet.getStyleClass().add("scoring");
        p1FourthSet.getStyleClass().add("scoring");
        p2FourthSet.getStyleClass().add("scoring");

        p1Sets.getStyleClass().add("scoring");
        p2Sets.getStyleClass().add("scoring");
        p1Games.getStyleClass().add("scoring");
        p2Games.getStyleClass().add("scoring");
        p1Points.getStyleClass().add("scoring");
        p2Points.getStyleClass().add("scoring");
        root.setStyle("-fx-background-color: #326500;");

        topGap.setPrefSize(20, 30);
        bottomGap.setPrefSize(20, 30);

        p1WinPoint.setPrefSize(250,115);
        p2WinPoint.setPrefSize(250,115);

        p1FirstSet.setPrefSize(60, 30);
        p1FirstSet.setEditable(false);
        p2FirstSet.setPrefSize(60, 30);
        p2FirstSet.setEditable(false);
        p1SecondSet.setPrefSize(60, 30);
        p1SecondSet.setEditable(false);
        p2SecondSet.setPrefSize(60, 30);
        p2SecondSet.setEditable(false);
        p1ThirdSet.setPrefSize(60, 30);
        p1ThirdSet.setEditable(false);
        p2ThirdSet.setPrefSize(60, 30);
        p2ThirdSet.setEditable(false);
        p1FourthSet.setPrefSize(60, 30);
        p1FourthSet.setEditable(false);
        p2FourthSet.setPrefSize(60, 30);
        p2FourthSet.setEditable(false);

        p1Sets.setPrefSize(60, 30);
        p1Sets.setEditable(false);
        p2Sets.setPrefSize(60, 30);
        p2Sets.setEditable(false);
        p1Games.setPrefSize(60, 30);
        p1Games.setEditable(false);
        p2Games.setPrefSize(60, 30);
        p2Games.setEditable(false);
        p1Points.setPrefSize(75, 30);
        p1Points.setEditable(false);
        p2Points.setPrefSize(75, 30);
        p2Points.setEditable(false);

        labelBox.getChildren().add(prevSets);
        setsBox.add(p1FirstSet, 1, 2);
        setsBox.add(p1SecondSet, 2, 2);
        setsBox.add(p1ThirdSet, 3, 2);
        setsBox.add(p1FourthSet, 4, 2);

        setsBox.add(p2FirstSet, 1, 3);
        setsBox.add(p2SecondSet, 2, 3);
        setsBox.add(p2ThirdSet, 3, 3);
        setsBox.add(p2FourthSet, 4, 3);

        section2.getChildren().add(p1Name);
        section2.getChildren().add(vs);
        section2.getChildren().add(p2Name);
        p1Name.setAlignment(Pos.CENTER);
        p1Name.setEditable(false);
        vs.setAlignment(Pos.CENTER);
        vs.setEditable(false);
        p2Name.setAlignment(Pos.CENTER);
        p2Name.setEditable(false);
        section2.setAlignment(Pos.CENTER);

        section3.add(sets, 1, 1);
        section3.add(games, 2, 1);
        section3.add(points, 3, 1);
        section3.add(p1Sets, 1, 2);
        section3.add(p1Games, 2, 2);
        section3.add(p1Points, 3, 2);
        section3.add(p2Sets, 1, 3);
        section3.add(p2Games, 2, 3);
        section3.add(p2Points, 3, 3);

        section1.getChildren().add(labelBox);
        section1.getChildren().add(setsBox);

        scoring.setTop(topGap);
        scoring.setLeft(section1);
        scoring.setCenter(section2);
        scoring.setRight(section3);
        scoring.setBottom(bottomGap);
        buttons.getChildren().add(p1WinPoint);
        buttons.getChildren().add(p2WinPoint);
        root.getChildren().add(scoring);
        root.getChildren().add(buttons);

        Scene scene = new Scene(root);
        //use css file for some of the styling, also necessary for reapplying hover/pressed colours
        scene.getStylesheets().add("styles.css");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.sizeToScene();

        //remove highlighting from textfields as requestFocus() not working
        p1FirstSet.setFocusTraversable(false);
        p2FirstSet.setFocusTraversable(false);
        p1SecondSet.setFocusTraversable(false);
        p2SecondSet.setFocusTraversable(false);
        p1ThirdSet.setFocusTraversable(false);
        p2ThirdSet.setFocusTraversable(false);
        p1FourthSet.setFocusTraversable(false);
        p2FourthSet.setFocusTraversable(false);
        p1Name.setFocusTraversable(false);
        vs.setFocusTraversable(false);
        p2Name.setFocusTraversable(false);
        p1Sets.setFocusTraversable(false);
        p2Sets.setFocusTraversable(false);
        p1Games.setFocusTraversable(false);
        p2Games.setFocusTraversable(false);
        p1Points.setFocusTraversable(false);
        p2Points.setFocusTraversable(false);

        primaryStage.show();
    }

    /**
     * set points text to ad if it is that players advantage
     */
    public void setP1Van() { p1Points.setText("Ad");}

    public void setP2Van() { p2Points.setText("Ad");}

    public void setP1FirstSet(int set) { p1FirstSet.setText(Integer.toString(set));}

    public void setP2FirstSet(int set) { p2FirstSet.setText(Integer.toString(set));}

    public void setP1SecondSet(int set) { p1SecondSet.setText(Integer.toString(set)); }

    public void setP2SecondSet(int set) { p2SecondSet.setText(Integer.toString(set)); }

    public void setP1ThirdSet(int set) { p1ThirdSet.setText(Integer.toString(set)); }

    public void setP2ThirdSet(int set) { p2ThirdSet.setText(Integer.toString(set)); }

    public void setP1FourthSet(int set) { p1FourthSet.setText(Integer.toString(set)); }

    public void setP2FourthSet(int set) {p2FourthSet.setText(Integer.toString(set)); }

    public void setP1Sets(int sets) { p1Sets.setText(Integer.toString(sets)); }

    public void setP2Sets(int sets) {p2Sets.setText(Integer.toString(sets));}

    public void setP1Games(int game) { p1Games.setText(Integer.toString(game));}

    public void setP2Games(int game) { p2Games.setText(Integer.toString(game));}

    public void setP1Points(int points) {p1Points.setText(Integer.toString(points)); }

    public void setP2Points(int points) {p2Points.setText(Integer.toString(points));}

    /**
     * needed so that controller can access button compare to button clicked
     * @return player 1s button
     */
    public Button getP1WinPoint() {
        return p1WinPoint;
    }

    /**
     * call this function when match has been won so buttons are no longer clickable
     */
    public void disableButtons() {
        p1WinPoint.setDisable(true);
        p2WinPoint.setDisable(true);
    }

    /**
     * set the names of players to be displayed
     * @param p1 player 1 name
     * @param p2 player 2 name
     */
    public void setNamesText(String p1, String p2) {
        p1Name.setText(p1);
        p2Name.setText(p2);
    }

    /**
     * when match has been won update the text box to show the winning player
     * @param player the player that won
     */
    public void setWinningText(String player) {
        p1Name.setText(player +" WINS!!!");
        vs.setText(null);
        p2Name.setText(null);
    }

    public static void main(String[] args) {
        launch(args);
    }

}

