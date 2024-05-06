package com.alura.challenge.monedas.Calculos;

import java.util.Scanner;

public class calcularConversion {


    public float CantidadConvertida(){

        System.out.println("coloca la cantidad que desea convertir : ");
        Scanner scaner = new Scanner(System.in);
        float moneda = scaner.nextFloat();
        scaner.nextLine();
        return moneda;
    }

    public float calculoPorRatio(float miRatio,float canitdadDeseada){
        return miRatio * canitdadDeseada;
    }





}
