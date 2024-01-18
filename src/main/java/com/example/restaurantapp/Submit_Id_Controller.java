package com.example.restaurantapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.input.*;
import java.net.URL;

import java.io.IOException;

public class Submit_Id_Controller {

    @FXML
    Stage stage;
    Scene scene;

    public  TextField Input_ID;
    public int id;

    public void SubmitID(ActionEvent event) throws IOException {

        id = Integer.parseInt(Input_ID.getText());
        if (Statistics.isValidCustomer(id)) {
            Customer c = Statistics.getCustomer(id);

            FXMLLoader loader = new FXMLLoader(getClass().getResource("ORDERFOOD.fxml"));
            Parent root = loader.load();

            OrderFoodController orderFoodController = loader.getController();

            orderFoodController.displayID(String.valueOf(id));

 //           Parent root = FXMLLoader.load(getClass().getResource("ORDERFOOD.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

 //           custID = Integer.parseInt(Input_ID.getId());


        } else {
            System.out.println("Invalid Customer ID");
        }

    }



}
