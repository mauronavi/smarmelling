package utils;

import zoo.Animale;

import java.util.ArrayList;

public class Cerca {
    private ArrayList<Animale> animali;

    public Cerca(ArrayList<Animale> animali) {
        this.animali = animali;
    }

    public Animale piu_alto(){
        Animale animale_piu_alto=new Animale();
        if (animali.size() > 0) {
            animale_piu_alto = animali.get(0);
            for(int i= 1;i<animali.size(); i++){
                if (animali.get(i).getAltezza() > animale_piu_alto.getAltezza()){
                    animale_piu_alto=animali.get(i);
                }
            }
        }
        return animale_piu_alto;
    };

    public Animale piu_basso(){
        Animale animale_piu_basso=new Animale();
        if (animali.size() > 0) {
            animale_piu_basso = animali.get(0);
            for(int i= 1;i<animali.size(); i++){
                if (animali.get(i).getAltezza() < animale_piu_basso.getAltezza()){
                    animale_piu_basso=animali.get(i);
                }
            }
        }
        return animale_piu_basso;
    };
}
