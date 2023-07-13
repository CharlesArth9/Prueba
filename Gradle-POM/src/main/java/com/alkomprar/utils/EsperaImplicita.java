package com.alkomprar.utils;

public class EsperaImplicita {

    public void esperaImplicita (int milisegundos){
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
    }
}
