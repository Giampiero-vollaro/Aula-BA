import java.util.Scanner;

//Creo la mia classe principale ed eseguo il codice
public class Autosalone {
   public static void main(String[] args) {
      //creo le variabili di cui ho bisogno
      Scanner var1 = new Scanner(System.in);
      Scanner var2 = new Scanner(System.in);
      String modello = var1.nextLine();
      String colore = var1.nextLine();
      int anno = var2.nextInt();
      //eseguo un ciclo for dove ho la possibilità di acquistare fino a 3 auto
      for (int i = 1; i < 4; i++) {
         System.err.println("Salve gentile cliente, benvenuto nel nostro sho online, desideri acquistare un auto?");
         String risposta = var1.nextLine();
         //se l'utente desidera acquistare faccio creare l'auto richiamando man mano i costruttori
         if (risposta.equals("si")){
         Auto auto1 = new Auto();
         System.out.println("Seleziona il modello e l'anno" auto1.getModello() + auto1.getColore() + auto1.getAnno());
         Auto auto1_scelta = new Auto(modello, anno);
         System.out.println("Ottima scelta hai selezionato " + auto1_scelta.getModello() + auto1_scelta.getColore() + auto1_scelta.getAnno());
         System.out.println("Seleziona il colore o acqusta a costo ridotto il nostro modello di linea bianco");
         Auto auto1_definitiva = new Auto(modello, colore, anno);
         System.out.println("Fantastico la tua auto arriverà in poche settimane all indirizzo da lei specificato");
         System.out.println("Hai scelto " + auto1_definitiva.getModello() + auto1_scelta.getColore() + auto1_definitiva.getAnno());
         //si può personalizzare aggiungendo richiesta di dati anagrafici del cliente, e personalizzando l'integrazione
      }
      else{
         System.out.println("Torna a trovarci");
         i = 4;
      }

      }
      var1.close();
      var2.close();
   }

}

class Auto {
   // creo le variabili
   String modello;
   String colore;
   int anno;

   // creo i costruttori
   public Auto() {
      this.modello = "Sconosciuto";
      this.colore = "Non specificato";
      this.anno = 2024;
   }

   public Auto(String modello, int anno) {
      this.modello = modello;
      this.colore = "Bianco";
      this.anno = anno;
   }

   public Auto(String modello, String colore, int anno) {
      this.modello = modello;
      this.colore = colore;
      this.anno = anno;
   }

   // creo i get per richiamare le variabili attraverso il costruttore
   public String getModello() {
      return modello;
   }

   public String getColore() {
      return colore;
   }

   public int getAnno() {
      return anno;
   }

}
