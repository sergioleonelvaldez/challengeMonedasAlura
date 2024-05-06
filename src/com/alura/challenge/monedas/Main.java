package com.alura.challenge.monedas;
import com.alura.challenge.monedas.Calculos.calcularConversion;
import com.alura.challenge.monedas.Http.Request;
import com.alura.challenge.monedas.Menu.DesplegarMenu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       while (true) {
           DesplegarMenu miMenu = new DesplegarMenu();
           miMenu.ColocarMenu();
           int opcion = miMenu.SeleccionarConversion();
           Request miRequest = new Request();
           String json = miRequest.request(opcion);
           Gson gson = new GsonBuilder()
                   .setPrettyPrinting()
                   .create();
           RatioConversion miRatio = gson.fromJson(json, RatioConversion.class);
           System.out.println(miRatio);
           calcularConversion miCalculo = new calcularConversion();
           float canitdadDeseada = miCalculo.CantidadConvertida();
           System.out.println("la conversion de " + canitdadDeseada + " da un valor de : ");
           System.out.println(miCalculo.calculoPorRatio(miRatio.conversion_rate(), canitdadDeseada));
           System.out.println("desea salir o hacer otra conversion, para salir escriba -> (salir)"
           + " - si no desea salir escriba cualquier cosa ");
           Scanner scanner = new Scanner(System.in);
           String salida = scanner.nextLine();
           if (salida.equals("salir")){
               break;
           }
       }
    }
}