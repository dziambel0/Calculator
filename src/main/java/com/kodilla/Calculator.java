package com.kodilla;

public class Calculator {

    private int a;
    private int b;
    private int suma;
    private int roznica;

    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void dodawanie(){
        suma = (a+b);
        System.out.println("Suma cyfr to: " + suma);
    }

    public void odejmowanie(){
        roznica = (a-b);
        System.out.println("Różnica cyfr to: " + roznica);
    }

    public int getRoznica() {
        return roznica;
    }

    public int getSuma() {
        return suma;
    }
}
