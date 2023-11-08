/* Exercicio4 - Generation
Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule
e mostre a diferença do produto entre o n1 e n2 pelo produto
entre o n3 e o n4.
*/


import java.util.Scanner;

public class DiferencasProdutos {
    public static void main(String[] args){

        float n1,n2,n3,n4;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1 valor para Calcular");
        n1 = sc.nextFloat();
        System.out.println("Digite o 2 valor para Calcular");
        n2 = sc.nextFloat();
        System.out.println("Digite o 3 valor para Calcular");
        n3 = sc.nextFloat();
        System.out.println("Digite o 4 valor para Calcular");
        n4 = sc.nextFloat();
        float calculo = (n1 * n2) - (n3 * n4);
        System.out.println("O valor final é "+calculo );



    }
}
