package br.uninove.poo;

import java.util.Scanner;

/*

Vamos criar um programa que um professor poderia utilizar
para verificar se um aluno está aprovadou ou não
baseado em DUAS notas.
Média = 6

*/

public class DesvioCondicional {
    public static void main(String[] args) {
        float nota1, nota2, media;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe a primeira nota: ");
        nota1 = sc.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        nota2 = sc.nextFloat();
        
        media = (nota1 + nota2) / 2;
        
        System.out.println("A média do meliante é: " + media);
        
        //o resultado de um "if" (se) deve ser SEMPRE booleano
        //operações que usamos normalmente: <, >, <=, >=, ==, !=, !
        if(media >= 6) {
            System.out.println("Meliante aprovado!");
        } else { //senão
            System.out.println("Meliante reprovadinho. Que peninha.");
        }
    }
}
