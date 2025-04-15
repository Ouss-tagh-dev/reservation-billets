package com.reservation.services;

import com.reservation.models.Billet;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;


import java.util.List;

@WebService(serviceName = "BilletService")
public class BilletService {

    @WebMethod(operationName = "getBilletsDisponibles")
    public List<Billet> getBilletsDisponibles(
            @WebParam(name = "evenementId") Long evenementId) {

        // Récupérer les billets disponibles pour un événement (à implémenter)
        return List.of();
    }

    @WebMethod(operationName = "updateQuantiteDisponible")
    public void updateQuantiteDisponible(
            @WebParam(name = "billetId") Long billetId,
            @WebParam(name = "quantite") int quantite) {

        // Mettre à jour la quantité disponible (à implémenter)
    }
}
