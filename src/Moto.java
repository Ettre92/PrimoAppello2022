import java.util.Date;
import java.util.GregorianCalendar;

public class Moto extends Automezzo{
    private long giorni;
    public Moto(String Marca, String Modello, int cavalli, String targa) {
        super(Marca, Modello, cavalli, targa);
        this.giorni = 0;
    }



    public long getGiorni() {
        return giorni;
    }

    public double Reso(GregorianCalendar data){
        double costo=0;
         setDisponibilitaPrestito(true);
        int count=0;
        long diffMillis = data.getTimeInMillis() - getPrestito().getTimeInMillis();
        giorni = diffMillis / (24 * 60 * 60 * 1000); // Convertire la differenza in millisecondi ai giorni
        GregorianCalendar datacalcolata=new GregorianCalendar();
        datacalcolata=getPrestito();
       while(count<giorni){

           if(datacalcolata.get(GregorianCalendar.DAY_OF_WEEK)==GregorianCalendar.SATURDAY || datacalcolata.get(GregorianCalendar.DAY_OF_WEEK)==GregorianCalendar.SUNDAY){
               costo+=30;
           }else{
               costo+=20;
           }
            datacalcolata.add(GregorianCalendar.DAY_OF_MONTH,1);
           count++;
       }

        return costo;
    }
}
