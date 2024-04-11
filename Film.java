import java.util.ArrayList;
import java.util.Scanner;

public class Film {
    String titolo;
    int uscita;
    ArrayList<>filmList=newArrayList();
    public Film(Scanner var1){
        System.out.println("Che film vuoi aggiungere?");
    this.titolo = var1.nextLine();
    System.out.println("Quando è uscito il film?");
    this.uscita = var1.nextInt();
    }
    public String getTitolo(){
        return titolo;
    }
    public void setTitolo(String titolo){
        this.titolo = titolo;
    }
    public int getUscita(){
        return uscita;
    }
    public void setUscita(int uscita){
        this.uscita = uscita;
    }
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        Scanner var2 = new Scanner(System.in);
        Film film = new Film (var1);
        boolean i = true;
    while (i) {
        System.out.println("Ciao benvenuto, desideri aggiungere un nuovo film al catalogo?");
        String risposta = var1.nextLine();

    if (risposta.equalsIgnoreCase("no"))
    {System.out.println("hai aggiunto il film "+ film.getTitolo() + " del " + film.getUscita());}
    else
    {i = false;}

 ArrayList<>filmList= new ArrayList<>(film);
    }
   
    }}

public void acquistofilm()
{filmList.add(film);}