/* Exercicio3 - Generation
 Elabore um algoritmo em Java, que leia o Salário Bruto,
 o Adicional Noturno, as Horas Extras e os Descontosde um Colaborador,
 em variáveis do tipo float e exiba na tela o Salário Líquido
 */

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args){

        float salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
        Scanner sc = new Scanner(System.in);

        salarioBruto = sc.nextFloat();
        System.out.println("Digite seu Salario Bruto para continuar");

        adicionalNoturno = sc.nextFloat();
        System.out.println("Digite seu Adicional Noturno para continuar");

        horasExtras = sc.nextFloat();
        System.out.println("Digite suas horas extras para continuar");

        descontos = sc.nextFloat();
        System.out.println("Digite seu descontos para continuar");

        salarioLiquido = (salarioBruto + adicionalNoturno + horasExtras) - descontos;

        System.out.println("O seu Salario Liquido é "+salarioLiquido);

    }
}
