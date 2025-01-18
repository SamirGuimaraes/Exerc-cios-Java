package Lista3.Exercicio4;

import java.util.ArrayList;
import java.util.Scanner;
public class AlunoMain extends Aluno{

    public static void main(String[] args) {
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        int opcao;
        String nomeBuscado;


        Scanner sc = new Scanner(System.in);
        do{
            Aluno alunoAtual = new Aluno();
            System.out.println("----- MENU ------  \nPara adicionar um aluno insira 1. \nPara remover um aluno insira 2. \nPara bucar um aluno insira 3. \nPara exibir os dados dos alunos insira 4.. \nPara sair do menu insira 5.");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o nome do aluno: ");
                    alunoAtual.setNome(sc.nextLine());
                    System.out.println("Informe as disciplinas inscritas: ");
                    alunoAtual.setDisciplina(sc.nextLine());
                    System.out.println("Informe a matrícula do aluno: ");
                    alunoAtual.setMatricula(sc.nextInt());
                    sc.nextLine();

                    listaAlunos.add(alunoAtual);

                    break;
                case 2:
                    if (listaAlunos.size() == 0){
                        System.out.println("Nenhum aluno foi adicionado: ");
                    }else{
                        listaAlunos.removeLast();
                    }
                    break;
                case 3:
                    if (listaAlunos.size() == 0){
                        System.out.println("Nenhum aluno foi adicionado: ");
                    }else{
                        System.out.println("Insira o nome do aluno a ser buscado");
                        nomeBuscado = sc.nextLine();
                        boolean verificador = false;
                        for (Aluno nome : listaAlunos) {
                            if (nome.getNome().equalsIgnoreCase(nomeBuscado))
                                verificador = true;
                        }
                        System.out.println((verificador)? ("O aluno já foi inscrito."):("O aluno não foi inscrito."));
                    }
                    break;
                case 4:
                    if (listaAlunos.size() == 0){
                        System.out.println("Nenhum aluno foi adicionado: ");
                    }else{
                        for(Aluno aluno : listaAlunos){
                            System.out.println("Nome do aluno: " +aluno);

                        }
                    }
                    break;
            
                default:
                    System.out.println("Saindo do menu...");
                    break;
            }
        }while(opcao != 5);

        sc.close();
    }
}
