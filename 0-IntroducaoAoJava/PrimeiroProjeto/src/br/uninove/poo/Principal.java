package br.uninove.poo;

import java.util.Scanner;

public class Principal {
    
    //isso é um comentário de "linha"
    
    /*
    * Isso é um bloco de comentário 
    * Posso pular linhas livremente
    * :D
    */
    
    public static void main(String[] args) { 
        //Imprimindo no console:
        System.out.println("Essa turma é top!");
        System.out.println("Vou dar 10 para todo mundo!");
        
        //variáveis
        char sexo = 'X';
        String nome = "Thiago G. Traue"; //armazenar textos
        byte idade = 35; //para armazenar números inteiros 
        float altura = 1.83f;
        boolean fumante = false; //variáveis booleanas (V/F - True/False)
        
        //impressão dos dados com concatenação:
        System.out.println("Olá " + nome + ", tudo bem?");
        System.out.println("Ah! Legal, você tem " + idade + " anos!");
        System.out.println("Nossa, você tem " + altura + "m Legal!");
        
        //-------------------------------
        
        //quais operações matemáticas podemos fazer com Java?
        //todas!
        
        float x = 30;
        float y = 21;
        float soma = x + y;
        float subtracao = x - y;
        float multiplicacao = x * y;
        float divisao = x / y;
        
        System.out.println("A soma de " + x + " + " + y + " = " + soma);
        System.out.println("A subtração de " + x + " - " + y + " = " + subtracao);
        System.out.println("A multiplcação de " + x + " x " + y + " = " + multiplicacao);
        System.out.println("A divisão de " + x + " / " + y + " = " + divisao);
        
        int a = 27;
        int b = 4;
        int resto = 27 % 4;
        System.out.println("O resto é " + resto);
        
        //lendo valores do teclado:
        Scanner sc = new Scanner(System.in);
        
    }
}
