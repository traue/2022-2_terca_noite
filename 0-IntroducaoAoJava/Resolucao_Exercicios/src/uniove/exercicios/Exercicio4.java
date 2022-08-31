/*
    Faça um programa em Java que leia a base e altura de um retângulo e 
    imprima o perímetro (2 * base + 2 * altura) e a área (base * altura).
 */
package uniove.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        double base, altura;
        double perimetro, area;
            
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe a base: ");
        base = teclado.nextDouble();
        
        System.out.print("Informe a altura: ");
        altura = teclado.nextDouble();
        
        perimetro = (2 * base) + (2 * altura);
        area = base * altura;
        
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);
    }
}
