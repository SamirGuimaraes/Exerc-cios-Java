package Lista1;
/*
 * Faça um programa que leia 15 números inteiros e exiba na tela qual é o maior dos números lidos.
 */

 import java.util.Scanner;
 public class Exercicio2 {
 
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
 
         int[] vetor = new int[15];
 
         for(int i = 0; i < 15; i++){
             System.out.println("Insira o " +(i+1)+ "º número: ");
             vetor[i] = sc.nextInt();
         }
 
         int maiorNumero;
         maiorNumero = vetor[0];
 
         for(int i = 0; i < 15; i++){
             if (vetor[i] > maiorNumero)
                 maiorNumero = vetor[i];
         }
 
         System.out.println("Vetor Digitado: ");
         for(int i = 0; i < 15; i++){
             System.out.print("-" +vetor[i]+ "-");
         }
         System.out.println("\nMaior número inserido: " +maiorNumero);
        
         sc.close();
     }
 
 }
 