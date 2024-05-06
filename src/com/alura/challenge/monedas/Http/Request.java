package com.alura.challenge.monedas.Http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    String primeraMoneda;
    String segundaMoneda;
    int salida;



    public Request(){
        this.salida = 0;
    }

    public String request(int opcion) {

        ///////////////////// esta parte selecciona el String que se le debe añadir al get para la api
        switch (opcion){
            case 1:
                primeraMoneda = "ARS";
                segundaMoneda = "MXN";
                break;
            case 2:
                primeraMoneda = "MXN";
                segundaMoneda = "ARS";
                break;
            case 3:
                primeraMoneda = "COP";
                segundaMoneda = "CUP";
                break;
            case 4:
                primeraMoneda = "CUP";
                segundaMoneda = "COP";
                break;
            case 5:
                primeraMoneda = "VES";
                segundaMoneda = "BRL";
                break;
            case 6:
                primeraMoneda = "BRL";
                segundaMoneda = "VES";
                break;
        }

////////// metodo para mandar el get a la api y obtener el json

        String direccion =
                "https://v6.exchangerate-api.com/v6/2a10831cc7c37bdd54761c59/pair/"
                        + primeraMoneda +"/"+segundaMoneda;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion)).build();

        HttpResponse<String> response;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return response.body();

    }

}