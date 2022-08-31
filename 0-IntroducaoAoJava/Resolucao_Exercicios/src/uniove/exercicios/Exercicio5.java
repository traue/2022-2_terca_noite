/*
    5. Faça um programa em Java que calcule o reajuste do salário de um 
    funcionário. Para isso, o programa deverá ler o salário atual do 
    funcionário e ler o percentual de reajuste. Ao final imprimir o valor do 
    novo salário.
 */
package uniove.exercicios;

import java.util.Scanner;


public class Exercicio5 {
    public static void main(String[] args) {
        float salarioAtual, percReajuste, salarioNovo;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe o salário atual: R$ ");
        salarioAtual = teclado.nextFloat();
        
        System.out.print("Informe o percentual de reajuste: ");
        percReajuste = teclado.nextFloat();
        
        salarioNovo = salarioAtual + (salarioAtual * (percReajuste / 100));
        
        System.out.println("Salário reajustado: R$ " + salarioNovo);
    }
}
