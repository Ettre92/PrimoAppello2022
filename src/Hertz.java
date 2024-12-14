import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Hertz {
    private ArrayList<Automezzo> automezzi;
    public Hertz(){
        automezzi=new ArrayList<>();
    }
    public void add(Automezzo a){
        automezzi.add(a);
    }
    public void remove(Automezzo a){
        automezzi.remove(a);
    }
    public Automezzo getAutomezzoPertarga(String targa){
        for(Automezzo a:automezzi){
            if(a.getTarga().equals(targa))
                return a;
        }
        return null;
    }
    public ArrayList<Automezzo> getAutomezziPerModello(String modello){
        ArrayList<Automezzo> automezz=new ArrayList<>();
        for(Automezzo a:automezzi){
            if(a.getModello().equals(modello))
                automezz.add(a);
        }
        return automezz;
    }
    public ArrayList<Automezzo> getAutomezziInPrestito(){
        ArrayList<Automezzo> automezz=new ArrayList<>();
        for(Automezzo a:automezzi){
            if(!a.isDisponibilitaPrestito()){
                automezz.add(a);
            }
        }
        return automezz;
    }

    public void effettuaPrestito(String targa) {
        boolean found = false;
        for (Automezzo a : automezzi) {
            if (a.getTarga().equals(targa)) {
                a.Prestito(a.getPrestito());
                found = true;
                break;
            }
        }
        if (!found) {
            throw new TargaException("Targa non trovata: " + targa);
        }
    }
    public void effettuaReso(String targa){
        boolean found=false;
        for(Automezzo a:automezzi){
            if(a.getTarga().equals(targa)){
                a.Reso(a.getReso());
                found=true;
                break;
            }
        }
        if(!found){}
    }//ciao
}
