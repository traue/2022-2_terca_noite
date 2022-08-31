/*
    3. Faça um programa em Java que leia o saldo de uma conta poupança e 
    imprima o novo saldo, considerando um reajuste de 2%.
 */
package uniove.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        float saldoAtual, saldoReajustado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o saldo da poupança: R$ ");
        saldoAtual = teclado.nextFloat();

        saldoReajustado = saldoAtual + (saldoAtual * 0.02f);

        System.out.println("Saldo reajustado: R$ " + saldoReajustado);
    }
}
