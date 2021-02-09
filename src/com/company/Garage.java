package com.company;

public class Garage  <T extends Car> {

    public Object storage;

    public Garage() {
        this.storage = storage;
    }

    public Object getStorage() {
        return storage;
    }

    public void setStorage(Object storage) {
        this.storage = storage;
    }


}

//(Дэдлайн 9.02.2021 23:59)
//        1.  Создать классы Car и классы - наследники к нему
//        (например, Crossover, Sedan и/или Toyota, Mercedes, Porshe и тд)
//        2.  Создать обобщенный класс Garage, с обобщенным полем для хранения
//        автомобилей. Ограничить параметры классом Car.
//        3.  Создать обобщенный интерфейс и реализовать его в классе Garage
//        4.  . В главном классе создать несколько экземпляров обобщенного класса
//        и вызвать через каждый из экземпляров метод из интерфейса
