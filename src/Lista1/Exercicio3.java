package Lista1;

/*
 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número 
 * inteiro entre 1 e 10. O usuário deve informar de qual número ele deseja ver a 
 * tabuada. A saída deve ser conforme o exemplo abaixo: 
 * 
 * Tabuada de 5: 
 * 5 X 1 = 5 
 * 5 X 2 = 10 
 * ... 
 * 5 X 10 = 50
 */


 import java.util.Scanner;
 public class Exercicio3 {
 
     public static void main(String[] args) {
         int num;
 
         Scanner sc = new Scanner(System.in);
         System.out.println("Informe qual número você deseja ver a tabuada: ");
         num = sc.nextInt();
         sc.close();
 
         System.out.println("Tabuada de " +num);
         for(int i = 1; i <= 10; i++){
             System.out.println(num + " x " +i+ " = " +(num*i));
         }
     }
 }
