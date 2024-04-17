import java.util.Scanner;

public class AleCi {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in); // Correzione: System.in invece di system.in
        System.out.println("ciao alessia ho visto sei andata alla coop oggi, hai già mangiato?");
        String risposta = var1.nextLine();
        Menu menu1 = new Menu("o' panino co salame e mortadella e porporina della nonna", "Frat'm Gilberto", 79);
        Menu menu2 = new Menu("il mc flurry al pistacchio perchè comunque è nuovo", "il signore del mc", 100);
        if (risposta.equalsIgnoreCase("no")) {
            System.out.println("bene sono pronto a ricevere la tua ordinazione, seleziona pure i piatti che vuoi, come sempre princess selezioni pure i migliori chef");
            
        }
        else{
            System.out.println("stronza ci hai appeso");
        }
    }
}

class Menu {
    String ingredienti;
    String chef;
    int prezzo;

    public int getPrezzo() {
        return prezzo;
    }

    public Menu(int prezzo) {
        this.prezzo = prezzo;
    }

    public Menu(String ingredienti, String chef, int prezzo) {
        this.ingredienti = ingredienti;
        this.chef = chef;
        this.prezzo = prezzo;
    }
}

class Ordinazione extends Menu {
    
    public void conto(Menu menu1, Menu menu2) {
        System.out.println(menu1.getPrezzo() + menu2.getPrezzo());
    }

    public Ordinazione(int prezzo) {
        super(prezzo);
    }

    public Ordinazione(String ingredienti, String chef, int prezzo) {
        super(ingredienti, chef, prezzo);
    }
}
