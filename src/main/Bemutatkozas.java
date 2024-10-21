package main;

import modell.Bemutatkoztato;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;

public class Bemutatkozas {

    public static void main(String[] args) {
        
        Bemutatkoztato modell = new Bemutatkoztato();
        KonzolNezet nezet = new KonzolNezet();
        KonzolVezerlo vezerlo = new KonzolVezerlo(modell, nezet);
        vezerlo.kezdes();
        
    }
    
}
