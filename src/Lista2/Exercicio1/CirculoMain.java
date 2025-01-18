package Lista2.Exercicio1;

import java.util.Scanner;
public class CirculoMain extends Circulo{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Circulo[] circuloAtual = new Circulo[2];

        for (int i = 0; i < circuloAtual.length; i++){
            circuloAtual[i] = new Circulo(); 
            System.out.println("Informe o raio do " +(i+1)+ "º círculo: ");
            circuloAtual[i].setCirculo(sc.nextDouble());
            sc.nextLine();
            System.out.println("Informe a cor do " +(i+1)+ "º círculo: ");
            circuloAtual[i].setCor(sc.next());
        }

        for (int i = 0; i < circuloAtual.length; i++){
            System.out.println("Dados do " +(i+1)+ "º círculo.");
            circuloAtual[i].exibirDados();
        }
        
        
        sc.close();
        
    }
}

