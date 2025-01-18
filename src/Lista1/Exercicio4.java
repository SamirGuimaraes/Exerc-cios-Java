package Lista1;

/*
 * Faça um programa que, enquanto o usuário desejar, leia números inteiros. Ao 
 * final, o programa deve exibir a quantidade de números pares e ímpares informados. 
 */

 import java.util.Scanner;
 public class Exercicio4 {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         int[] vet = new int[100];
         int controlador; 
         int quantidade = 0;
         int pares = 0, impares = 0;
 
         do{
             System.out.println("Insira um número qualquer no vetor.");
             vet[quantidade] = sc.nextInt();
             quantidade++;
 
             System.out.println("Para continuar a inserção digite 1 e para abortar a inserção digite 0.");
             controlador = sc.nextInt();
 
         }while(controlador == 1 && quantidade < vet.length);
         sc.close();
 
         for (int i = 0; i < quantidade; i++){
             if (vet[i] % 2 == 0)
                 pares++;
             else
                 impares++;
         }
 
         System.out.println("\nVetor:");
         for (int i = 0; i < quantidade; i++){
             System.out.print("-" + vet[i]+ "-");
         }
         System.out.println("\nForam inseridos " +pares+ " pares e " +impares+ " ímpares.");
 
     }
 
 }
 