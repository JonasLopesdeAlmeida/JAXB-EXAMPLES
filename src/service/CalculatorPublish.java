package service;

import javax.xml.ws.Endpoint;
import java.io.IOException;


public class CalculatorPublish {
    public static void main(String[] args) {

        final String url = "http://localhost:9999/calculatorService";
        System.out.println("Publishing class Calculator at endpoint: " + url);

        //Normally an interface (SEI or Service Endpoint Interface)
        //This is a SIB - Service Implementation Bean

        //Code to establish endpoint
        Endpoint endpoint = Endpoint.publish(url, new Calculator());

        //Code to stop this service with another service
        //The stopper is built with this service, so it will stop with it.
        try {
            new CalculatorStopper(9998, endpoint);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }



