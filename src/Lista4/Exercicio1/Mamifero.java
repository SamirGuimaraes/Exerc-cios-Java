package Lista4.Exercicio1;

public class Mamifero extends Animal{
    private String alimento;

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }   

    public Mamifero(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia,
            String alimento) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public Mamifero() {
    }

    public void ExibirDadosMamifero(){
        System.out.println("Nome: " +super.getNome()+ "\nComprimento: " +super.getComprimento()+ "\nNúmero de Patas: " +super.getNumeroPatas()+ "\nCor: " +super.getCor()+ "\nAmbiemnte: " +super.getAmbiente()+ "\nVelocidade Média: " +super.getVelocidadeMedia()+ "\nAlimento: " +alimento);
    }
    
}
