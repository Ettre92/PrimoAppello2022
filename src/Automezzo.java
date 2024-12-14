import java.util.GregorianCalendar;

public abstract class Automezzo {
    private GregorianCalendar prestito;
    private GregorianCalendar reso;
    private String Marca;
    private String Modello;
    private int cavalli;
    private String targa;
    private boolean DisponibilitaPrestito;
    public Automezzo(String Marca, String Modello, int cavalli, String targa) {
        this.Marca = Marca;
        this.Modello = Modello;
        this.cavalli = cavalli;
        this.targa = targa;
    }
    public String getMarca() {
        return Marca;
    }

    public int getCavalli() {
        return cavalli;
    }

    public String getModello() {
        return Modello;
    }

    public void setDisponibilitaPrestito(boolean disponibilitaPrestito) {
        DisponibilitaPrestito = disponibilitaPrestito;
    }

    public GregorianCalendar getPrestito() {
        return prestito;
    }

    public GregorianCalendar getReso() {
        return reso;
    }

    public String getTarga() {
        return targa;
    }
    public boolean isDisponibilitaPrestito() {
        return DisponibilitaPrestito;
    }
    public void Prestito(GregorianCalendar data){
        if(isDisponibilitaPrestito()){
            this.DisponibilitaPrestito = false;
            this.prestito = data;
        }
    }
    public abstract double Reso(GregorianCalendar data);

}
