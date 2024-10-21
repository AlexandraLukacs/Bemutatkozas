package modell;

import java.util.ArrayList;

public class Bemutatkoztato {
    private Ember[] emberek;
    
    public Bemutatkoztato(){
        Ember e1 = new Ember("Pál", 2000);
        Ember e2 = new Ember("John", 2000, "angol");
        
        ArrayList<String>nyelvek = new ArrayList<>();
        nyelvek.add("francia");
        nyelvek.add("német");
        nyelvek.add("olasz");
        Ember e3 = new Ember("Ede", 1983, nyelvek);
        emberek = new Ember[3];
        emberek[0]= e1;
        emberek[1]= e2;
        emberek[2]= e3;
    }
    
    public String bemutatkozas(){
        String s = "*** Bemutatkozás ***";
        for (Ember ember : emberek){
            s += "\n" + ember.bemutatkozas();
            s += "\n ------------";
        }
        return s;
    }
    
    public void nyelvTanfolyam(){
        emberek[0].ujNyelv("angol");
    }
}
