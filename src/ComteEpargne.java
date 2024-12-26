import java.util.Scanner;

public class ComteEpargne extends Compte {
    private double tauxInteret;

    public ComteEpargne(int numero, double solde, Client client, double tauxInteret) {
        super(numero, solde, client);
        this.tauxInteret = tauxInteret;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void GestionCompteEpargne(){
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

                    break;
                case  2:

                    break;
                case 0:
                    System.out.println(" retour au menu principal. ");
                    break;
                default:
                    System.out.println("choix invalide.");
            }
        }
    }
    @Override
    public String toString() {
        return "ComteEpargne{" +
                "tauxInteret=" + tauxInteret +
                ", client=" + client +
                '}';
    }

}
