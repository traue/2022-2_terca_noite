
/* (do material utilizado pelo professor)
    O hospital local está fazendo uma campanha para receber 
    doação de sangue.
    O doador deve inicialmente se cadastrar informando o sua idade, 
    seu peso, responder a um breve questionário.
    Faça um programa que permita ao hospital realizar o cadastro 
    dos voluntários para avaliar a aptidão quanto à doação de sangue. 
    Para estar apto a doar (NESTE CENÁRIO), o voluntário deve ter idade
    entre 16 e 69, pesar pelo menos 50 kg, estar bem alimentado e 
    não estar resfriado.
    O programa deve ler os dados e imprimir no final se ele está apto ou não.
 */
package br.uninove.poo;

import java.util.Scanner;

public class DoacaoSangue {

    public static void main(String[] args) {
        int idade;
        float peso;
        char bemAlimentado, resfriado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        idade = teclado.nextInt();

        System.out.print("Informe seu peso: ");
        peso = teclado.nextFloat();

        System.out.print("Você está bem alimentado(a) S - Sim | N - Não: ");
        bemAlimentado = teclado.next().charAt(0);

        System.out.print("Você está bem resfriado(a) S - Sim | N - Não: ");
        resfriado = teclado.next().charAt(0);

        //alternativa (usando inteiros):
        //int bemAl, resfr;
        //System.out.print("Você está bem alimentado(a) 1 - Sim | 2 - Não: ");
        //bemAl = teclado.nextInt();
        //..
        
        //Character.toUpperCase = converte para maiúsculo 
        if (peso >= 50
                && (Character.toUpperCase(bemAlimentado) == 'S')
                && (Character.toUpperCase(resfriado) == 'N')
                && (idade >= 16 && idade <= 69)) {
            System.out.println("Apto a doar sangue!");
        } else {
            System.out.println("Inapto a doar sangue!");
        }
    }
}
