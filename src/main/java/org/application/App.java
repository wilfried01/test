package org.application;

public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!\n");
        System.out.println("The version of this program is : " + App.class.getPackage().getImplementationVersion());
    }
}
