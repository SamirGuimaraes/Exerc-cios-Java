package Lista4.Exercicio2;

public class Equipamento {
    private boolean ligado;
    private String nome;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void liga(){
        this.ligado = true;
    }

    public void desliga(){
        this.ligado = false;
    }



}

