package zoo.specie;

import zoo.Animale;

public class Felino extends Animale {
    private int lunghezza_coda; //centimetri

    public Felino(String nome, String cibo_preferito, int età, String data_ingresso_zoo, int peso, int altezza, int lunghezza_coda) {
        super(nome, cibo_preferito, età, data_ingresso_zoo, peso, altezza);
        this.lunghezza_coda = lunghezza_coda;
    }

    public int getLunghezza_coda() {
        return lunghezza_coda;
    }

    public void setLunghezza_coda(int lunghezza_coda) {
        this.lunghezza_coda = lunghezza_coda;
    }
}
