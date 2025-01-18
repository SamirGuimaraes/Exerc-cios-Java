package Lista4.Exercicio1;
import java.util.Scanner;

public class TestarAnimal extends Mamifero{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe se deseja cadastrar mamíferos ou peixes: ");
        String animal = sc.nextLine();

        if (animal.equalsIgnoreCase("Mamifero")){
            Mamifero mamifero = new Mamifero();

            System.out.println("Informe o nome do mamífero: ");
            mamifero.setNome(sc.nextLine());
            System.out.println("Informe o comprimento do mamífero: ");
            mamifero.setComprimento(sc.nextFloat());
            System.out.println("Informe número de patas do mamífero: ");
            mamifero.setNumeroPatas(sc.nextInt());
            sc.nextLine();
            System.out.println("Informe a cor do mamífero: ");
            mamifero.setCor(sc.nextLine());
            System.out.println("Informe o ambiente em que o mamífero vive: ");
            mamifero.setAmbiente(sc.nextLine());
            System.out.println("Informe a velocidade média do mamífero em questão: ");
            mamifero.setVelocidadeMedia(sc.nextFloat());
            sc.nextLine();
            System.out.println("Informe o alimento que mamífero come: ");
            mamifero.setAlimento(sc.nextLine());

            mamifero.ExibirDadosMamifero();
        }else{
            Peixe peixe = new Peixe();

            System.out.println("Informe o nome do peixe: ");
            peixe.setNome(sc.nextLine());
            System.out.println("Informe o comprimento do peixe: ");
            peixe.setComprimento(sc.nextFloat());
            System.out.println("Informe número de patas do peixe: ");
            peixe.setNumeroPatas(sc.nextInt());
            sc.nextLine();
            System.out.println("Informe a cor do peixe: ");
            peixe.setCor(sc.nextLine());
            System.out.println("Informe o ambiente em que o peixe vive: ");
            peixe.setAmbiente(sc.nextLine());
            System.out.println("Informe a velocidade média do peixe: ");
            peixe.setVelocidadeMedia(sc.nextFloat());
            sc.nextLine();
            System.out.println("Informe um atributo do peixe: ");
            peixe.setAtributo(sc.nextLine());

            peixe.ExibirDadosPeixe();
        }
        
        sc.close();
    }
}
