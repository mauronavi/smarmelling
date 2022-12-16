package zoo.specie;

import zoo.Animale;

public class Volatile extends Animale {
    private int apetura_alare; //centimetri

    public Volatile(String nome, String cibo_preferito, int età, String data_ingresso_zoo, int peso, int altezza, int apetura_alare) {
        super(nome, cibo_preferito, età, data_ingresso_zoo, peso, altezza);
        this.apetura_alare = apetura_alare;
    }

    public int getApetura_alare() {
        return apetura_alare;
    }

    public void setApetura_alare(int apetura_alare) {
        this.apetura_alare = apetura_alare;
    }
}
