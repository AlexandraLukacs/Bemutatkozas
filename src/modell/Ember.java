package modell;

import java.util.ArrayList;

public class Ember {
    // Adattagok
    private String nev;
    private int szul_ev;
    private ArrayList<String> nyelvek;
    
    //Konstruktor(ok)
    public Ember(String nev, int szul_ev){
        this(nev, szul_ev, "magyar");
    }
    
    public Ember(String nev, int szul_ev, String anyanyelv){
        this(nev, szul_ev, new ArrayList<>());
        this.nyelvek.add(anyanyelv);
    }
    
    public Ember(String nev, int szul_ev, ArrayList<String> nyelvek){
        this.nev=nev;
        this.szul_ev=szul_ev;
        this.nyelvek=nyelvek;
    }

    public String getNev() {
        return nev;
    }

    public int getSzul_ev() {
        return szul_ev;
    }
    
    public int getKor() {
        return 2024-szul_ev;
    }

    public String[] getNyelvek() {
        String[] ny = new String[nyelvek.size()]; // üres tömb
//        for (int i = 0; i < ny.length; i++) {
//            ny[i] = nyelvek.get(i);
//        }
        /* Java API használatával */
        return nyelvek.toArray(ny);
    }

//    public void addNyelv(String nyelv) {
    public void ujNyelv(String nyelv) {
        this.nyelvek.add(nyelv);
    }
    
    public void ujNyelv(ArrayList<String> nyelvek) {
        for (String nyelv : nyelvek) {
            ujNyelv(nyelv);
        }
    }

    public String bemutatkozas() {
        String s = nev + " vagyok, anyanyelvem: " + nyelvek.get(0);
        int kor = 2024-this.getSzul_ev();
        
        return "Ember{" + "nev=" + nev + ", szul_ev=" + szul_ev + ", nyelvek=" + nyelvek + '}';
    }
    
    
}
