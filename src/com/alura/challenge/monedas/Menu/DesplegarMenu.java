package com.alura.challenge.monedas.Menu;

import java.util.Scanner;

public class DesplegarMenu {
    ///////////////////////// metodo para seleccionar la pelicula con el metodo scan
    public int SeleccionarConversion() {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Seleciona una conversion  ---");
        System.out.println(" 1) convierte de peso Argentino a Mexicano  ----");
        System.out.println(" 2) convierte de peso Mexicano a Argentino  ----");
        System.out.println(" 3) convierte de peso Colombiano a Cubano  ----");
        System.out.println(" 4) convierte de peso Cubano a Colombiano  ----");
        System.out.println(" 5) convierte de bolibar venezolano a real Brazileño  ----");
        System.out.println(" 6) convierte de real Brazileño a bolibar venezolano  ----");
        int opcion = scaner.nextInt();
        scaner.nextLine();
        return opcion;
    }

    ////////////// metodo para desplegar espacion y separaciones en el menu y sea mas entendible
    public void ColocarMenu() {
        System.out.println("""
               
                """);
        System.out.println("***************************************************");
        System.out.println("""
              
                """);
    }
}