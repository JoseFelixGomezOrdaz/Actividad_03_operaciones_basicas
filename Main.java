package main;
import views.ViewCalculadora;
import models.ModelCalculadora;
import controllers.ControllerCalculadora;


public class Main {

    public static void main(String[] args) {
        ModelCalculadora modelcalculadora = new ModelCalculadora();
        ViewCalculadora viewcalculadora = new ViewCalculadora();
        ControllerCalculadora controllercalculadora = new ControllerCalculadora(modelcalculadora , viewcalculadora );
    }
    
}
