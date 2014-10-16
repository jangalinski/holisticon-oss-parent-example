package de.holisticon.maven.example;


public class DummyApplication implements Runnable {

    public static void main(String... args) {
        new DummyApplication().run();
    }

    @Override
    public void run() {
        System.out.println("run!");
    }
}
