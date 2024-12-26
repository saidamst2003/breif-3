import java.util.ArrayList;
import java.util.Scanner;
public abstract class Compte {
    private int numero;
    private double solde;
    Client client;

    public Compte(int numero, double solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.client = client;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
public void GestionCompte() {
    Scanner scanner = new Scanner(System.in);
    int choix;

    do {

        System.out.println("\n--- MENU GESTION DES COMPTES BANCAIRES ---");
        System.out.println("1. Ajouter un compte courant");
        System.out.println("2. Ajouter un compte epargne");
        System.out.println("0. Quitter");
        System.out.print("Entrez votre choix : ");
        choix = scanner.nextInt();
        switch (choix){
            case 1:
                AjoutercompteCourant;
                break;

            case 2:
                AjouterCompteEpargne;
                    break;
            case 0:
                System.out.println("retoure au menu principal.");
                break;
            default:
                System.out.println("choix invalide.");
        }
    }
}
    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", client=" + client +
                '}';
    }
}