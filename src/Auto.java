import java.util.GregorianCalendar;
public class Auto extends Automezzo{
    private int costoGiornaliero;
    public Auto(String Marca, String Modello, int cavalli, String targa) {
        super(Marca, Modello, cavalli, targa);
        this.costoGiornaliero=3;
    }
    public double Reso(GregorianCalendar data){
        double totale=0;
        GregorianCalendar datacalcolata=new GregorianCalendar();
        datacalcolata=getPrestito();
        while(datacalcolata.getTimeInMillis()<data.getTimeInMillis()){
        totale+=costoGiornaliero;
        datacalcolata.add(GregorianCalendar.DAY_OF_MONTH,1);
        }
        return totale*getCavalli();
    }
}
