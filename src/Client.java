
public class Client {
   private int Id;
   private String nom;
   private String prenom;
   private String email;
   private String adresse;
   private String telephone;

public void Client(int Id, String nom, String prenom, String email, String adresse, String telephone){
this.Id = Id;
this.nom = nom;
this.prenom =prenom;
this.email =email;
this.adresse =adresse;
this.telephone =telephone;
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