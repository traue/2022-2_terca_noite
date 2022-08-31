/*
    6. Faça um programa em Java que faça a conversão de uma temperatura lida 
    em Celcius para Fahrenheit. Fórmula F = (9 * C + 160) / 5
 */
package uniove.exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float gCelcius, gFahrenheit;
        
        System.out.print("Informe a temperatura em Celcius: ");
        gCelcius = teclado.nextFloat();
        
        gFahrenheit = (9 * gCelcius + 160) / 5;
        
        System.out.println("Temperatura em Fahrenheit: " + gFahrenheit);
        
    }
}
