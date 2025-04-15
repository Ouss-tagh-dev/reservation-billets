package com.reservation.services;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "UtilisateurService")
public class UtilisateurService {

    @WebMethod(operationName = "inscrireUtilisateur")
    public String inscrireUtilisateur(
            @WebParam(name = "email") String email,
            @WebParam(name = "nom") String nom,
            @WebParam(name = "prenom") String prenom,
            @WebParam(name = "motDePasse") String motDePasse) {

        // Logique d'inscription (à implémenter)
        return "Utilisateur " + email + " inscrit avec succès !";
    }

    @WebMethod(operationName = "connecterUtilisateur")
    public boolean connecterUtilisateur(
            @WebParam(name = "email") String email,
            @WebParam(name = "motDePasse") String motDePasse) {

        // Logique de connexion (à implémenter)
        return true;
    }
}
