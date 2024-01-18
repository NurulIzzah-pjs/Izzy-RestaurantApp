package com.example.restaurantapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

public class APPS extends Application {


    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(APPS.class.getResource("RESTAURANT.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("STARTAPPS.fxml"));
        Scene scene = new Scene(root, 397, 282);
        stage.setTitle("Hello! Welcome To Our Restaurant!!");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(event -> {
            event.consume();
            onExitClick(stage);
        });
    }
//------------------------------------------------------
//
//    @FXML
//    private TextField ID;
//
//    @FXML
//    private PasswordField Pass;
//
//
//    @FXML
//
//    public User user;
//    private User getAuthenticatedUser(String id, String password) {
//        User user = null;
//
//        final String DB_URL = "jdbc:mysql://localhost:3306/catrestaurat";
//        final String USERNAME = "CatDBuser";
//        final String PASSWORD = "CatDBpassword";
//
//        try{
//            Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//            System.out.println("Successfully connect");
//            // Connected to database successfully...
//
//            Statement stmt = conn.createStatement();
//            String sql = "SELECT * FROM users WHERE name=? AND password=?";
//            PreparedStatement preparedStatement = conn.prepareStatement(sql);
//            preparedStatement.setString(1, id);
//            preparedStatement.setString(2, password);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                user = new User();
//                user.id = resultSet.getString("name");
//                user.password = resultSet.getString("password");
//            }
//
//            stmt.close();
//            conn.close();
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return user;
//    }
//    public static void main(String[] args) {
//        APPS loginForm = new APPS();
//        User user = loginForm.user;
//        launch();
//        if (user != null) {
//            System.out.println("Successful Authentication of: " + user.id);
//        }
//        else {
//            System.out.println("Authentication canceled");
//        }
//    }
//
//    Scene scene;
//    Stage stage;
//    private Parent root;
//    @FXML
//    private void LoginClick(ActionEvent event) throws IOException {
//        String id = ID.getText();
//        String password =Pass.getText();
//        user= getAuthenticatedUser(id,password);
//
//        if (user != null) {
//            Parent root= FXMLLoader.load(getClass().getResource("RESTAURANT.fxml"));
//            stage =(Stage)((Node)event.getSource()).getScene().getWindow();
//            scene = new Scene(root);
//            stage.setScene(scene);
//            stage.show();
//        }
//        else {
//            System.out.println("email or password invalid!! try again..");
//        }
//
//    }
//@FXML
//Stage scene;
//    Scene scene;
//    private Parent root;
//
//    public void StaffLoginClick(ActionEvent event) throws IOException
//    {
//        Parent root= FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
//        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    }

    public void onExitClick(Stage stage) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to exit!");
        alert.setContentText("Are you sure you want to exit?");

        if (alert.showAndWait().get()== ButtonType.OK){
            System.out.println("You succesfully Exit!!");
            stage.close();

        }

    }
}

