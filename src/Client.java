import  java.util.Scanner;
import java.util.ArrayList;

public class Client {
   Scanner scanner =new Scanner(System.in);
   private int Id;
   private String nom;
   private String prenom;
   private String email;
   private String adresse;
   private String telephone;
   private  ArrayList<Client> clientArrayList;

   public  Client(int Id, String nom, String prenom, String email, String adresse, String telephone) {
      this.Id = Id;
      this.nom = nom;
      this.prenom = prenom;
      this.email = email;
      this.adresse = adresse;
      this.telephone = telephone;
   }
   public Client(){

   }

   public int getId() {
      return Id;
   }

   public void setId(int id) {
      Id = id;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public String getPrenom() {
      return prenom;
   }

   public void setPrenom(String prenom) {
      this.prenom = prenom;
   }

   public String getEmail() {
      return email;


   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getAdresse() {
      return adresse;
   }

   public void setAdresse(String adresse) {
      this.adresse = adresse;
   }


   public String getTelephone() {
      return telephone;
   }

   public void setTelephone(String telephone) {
      this.telephone = telephone;
   }
public void GestionClient(ArrayList<Client> clients) {
      this.clientArrayList=clients;
   Scanner sc = new Scanner(System.in);
   int choix;
   do {
      System.out.println(" --------GESTION DES CLIENTS-----");
      System.out.println("1. Ajouter un Client : ");
      System.out.println("2. afficher tous les Client");
      System.out.println("0. retour au menu Principal");
      System.out.println("votre choix :");
      choix=sc.nextInt();
      switch (choix) {

         case 1:
            AjouterClient(clients);
            break;
         case 2:
            AfficherClient();
            break;
         case 0:
            System.out.println(" Routour au menu Principal.");
            break;
         default:
            System.out.println("choix invalide.");
      }
   }while (choix!=0);
}
   public void   AjouterClient(ArrayList<Client> clients) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("------- ajouter un nouvel Client-------");
      System.out.println("ID: ");
      int id = scanner.nextInt();
      System.out.println("nom: ");
      String nom = scanner.next();
      System.out.println("prenom: ");
      String prenom = scanner.next();
      System.out.println("email: ");
      String email = scanner.next();
      System.out.println("adresse: ");
      String adresse = scanner.next();
      System.out.println("telephone: ");
      String telephone = scanner.next();
      System.out.println("Client ajouté : " + nom + " " + prenom);
       clients.add(new Client(id, nom, prenom, email, adresse, telephone));
       System.out.println("Client ajouter avec succes !");
   }


   private void AfficherClient() {
//      System.out.println("le nom du Client est : " + nom);
//      System.out.println("le prenom du Clien est : "+ prenom);
//      System.out.println("le email du Client est : "+ email);
//      System.out.println("l'adresse du Client est : "+ adresse);
//      System.out.println("le telephone du Client est : " + telephone);


      for (Client client : clientArrayList){
         System.out.println(client.toString());
      }

   }


   @Override
   public String toString() {
      return "Compte{" +
              "nom='" + nom + '\'' +
              ", prenom='" + prenom + '\'' +
              ", email='" + email + '\'' +
              ", adresse='" + adresse + '\'' +
              ", telephone=" + telephone +
              '}';
   }

}