package com.reservation;

import com.reservation.services.BilletService;
import com.reservation.services.ReservationService;
import com.reservation.services.UtilisateurService;
import jakarta.xml.ws.Endpoint;


public class Main {
    public static void main(String[] args) {
        String baseUrl = "http://localhost:8181/";

        // Publier les 3 services
        Endpoint.publish(baseUrl + "UtilisateurService", new UtilisateurService());
        Endpoint.publish(baseUrl + "BilletService", new BilletService());
        Endpoint.publish(baseUrl + "ReservationService", new ReservationService());

        System.out.println("Services SOAP publiés :");
        System.out.println("- " + baseUrl + "UtilisateurService?wsdl");
        System.out.println("- " + baseUrl + "BilletService?wsdl");
        System.out.println("- " + baseUrl + "ReservationService?wsdl");
    }
}