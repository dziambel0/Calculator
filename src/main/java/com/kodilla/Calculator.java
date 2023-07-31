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

    public int dodawanie(){
        return (a+b);
    }

    public int odejmowanie(){
        return (a-b);
    }

}
