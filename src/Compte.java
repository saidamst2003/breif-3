import java.util.ArrayList;
import java.util.Scanner;
public abstract class Compte {
    private int numero;
    private double solde;
    Client client;
    ArrayList<CompteCourant> compteCourants ;
    ArrayList<CompteEpargne> compteEpargnes ;
    ArrayList<Client> clients = new ArrayList<>();

    public ArrayList<CompteCourant> getCompteCourants() {
        return compteCourants;
    }

    public void setCompteCourants(ArrayList<CompteCourant> compteCourants) {
        this.compteCourants = compteCourants;
    }

    public ArrayList<CompteEpargne> getCompteEpargnes() {
        return compteEpargnes;
    }

    public void setCompteEpargnes(ArrayList<CompteEpargne> compteEpargnes) {
        this.compteEpargnes = compteEpargnes;
    }

    public Compte(int numero, double solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.client = client;
    }
public  Compte(){

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
public Compte GestionCompte(ArrayList<CompteEpargne> compteEpargneArrayList,ArrayList<CompteCourant> compteCourantArrayList,ArrayList<Client> clientArrayList) {
        this.compteEpargnes=compteEpargneArrayList;
        this.compteCourants=compteCourantArrayList;
        this.clients=clientArrayList;
    Scanner scanner = new Scanner(System.in);
    int choix = scanner.nextInt();
while (choix !=0) {
    System.out.println("-----gestion de Compte-----");
    System.out.println("1. Ajouter un compte courant");
    System.out.println("2. Ajouter un compte epargne");
    System.out.println("0. Quitter");
    System.out.print("Entrez votre choix : ");
    choix = scanner.nextInt();
    switch (choix) {
        case 1:
            CompteCourant compteCourant=new CompteCourant();
           // compteCourant.GestionCompteCourant(compteCourantArrayList);
            Associer(1);
            break;

        case 2:
            CompteEpargne compteEpargne=new CompteEpargne();
            Associer(2);
          //  compteEpargne.GestionCompteEpargne(compteEpargneArrayList);
            break;
        case 0:
            System.out.println("retour au menu principal.");
            break;
        default:
            System.out.println("choix invalide.");
    }
}
    return null;

}


    public  Client IsClientExist(int ClientId){
        for(Client client : clients){
            if(client.getId() == ClientId){
                return client;
            }
        }
        return null;

    }
    public void Associer(int Type){
     Scanner scanner=new Scanner(System.in);
        System.out.println("entrer le numero de compte: ");
        int nomCompte =scanner.nextInt();
        System.out.println("entrer le solde initail : ");
        double solde =scanner.nextDouble();
        System.out.println("entrer id de Client : ");
        int id = scanner.nextInt();
        Client ClientExiste = IsClientExist(id);

            if(ClientExiste !=null ){

                if (Type==1){
                    compteCourants.add(new CompteCourant(nomCompte,solde,ClientExiste,43));
                } else if (Type==2) {
                    compteEpargnes.add(new CompteEpargne(nomCompte,solde,ClientExiste,43));
                }

            }else {
                System.out.println("Client n'exsiste pas");

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