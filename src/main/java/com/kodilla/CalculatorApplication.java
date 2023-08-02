package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        Calculator kalkulator = new Calculator(2,1);
        kalkulator.dodawanie();
        kalkulator.odejmowanie();
        kalkulator.getRoznica();
        kalkulator.getSuma();

    }



}
