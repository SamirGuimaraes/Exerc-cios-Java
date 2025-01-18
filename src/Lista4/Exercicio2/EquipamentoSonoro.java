package Lista4.Exercicio2;

public class EquipamentoSonoro extends Equipamento{

    private short volume;
    private boolean stereo;

    public short getVolume() {
        return volume;
    }
    public void setVolume(short volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Volume deve estar entre 0 e 10.");
        }
    }

    public boolean isStereo() {
        return stereo;
    }
    public void setStereo(boolean stereo) {
        this.stereo = stereo;
    }

    public void ativarMono() {
        this.stereo = false;
    }

    public void ativarStereo() {
        this.stereo = true;
    }

    @Override
    public void liga() {
        super.liga(); // Liga o equipamento usando a lógica da classe pai
        this.volume = 5; // Ajusta o volume para 5 automaticamente
    }
    
    
    

}
