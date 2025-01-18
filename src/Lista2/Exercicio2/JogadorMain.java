package Lista2.Exercicio2;

import java.util.Scanner;
public class JogadorMain {

    public static void main(String[] args) {
        Jogador[] jogadorAtual = new Jogador[40];
        int qtdeJogadores = 0;
        int opcao;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println(" ------ Menu ------\nInscrever um jogador digite 1 \nExibir dados dos jogadores digite 2 \nSair do menu digite 3");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (qtdeJogadores > 40){
                        System.out.println("40 Jogadores foram inscritos, não há como inscrever mais");
                        break;
                    }else{
                        jogadorAtual[qtdeJogadores] = new Jogador();
                        System.out.println("Informe o nome do jogador: ");
                        jogadorAtual[qtdeJogadores].setNome(sc.nextLine());
                        sc.nextLine();
                        System.out.println("Informe a nacionalidade do jogador: ");
                        jogadorAtual[qtdeJogadores].setNacionalidade(sc.nextLine());
                        System.out.println("Informe a posição do jogador: ");
                        jogadorAtual[qtdeJogadores].setPosicao(sc.nextLine());
                        System.out.println("Informe a altura do jogador: ");
                        jogadorAtual[qtdeJogadores].setAltura(sc.nextDouble());
                        System.out.println("Informe o peso do jogador:");
                        jogadorAtual[qtdeJogadores].setPeso(sc.nextDouble());
                        qtdeJogadores++;
                    }
                    break;
                case 2:
                    for(int i = 0; i < qtdeJogadores; i++){
                        System.out.println("Jogador - " +(i+1));
                        jogadorAtual[i].exibirInformacoes();

                    }
                    
                    break;
                default:
                    System.out.println("Saindo do menu...");
                    break;
            }

        }while(opcao != 3);
        

        sc.close();
    }
}