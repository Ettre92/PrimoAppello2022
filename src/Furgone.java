import java.util.GregorianCalendar;

public class Furgone extends Automezzo{
    public Furgone(String Marca, String Modello, int cavalli, String targa) {
        super(Marca, Modello, cavalli, targa);
    }
    @Override
    public double Reso(GregorianCalendar data) {
        GregorianCalendar datacalcolata=new GregorianCalendar();
        datacalcolata=getPrestito();
        double totale=0;
        while(datacalcolata.getTimeInMillis()<data.getTimeInMillis()){
                switch (getMarca()){
            case "Ford":
                totale+=40;
                    case "Fiat":
                        totale+=30;
                        case "Citroen":
                            totale+=35;
            datacalcolata.add(GregorianCalendar.DAY_OF_MONTH,1);
        }
        }
        return totale;
    }
}
