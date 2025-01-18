package Lista1;

/*
 * Faça um programa que leia 2 valores inteiros e positivos: x e y. Em seguida, o 
 * programa deve calcular e imprimir a potência x^y, sem o uso de bibliotecas do Java. 
 */

 import java.util.Scanner;
 public class Exercicio6 {
 
     public static void main(String[] args) {
         int x, y, resultado = 1;
 
         Scanner sc = new Scanner(System.in);
         System.out.println("Informe um número qualquer: ");
         x = sc.nextInt();
         System.out.println("Informe um segundo número qualquer: ");
         y = sc.nextInt();
         sc.close();
 
         for (int i = 0; i < y; i++){
             resultado *= x;
         }
 
         System.out.println("X elevado a Y corresponde a: " + resultado);
     }
 }
 