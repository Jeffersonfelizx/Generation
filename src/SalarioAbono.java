
/* Exercicio 1 - Generation
 Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java:
 Inicio -> Digite o Salario -> Leia o Salario -> Digite o Abono -> NovoSalario = Salario+Abono
 Exibir o novo Salario -> Fim

*/
import java.util.Scanner;

public class SalarioAbono {

    public static void main(String[] args){

        float salario;
        float abono;
        float novoSalario;


        Scanner sc = new Scanner(System.in);

        // Informe de Salario //
        System.out.println("Seja bem vindos: Para Calcular seu abono " +
                "\nPrecisamos que informe seu salario para continuar: ");
        salario = sc.nextFloat();
        System.out.println("Seja bem vindos: Para Calcular seu abono " +
                "\nPrecisamos que informe seu abono para continuar: ");
        abono = sc.nextFloat();
        novoSalario = salario + abono;
        System.out.println("Seu novo Salario é "+novoSalario);
    }

}
