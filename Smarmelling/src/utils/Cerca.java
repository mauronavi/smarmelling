package utils;

import zoo.Animale;
import zoo.specie.Felino;
import zoo.specie.Volatile;

import java.util.ArrayList;

public class Cerca {
    private ArrayList<Animale> animali;

    public Cerca(ArrayList<Animale> animali) {
        this.animali = animali;
    }

    public Animale piu_alto() {
        Animale animale_piu_alto = new Animale();
        if (animali.size() > 0) {
            animale_piu_alto = animali.get(0);
            for (int i = 1; i < animali.size(); i++) {
                if (animali.get(i).getAltezza() > animale_piu_alto.getAltezza()) {
                    animale_piu_alto = animali.get(i);
                }
            }
        }
        return animale_piu_alto;
    }


    public Animale piu_basso() {
        Animale animale_piu_basso = new Animale();
        if (animali.size() > 0) {
            animale_piu_basso = animali.get(0);
            for (int i = 1; i < animali.size(); i++) {
                if (animali.get(i).getAltezza() < animale_piu_basso.getAltezza()) {
                    animale_piu_basso = animali.get(i);
                }
            }
        }
        return animale_piu_basso;
    }

    public Animale piu_leggero() {
        Animale animale_piu_leggero = new Animale();
        if (animali.size() > 0) {
            animale_piu_leggero = animali.get(0);
            for (int i = 1; i < animali.size(); i++) {
                if (animali.get(i).getPeso() < animale_piu_leggero.getPeso()) {
                    animale_piu_leggero = animali.get(i);
                }
            }
        }
        return animale_piu_leggero;
    }


    public Animale coda_piu_lunga() {
        Felino animale_con_coda_piu_lunga = new Felino();
        if (animali.size() > 0) {
            int i=0;
            while(i<animali.size()){
                if (animali.get(i) instanceof Felino) {
                    animale_con_coda_piu_lunga = (Felino) animali.get(i);
                    int j=i+1;
                     while (j<animali.size()) {
                         if (animali.get(j) instanceof Felino) {
                             if (((Felino) animali.get(j)).getLunghezza_coda() > animale_con_coda_piu_lunga.getLunghezza_coda()) {
                                 animale_con_coda_piu_lunga = (Felino) animali.get(j);
                                 i = j + 1;
                                 j = animali.size();
                             }
                         }
                         j++;
                     }
                }
                i++;
            }
        }
        return animale_con_coda_piu_lunga;
    }

    public Animale apertura_alare_maggiore() {
        Volatile animale_con_apertura_alare_maggiore = new Volatile();
        if (animali.size() > 0) {
            int i=0;
            while(i<animali.size()){
                if (animali.get(i) instanceof Volatile) {
                    animale_con_apertura_alare_maggiore = (Volatile) animali.get(i);
                    int j=i+1;
                    while (j<animali.size()) {
                        if (animali.get(j) instanceof Volatile) {
                            if (((Volatile) animali.get(j)).getApetura_alare() > animale_con_apertura_alare_maggiore.getApetura_alare()) {
                                animale_con_apertura_alare_maggiore = (Volatile) animali.get(j);
                                i = j + 1;
                                j = animali.size();
                            }
                        }
                        j++;
                    }
                }
                i++;
            }
        }
        return animale_con_apertura_alare_maggiore;
    }
}
