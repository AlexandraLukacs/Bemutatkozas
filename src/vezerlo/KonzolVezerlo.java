package vezerlo;

import modell.Bemutatkoztato;
import modell.Ember;
import nezet.KonzolNezet;

public class KonzolVezerlo {
    private Bemutatkoztato modell;
    private KonzolNezet nezet;

    public KonzolVezerlo(Bemutatkoztato modell, KonzolNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
    }

    public void kezdes() {
        String adat = modell.bemutatkozas();
        nezet.megjelenit(adat);
        
        modell.nyelvTanfolyam();
        nezet.megjelenit("\nTanfolyam után: \n");
        nezet.megjelenit(modell.bemutatkozas());
    }
    
    public String bemutatkozasOsszeallitas(int i){
        
        return "";
    }
    
    public String bemutatkozasOsszeallitas(Ember ember){
        
        return "";
    }
    
    public String bemutatkozasOsszeallitas(){
        
        return "";
    }
}
