package Lista2.Exercicio3;

import java.util.Scanner;
public class TrianguloMain {

    public static void main(String[] args) {
        Triangulo[] trianguloAtual = new Triangulo[2];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            trianguloAtual[i] = new Triangulo();
            System.out.println("Informe o lado 1 do " +(i+1)+ "º triângulo.");
            trianguloAtual[i].setL1(sc.nextInt());
            System.out.println("Informe o lado 2 do " +(i+1)+ "º triângulo.");
            trianguloAtual[i].setL2(sc.nextInt());
            System.out.println("Informe o lado 3 do " +(i+1)+ "º triângulo.");
            trianguloAtual[i].setL3(sc.nextInt());

        }
        sc.close();

        for (int i = 0; i < 2; i++){
            System.out.println("Triângulo " +(i+1)+ "º");
            trianguloAtual[i].exibirDados();
        }

    }
}
