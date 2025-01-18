package Lista4.Exercicio2;

public class Main extends EquipamentoSonoro{
    public static void main(String[] args) {

        Equipamento equipamento = new Equipamento();

        System.out.println("--------------------------------");
        equipamento.setNome("Caixa de Som");
        equipamento.liga();
        String statusLigado = (equipamento.isLigado()) ? "Ligado" : "Desligado";

        System.out.println("Equipamento: " +equipamento.getNome()+ "\nStatus: " +((equipamento.isLigado()) ? "Ligado" : "Desligado"));

        System.out.println("--------------------------------");
        equipamento.setNome("Rádio");
        equipamento.desliga();

        System.out.println("Equipamento: " +equipamento.getNome()+ "\nStatus: " +((equipamento.isLigado()) ? "Ligado" : "Desligado"));

        System.out.println("--------------------------------");
        EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro();


        equipamentoSonoro.setNome("Fone de Ouvido");
        equipamentoSonoro.liga();
        equipamentoSonoro.ativarStereo();

        System.out.println("Nome: " +equipamentoSonoro.getNome()+ "\nStatus do ligado: " +((equipamentoSonoro.isLigado()) ? "Ligado" : "Desligado")+ "\nVolume: " +equipamentoSonoro.getVolume()+ "\nStatus do Stereo: " +((equipamentoSonoro.isStereo()) ? "Ligado" : "Desligado"));
        
        System.out.println("--------------------------------");
        equipamentoSonoro.setNome("Televisão");
        equipamentoSonoro.desliga();
        equipamentoSonoro.ativarMono();
        equipamentoSonoro.setVolume((short) 7);

        System.out.println("Nome: " +equipamentoSonoro.getNome()+ "\nStatus do ligado: " +((equipamentoSonoro.isLigado()) ? "Ligado" : "Desligado")+ "\nVolume: " +equipamentoSonoro.getVolume()+ "\nStatus do Stereo: " +((equipamentoSonoro.isStereo()) ? "Ligado" : "Desligado"));
        System.out.println("--------------------------------");


    }
}