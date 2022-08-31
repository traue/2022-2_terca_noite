/*
    1 - Crie um programa em Java que seja capaz de ler dois valores e 
    mostrar todas as operações (soma, subtração, multiplicação, 
    divisão e resto)
 */
package uniove.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        float v1, v2; //onde serão armazenadas as entradas
        float soma, sub, mult, div, mod; //onde serão armazenadas as saídas

        Scanner teclado = new Scanner(System.in);

        //entrada dos dados:
        System.out.print("Informe o primeiro valor: ");
        v1 = teclado.nextFloat();

        System.out.print("Informe o segundo valor: ");
        v2 = teclado.nextFloat();

        //processamento
        soma = v1 + v2;
        sub = v1 - v2;
        mult = v1 * v2;

        //saídas
        System.out.println("\n--------------");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);

        //somente processa a divisão e o módulo se v2 != 0
        if (v2 != 0) {
            div = v1 / v2;
            mod = v1 % v2;
            System.out.println("Divisão: " + div);
            System.out.println("Módulo: " + mod);
        } else {
            System.out.println("Divisão e módulo impossíveis de calcular.");
        }

    }
}