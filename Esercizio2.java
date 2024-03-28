import java.util.ArrayList;
import java.util.Scanner;

public class Esercizio2 {
   
    //creo un metodo per far stampare nell'ArrayList i valori per fare le operazioni
    public metodo1(ArrayList x) {
        for (int k = x.size(); k < 5; k++) {

            System.out.println("Che variabile vuoi aggiungere");
            x.add(var2.nextInt());
            }
            System.out.println(x);
            }

            //metodo per fare operazioni sui valori nell'Array
    public void metodo2(ArrayList x) {
        System.out.println("che gle famo con sti addendi?");

        int operazione = var2.nextInt();
        while (j) {

            switch (operazione) {

                case 1:
                    System.out.println("quali variabili vuoi usare?");
                    String add1 = var1.nextLine();
                    System.out.println("quali variabili vuoi usare?");
                    String add2 = var1.nextLine();

                    System.out.println(x.size(add1) + x.size(add2));
                    System.out.println("ok orgasmo da codice che gira done");

                    break;

                case 2:
                    System.out.println("quali variabili vuoi usare?");
                    String mol1 = var1.nextLine();
                    System.out.println("quali variabili vuoi usare?");
                    String mol2 = var1.nextLine();
                    System.err.println(x.size(mol1) * x.size(mol2));
                    System.out.println("ok orgasmo da codice che gira done");
                    break;

                case 3:
                    System.out.println("quali variabili vuoi usare?");
                    String sott1 = var1.nextLine();
                    System.out.println("quali variabili vuoi usare?");
                    String sott2 = var1.nextLine();
                    System.err.println(x.size(sott1) - x.size(sott2));
                    System.out.println("ok orgasmo da codice che gira done");

                    break;

                case 4:
                    System.out.println("quali variabili vuoi usare?");
                    System.out.println("quali variabili vuoi usare?");
                    String div1 = var1.nextLine();
                    System.out.println("quali variabili vuoi usare?");
                    String div2 = var1.nextLine();
                    System.err.println(x.size(div1) / x.size(div2));
                    System.out.println("ok orgasmo da codice che gira done");
                    break;

                case 5:
                    j = false;

                    break;
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> x = new ArrayList<Integer>();
        // iniziamo a definire tutte le variabili che possoo servire
        Scanner var1 = new Scanner(System.in);
        Scanner var2 = new Scanner(System.in);
        int i = 1;
        boolean j = true;
        Esercizio2 richiama = new Esercizio2();

        // apro il ciclo di introduzione e richiamo il mio array
        while (i < 3) {
            System.out.println("Bella nerdone famo du calcoli?");
            String risposta = var1.nextLine();
            if (risposta.equals("No") || risposta.equals("no")) {
                i++;
                System.out.println("Sicuro? Non fare il Pippo dai");
                String risp2 = var1.nextLine();
                if (risp2.equals("Si")) {
                    i++;
                    break;
                } else {
                    i--;
                }
            } else {
                // richiamo metodo1
                
                richiama.metodo1(x);
                richiama.metodo2(x);
                

                
            }

        }
    }

}
