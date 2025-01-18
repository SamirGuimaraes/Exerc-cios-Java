package Lista1;

/*
 * Escreva um programa em Java que leia um número n (número de termos de uma 
 * progressão aritmética), a1 (o primeiro termo da progressão) e r (a razão da progressão) 
 * e escreva os n termos desta progressão, bem como a soma dos elementos.
 */

 import java.util.Scanner;
 public class Exercicio5 {
 
     public static void main(String[] args) {
         int n, r, a1, az, somaTotal;
 
         Scanner sc = new Scanner(System.in);
         System.out.println("Informe o número de termos da PA: ");
         n = sc.nextInt();
 
         System.out.println("Informe a razão do da PA: ");
         r = sc.nextInt();
 
         System.out.println("Informe o primeiro termo da PA: ");
         a1 = sc.nextInt();
         sc.close();
 
         int[] vet = new int[n];
 
         for (int i = 0; i < n; i++){
             vet[i] = a1 + (i-1)*r;
         }
 
         az = a1 + (n-1)*r;
         somaTotal = (a1+az)*n/2;
         
         System.out.println("Progressão Aritmética:");
         for (int i = 0; i < n; i++){
             System.out.print(vet[i]+ " ");
         }
         System.out.println("\nSoma dos termos: " +somaTotal);
     }
 }
 
