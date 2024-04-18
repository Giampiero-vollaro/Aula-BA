import java.util.Scanner;

public class AleCi {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in); 
        System.out.println("Ciao Alessia! Ho visto che sei andata alla Coop oggi, hai già mangiato?");
        String risposta = var1.nextLine();
        
        // Menu' divertenti
        Menu menu1 = new Menu("o' panino co salame e mortadella e porporina della nonna", "Frat'm Gilberto", 79);
        Menu menu2 = new Menu("il mc flurry al pistacchio perchè comunque è nuovo", "il signore del mc", 100);
        
        // Ordinazione
        Ordinazione ordinazione = new Ordinazione();
        
        if (risposta.equalsIgnoreCase("no")) {
            System.out.println("Bene, sono pronto a ricevere la tua ordinazione! Seleziona pure i piatti che vuoi.");
            
            // Presentiamo i piatti al cliente
            System.out.println("Il tuo primo piatto è: " + menu1.getIngredienti() + " cucinato da " + menu1.getChef());
            System.out.println("Vuoi aggiungere un altro piatto? [si/no]");
            
            // Chiediamo se vuole aggiungere il secondo piatto
            String aggiungi = var1.nextLine();
            if (aggiungi.equalsIgnoreCase("si")) {
                System.out.println("Il tuo secondo piatto è: " + menu2.getIngredienti() + " cucinato da " + menu2.getChef());
                ordinazione.aggiungiPiatto(menu1);
                ordinazione.aggiungiPiatto(menu2);
            } else {
                ordinazione.aggiungiPiatto(menu1);
            }
            
            // Stampiamo il conto totale
            System.out.println("Grazie per aver pranzato con noi! In totale sono €" + ordinazione.calcolaTotale() + " da pagare alla cassa.");
        } else {
            System.out.println("Beh, sembra che tu ci abbia appeso! Va bene, sarà per la prossima volta!");
        }
        
        var1.close();
    }
}

class Menu {
    private String ingredienti;
    private String chef;
    private int prezzo;

    public Menu(String ingredienti, String chef, int prezzo) {
        this.ingredienti = ingredienti;
        this.chef = chef;
        this.prezzo = prezzo;
    }

    public String getIngredienti() {
        return ingredienti;
    }

    public String getChef() {
        return chef;
    }

    public int getPrezzo() {
        return prezzo;
    }
}

class Ordinazione {
    private int totale = 0;

    public void aggiungiPiatto(Menu menu) {
        totale += menu.getPrezzo();
    }

    public int calcolaTotale() {
        return totale;
    }
}

   
