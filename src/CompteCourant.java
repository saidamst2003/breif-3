import java.util.ArrayList;
import java.util.Scanner;

public class CompteCourant extends Compte {
   private double fraisBancaires;

    public CompteCourant(int numero, double solde, Client client, double fraisBancaires) {
        super(numero, solde, client);
        this.fraisBancaires = fraisBancaires;
    }
    public  CompteCourant(){

    }
    public double getFraisBancaires() {
        return fraisBancaires;
    }
    public void setFraisBancaires(double fraisBancaires) {
        this.fraisBancaires = fraisBancaires;
    }

    public  void GestionCompteCourant(ArrayList<CompteCourant> compteCourantArrayList){
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        while (choix !=0){
            System.out.println("------Gestion de Compte courant------");
            System.out.println("1:ajouter un compte courant : ");
            System.out.println("2:afficher compte courant: ");
            System.out.println("0.Quitter");
            System.out.println(" entrer votre choix: ");
            switch (choix){
                case 1:
                    AjoutercompteCourant();
                    break;
                case  2:
                    AfficherComteCourant();
                    break;
                case 0:
                    System.out.println(" retour au menu principal. ");
                    break;
                default:
                    System.out.println("choix invalide.");
            }
        }
    }
    public  void AjoutercompteCourant(){

    }
    public  void AfficherComteCourant(){

    }
        @Override
        public String toString() {
            return "CompteCourant{" +
                    "fraisBancaires=" + fraisBancaires +
                    ", client=" + client +
                    '}';

    }
}






