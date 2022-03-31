public class Produit {
    //Atribut
    private int codeProduit;
    private String nom;
    private int quantiteStock;
    private double prixUnitaire;
    private int stockSecu;
    private Categorie categorie;

    //Constructeur

    public Produit(int codeProduit, String nom, int quantiteStock, double prixUnitaire, int stockSecu) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.quantiteStock = quantiteStock;
        this.prixUnitaire = prixUnitaire;
        this.stockSecu = stockSecu;
    }

    public Produit(int codeProduit, String nom, int quantiteStock, double prixUnitaire, int stockSecu, Categorie categorie) {
        this.codeProduit = codeProduit;
        this.nom = nom;
        this.quantiteStock = quantiteStock;
        this.prixUnitaire = prixUnitaire;
        this.stockSecu = stockSecu;
        this.categorie = categorie;
    }

    //Methodes
    public void majQteApro(int quantite) {
        this.quantiteStock += quantite;
    }

    public void majQteVente(int quantite) {
        this.quantiteStock -= quantite;
    }

    public double estimation() {
        double prixTotal = this.prixUnitaire * this.quantiteStock;
        return prixTotal;
    }

    public String alerte(){
        String message="";
        if(this.quantiteStock<=this.stockSecu){
            message="Attention stock trop bas";
        }
        else {
            message ="Stock bon";
        }
        return message;
    }

    public boolean validationCommande(int qteCommande){
       boolean commandValide=false;
       if (this.quantiteStock - qteCommande<=this.stockSecu){
           commandValide=false;
        }
       else{
           commandValide=true;
        }
       return commandValide;

    }

    @Override
    public String toString() {
        return "Produit{" +
                "codeProduit=" + codeProduit +
                ", nom='" + nom + '\'' +
                ", quantiteStock=" + quantiteStock +
                ", prixUnitaire=" + prixUnitaire +
                ", stockSecu=" + stockSecu +
                ", categorie=" + categorie +
                '}';
    }
}
