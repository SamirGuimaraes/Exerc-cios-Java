package Lista3.Exercicio2;

/*
 * Faça um programa que, a partir de uma string digitada pelo usuário, 
 * imprima:   
 * 
 * a) O número de caracteres da string.   
 * b) A string com todas suas letras em maiúsculo.   
 * c) O número de vogais da string.   
 * d) Se a string digitada começa com “A” (ignorando maiúsculas/minúsculas).   
 * e) Se a string digitada termina com “O” (ignorando maiúsculas/minúsculas).   
 * f) Se a string é um palíndromo ou não.
 */

 import java.util.Scanner;
 public class ManipulacaoStrings {
 
     public static void main(String[] args) {
         String palavra, palavraUpper;
         int numVogais, numCaracteres, ultimoCaracter;
         boolean iniciarComA, terminaComO;
 
         Scanner sc = new Scanner(System.in);
         System.out.println("Escreva uma palavra qualquer: ");
         palavra = sc.nextLine();
         sc.close();
 
         numVogais = 0;        
         for (int i = 0; i < palavra.length(); i++){ // For responsável por contabilizar as vogais.
             char c = palavra.charAt(i);
             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                 numVogais++;
             }
         }
 
         iniciarComA = false;
         if(palavra.charAt(0) == 'A' || palavra.charAt(0) == 'a')
             iniciarComA = true;
 
         terminaComO = false;
         ultimoCaracter = palavra.length() - 1;
         if(palavra.charAt(ultimoCaracter) == 'O' || palavra.charAt(ultimoCaracter) == 'o')
             terminaComO = true;
 
         numCaracteres = palavra.length(); // Método responsável por contabilizar o nnúmero de caracteres.
         palavraUpper = palavra.toUpperCase(); // Método responsável por deixar a palavra toda em maíusculo.
 
 
         int verificador = 0;
         for (int i = 0; i < palavra.length(); i++){
             if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)){
                 verificador++;
             }
             ultimoCaracter--;
         }
         
 
         System.out.println("O número de caracteres da imagem corresponde a: " +numCaracteres);
         System.out.println("A palavra digitada em maísculo corresponde a: " +palavraUpper);
         System.out.println("O número de vogais corresponde a : " +numVogais);
         System.out.println((iniciarComA)? "Inicia com A." : "Não inicia com A." );
         System.out.println((terminaComO) ? "Termina com O." : "Não termina com O.");
         System.out.println((verificador == 0) ? "É palíndrono." : "Não é palícrono.");
     }
 
 }