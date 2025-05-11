package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");

        try {
            double fahrenheit = Double.parseDouble(scanner.nextLine());
            double celsius = ConversorTemperatura.fahrenheitParaCelsius(fahrenheit);

            System.out.printf("Temperatura em Celsius: %.2f°C\n", celsius);
        } catch (NumberFormatException e) {
            System.out.println("Valor inválido. Digite um número válido.");
        }

        scanner.close();
    }
}
