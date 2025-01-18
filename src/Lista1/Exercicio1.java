package Lista1;

/* 
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os seus
funcionários. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
Faça um programa em Java que permita entrar com o salário bruto e o valor da
prestação e informe se o empréstimo pode ou não ser concedido.
*/ 
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        double salarioBruto, valorEmprestimo, valorPrestacao;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu salário bruto: ");
        salarioBruto = sc.nextDouble();
        System.out.println("Informe o valor do empréstimo: ");
        valorEmprestimo = sc.nextDouble();
        System.out.println("Informe o valor da prestação pretendida: ");
        valorPrestacao = sc.nextDouble();

        if (valorPrestacao > salarioBruto*0.3){
            System.out.println("Valor da prestação ultrapassa 30% do salário bruto, empréstimo negado!: ");

        }else{
            System.out.println("Valor da prestação não ultrapassa 30% do salário bruto, empréstimo aprovado!");
        }
        


        sc.close();
    }
}
