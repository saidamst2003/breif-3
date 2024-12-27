import java.util.ArrayList;
import java.util.Scanner;

public class CompteEpargne extends Compte {
    private double tauxInteret;

    public CompteEpargne(int numero, double solde, Client client, double tauxInteret) {
        super(numero, solde, client);
        this.tauxInteret = tauxInteret;

    }
public  CompteEpargne(){

}
    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void GestionCompteEpargne(ArrayList<CompteEpargne> comptes){
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();
        while (choix !=0){
            System.out.println("------Gestion de Compte Epargne------");
            System.out.println("1:ajouter un compte Epargne : ");
            System.out.println("2:afficher compte Epargne: ");
            System.out.println("0.Quitter");
            System.out.println(" entrer votre choix: ");
            switch (choix){
                case 1:
                   AjouterCompteEpargne(comptes);
                    break;
                case  2:
                    AfficherComteEpargne();
                    break;
                case 0:
                    System.out.println(" retour au menu principal. ");
                    break;
                default:
                    System.out.println("choix invalide.");
            }
        }
    }
    public void AjouterCompteEpargne(ArrayList<CompteEpargne> comptes){


    }
    public void AfficherComteEpargne(){

    }
    @Override
    public String toString() {
        return "ComteEpargne{" +
                "tauxInteret=" + tauxInteret +
                ", client=" + client +
                '}';
    }

}
