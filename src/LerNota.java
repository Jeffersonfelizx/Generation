/* Exercicio 2 - Generation
Elabore um algoritmo em Java que leia 4 notas de um participante,
em variáveis do tipo float e exiba na tela a média final do participante.
*/

import java.util.Scanner;

public class LerNota {
    public static void main(String[] args){

        float nota1,nota2,nota3,nota4;
        float mediaFinal;

        //Ler as Entradas dos usuarios//
        Scanner sc = new Scanner(System.in);

        // Entrada de usuario para inserir notas//


        System.out.println("Seja bem vindos para Calcular a sua nota precisamos\n que informe sua nota \n" +
                "Digite a 1(Primeira) nota para continuar ");
        nota1 = sc.nextFloat();
        System.out.println("Digite a 2(Segunda) nota para continuar ");
        nota2 = sc.nextFloat();
        System.out.println("Digite a 3(Terceira) nota para continuar ");
        nota3 = sc.nextFloat();
        System.out.println("Digite a 4(Quarta) nota para continuar ");
        nota4 = sc.nextFloat();

        mediaFinal = (nota1 + nota2 +nota3 + nota4) / 4;

        System.out.println("Sua nota final é " +mediaFinal);



    }

}
