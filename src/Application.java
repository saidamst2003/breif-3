import java.util.ArrayList;
import java.util.Scanner;
public class Application  {
    public  static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        ArrayList<Client> clients = new ArrayList<>();
        Client client = new Client();
        ArrayList<CompteCourant> compteCourants =new ArrayList<>();
        ArrayList<CompteEpargne> compteEpargnes =new ArrayList<>();



        int choix;
       do {

            System.out.println(" --------Menu principal-----");
            System.out.println("1. Gestion des clients : ");
            System.out.println("2. gestion des Compte: ");
            System.out.println("0. Quitter");
            System.out.println("votre choix :");
            choix = scanner.nextInt();


            switch (choix) {
                case 1:
                    client.GestionClient(clients);
                    break;
                case 2:
                    Compte compte=new CompteCourant();
                compte.GestionCompte(compteEpargnes,compteCourants,clients);
                    break;
                case 0:
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }while (choix==0);
    }


}

