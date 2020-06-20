package com.Vlad;

class Car {
    public String name;
    public int wheels;
    public int cylinders;
    public boolean engine;
    public int speed;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = false;
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine() {
        this.engine = true;
        System.out.println("A car have started the engine");
    }

    public void stopEngine() {
        this.engine = false;
        System.out.println("A car have stopped the engine");
    }

    public void accelerate(int x) {
        this.speed += x;
        System.out.println("A car accelerated to " + speed);
    }

    public void brake() {
        this.speed = 0;
        System.out.println("A car stopped");
    }


}

class Polo extends Car {
    public Polo() {
        super("Polo", 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Polo started the engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Polo stopped the engine");
    }

    @Override
    public void accelerate(int x) {
        this.speed += x;
        System.out.println("Polo accelerated to " + speed + " kmh");
    }

    @Override
    public void brake() {
        System.out.println("Polo stopped. Danke!");
    }
}

class Porsche extends Car {
    public Porsche() {
        super("Porsche", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche started the engine. Wrooooom!!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Porsche stopped the engine");
    }

    @Override
    public void accelerate(int x) {
        this.speed += x;
        System.out.println("Porsche accelerated to " + speed + " kmh");
    }

    @Override
    public void brake() {
        System.out.println("Porsche stopped with a squeal!!! eeeeee");
    }

}

class Prius extends Car {
    public Prius() {
        super("Prius", 0);
    }

    @Override
    public void startEngine() {
        System.out.println("Prius started the engine. Can't hear a thing");
    }

    @Override
    public void stopEngine() {
        System.out.println("Prius stopped the engine. Was it even running?");
    }

    @Override
    public void accelerate(int x) {
        this.speed += x;
        System.out.println("Prius accelerated to " + speed + " kmh. No rush");
    }

    @Override
    public void brake() {
        System.out.println("Prius stopped. Smooth!!!");
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = randomCar();
        System.out.println("This is a " + car.getName() + " and it has " + car.getCylinders() + " cylinders");
        car.startEngine();
        car.accelerate(50);
        car.brake();
        car.stopEngine();
    }

    public static Car randomCar() {
        int x = (int) (Math.random() * 3) + 1;
        return switch (x) {
            case 1 -> new Polo();
            case 2 -> new Porsche();
            case 3 -> new Prius();
            default -> null;
        };
    }
}
