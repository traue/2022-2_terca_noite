/*
2. Crie uma aplicação em Java que leia um número real e calcule o 
   quadrado deste número. Ao final, o programa deve imprimir o resultado do 
   cálculo.
 */
package uniove.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        
        //SOLUÇÃO 1:
        float valor, quadrado;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        valor = teclado.nextFloat();
        
        quadrado = valor * valor;
        
        System.out.println("O quadrado deste valor é " + quadrado);

        //SOLUÇÃO 2 (ALTERNATIVA)
        //considernado o mesmo valor de entrada da variável "valor"
        double quadrado2;
        quadrado2 = Math.pow(valor, 2);
        System.out.println("(Alternativo) O quadrado deste valor é " + quadrado2);
    }
}
