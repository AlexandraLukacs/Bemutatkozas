package modell;

import java.util.ArrayList;

public class Bemutatkoztato {
    private Ember e1, e2, e3;
    
    public Bemutatkoztato(){
        Ember e1 = new Ember("Pál", 2000);
        Ember e2 = new Ember("John", 2000, "angol");
        
        ArrayList<String>nyelvek = new ArrayList<>();
        nyelvek.add("francia");
        nyelvek.add("német");
        nyelvek.add("olasz");
        
        Ember e3 = new Ember("John", 2000, nyelvek);
        String[] ismertNyelvek = e3.getNyelvek();
    }
}
