package Lista4.Exercicio1;

public class Peixe extends Animal{
    private String atributo;

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia,
            String atributo) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.atributo = atributo;
    }

    public Peixe() {
    }

    public void ExibirDadosPeixe(){
        System.out.println("Nome: " +super.getNome()+ "\nComprimento: " +super.getComprimento()+ "\nNúmero de Patas: " +super.getNumeroPatas()+ "\nCor: " +super.getCor()+ "\nAmbiemnte: " +super.getAmbiente()+ "\nVelocidade Média: " +super.getVelocidadeMedia()+ "\nAtributo: " +atributo);
    }

}
