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

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                ", client=" + client +
                '}';
    }
}