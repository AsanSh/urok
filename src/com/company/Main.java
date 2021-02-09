package com.company;

public class Main {

    public static void main(String[] args) {

        Garage<Sedan> carSedan = new Garage<>();
        carSedan.setStorage(new Toyota());
        System.out.println(carSedan.getClass().getSimpleName());

        Garage<Crossover> crossOver = new Garage<>();
        crossOver.setStorage(new Toyota());
        Object toyota = crossOver.getStorage();
        System.out.println(crossOver.getClass().getSimpleName());

    }
}
