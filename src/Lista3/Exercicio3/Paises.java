package Lista3.Exercicio3;

/*
 * Escreva uma classe que represente um país. 
 * Um país é representado através dos atributos: 
 * sigla (ex.: BRA), nome, população e a sua dimensãoem Km2. 
 * 
 * Escreva a classe em Java contendo: 
 * a) Construtor padrão e outro que inicialize a sigla, o nome e a dimensão do país; 
 * b) Métodos de acesso (getter/setter); 
 * c) Um método que retorne a densidade populacional do país; 
 * d) Um método que permita exibir os dados do país. 
 * 
 * Em seguida, você deve criar a classe MainPaises que 
 * cria uma array de países e permite que o usuário 
 * cadastre países enquanto desejar. Ao final, o programa 
 * deve exibir a lista de países cadastrados.
 */
public class Paises {

    private String nomePais;
    private String siglaPais;
    private double populacao;
    private double dimensao;
    
    public String getNomePais() {
        return nomePais;
    }
    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
    public String getSiglaPais() {
        return siglaPais;
    }
    public void setSiglaPais(String siglaPais) {
        this.siglaPais = siglaPais;
    }
    public double getPopulacao() {
        return populacao;
    }
    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }
    public double getDimensao() {
        return dimensao;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public Paises(String nomePais, String siglaPais, double populacao, double dimensao) {
        this.nomePais = nomePais;
        this.siglaPais = siglaPais;
        this.populacao = populacao;
        this.dimensao = dimensao;
    }

    public Paises() {
    }

    public double densidadePopulacional(){
        return populacao / dimensao;
    }

    @Override
    public String toString() {
        return "Sigla: " + siglaPais+ 
            "\nNome: " +nomePais+
            "\nPopulação: " +populacao+
            "\nDimensão: " +dimensao+
            "\nDensidade Populacional: " +densidadePopulacional();
    }
    


}
