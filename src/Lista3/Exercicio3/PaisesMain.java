package Lista3.Exercicio3;

import java.util.Scanner;
import java.util.ArrayList;

public class PaisesMain extends Paises{

    public static void main(String[] args) {
        
        ArrayList<Paises> paises = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcao;        
        do{
            System.out.println("--- MENU --- \nEscolha uma opção \n1 - Cadastrar novo país. \n2 - Visualizar países cadastrados. \n3 - Terminar cadastro.");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    Paises paisAtual = new Paises();

                    System.out.println("Qual o nome do país: ");
                    paisAtual.setNomePais(sc.nextLine());
                    sc.nextLine();
                    System.out.println("Informe a sigla do país cadastrado: ");
                    paisAtual.setSiglaPais(sc.nextLine());
                    System.out.println("Informe a população do país: ");
                    paisAtual.setPopulacao(sc.nextDouble());
                    System.out.println("Informe o tamanho do país em KM²");
                    paisAtual.setDimensao(sc.nextDouble());


                    paises.add(paisAtual);                    
                    break;
                case 2:

                    if (paises.size() == 0){
                        System.out.println("Nenhum país foi cadastrado ainda.");
                    }else{
                        for (Paises pais : paises) {
                            System.out.println(pais);
                        }
                    }
                    
                    break;
                case 3:
                    System.out.println("Finalizando cadastro.");
                    break;
            
                default:
                    System.out.println("Opção inválida, tente cadastrar outra vez.");
                    break;
            }
        }while(opcao != 3);

        sc.close();
    }

}
