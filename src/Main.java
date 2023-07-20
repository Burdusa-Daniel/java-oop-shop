import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prodotto product = new Prodotto("cappello","bello" ,5,0.22 );
        System.out.println("il nome del prodotto è "+product.getNome());
        System.out.println("descrizone:"+product.getDescrizione());
        System.out.println("prezzo base:"+product.getPrezzo());
        double prezzo = product.prezzoIva(product.getPrezzo());
        System.out.println("il prezzo totale del prodotto è :"+ prezzo);
        System.out.println("il codice è :"+product.getCodice());
        System.out.println("nome completo :"+product.toString());
        System.out.println("iva"+product.getIva());
        product.setNome("pippo");
        product.setDescrizione("pippotto");
        product.setPrezzo(6);
        product.setIva(0.33);
        System.out.println("name+:"+product.getNome());
        System.out.println("descrizione+"+product.getDescrizione());
        System.out.println("prezzo+"+product.getPrezzo());
        System.out.println("iva+"+product.getIva());
        System.out.println("full prezzo 2 "+product.prezzoIva(product.getPrezzo()));
        System.out.println("nome+"+product.toString());
    }
}
