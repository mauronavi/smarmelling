import utils.Cerca;
import zoo.Animale;
import zoo.specie.tipoanimale.Aquila;
import zoo.specie.tipoanimale.Leone;
import zoo.specie.tipoanimale.Tigre;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Animale> zoo =new ArrayList<Animale>();
    public static void main(String[] args) {
        zoo.add(new Leone("Leo","Carne",8,"12/10/2914", 195,78,62));
        zoo.add(new Leone("Lea","Carne",7,"11/7/2915", 122,65,55));
        zoo.add(new Aquila("Eagle2","BigMac",4,"12/8/2918", 5,40,60));
        zoo.add(new Tigre("Diego","Carne",6,"12/8/2916", 205,85,70));
        zoo.add(new Tigre("Tygra","Carne",6,"11/6/2916", 95,68,59));
        zoo.add(new Aquila("Eagle3","patatine fritte",4,"12/8/2918", 3,37,68));
        zoo.add(new Aquila("Eagle1","Carne",4,"12/8/2918", 4,45,70));

        Cerca cerca_animale = new Cerca(zoo);

        System.out.println("L'animale più alto è "+cerca_animale.piu_alto().getNome());
        System.out.println("L'animale più basso è: "+cerca_animale.piu_basso().getNome());
        System.out.println("L'animale con la coda più lunga è: "+cerca_animale.coda_piu_lunga().getNome());
        System.out.println("L'animale con l'apertura alare maggiore è: "+cerca_animale.apertura_alare_maggiore().getNome());

    }
}