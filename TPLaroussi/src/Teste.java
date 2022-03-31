import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Categorie c1 = new Categorie(1,"boisson");
        Categorie c2 =new Categorie(2,"jeu");
        ArrayList<Produit> listProduit = new ArrayList<Produit>();
        listProduit.add(new Produit(1,"toto",25,2.2,5,c2));
        listProduit.add(new Produit(2,"tata",20,5.0,5,c1)) ;
        for(Produit produit:listProduit){
            System.out.println(produit);
        }

    }
}
