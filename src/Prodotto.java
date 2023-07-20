import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto(String nome , String descrizione ,double prezzo,double iva ){
        this.codice=codiceProdotto();
        this.nome=nome;
        this.descrizione=descrizione;
        this.prezzo=prezzo;
        this.iva=iva;
    }

    public int getCodice() {
        return codice;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    public int codiceProdotto(){
        Random random=new Random();
        int code=random.nextInt(10000000,100000000);
        return code;
    }

    public double prezzoIva(double prezzo){
       return prezzo+(prezzo*iva);
    }

    @Override
    public String toString() {
        return nome +"-"+ codice;
    }
}