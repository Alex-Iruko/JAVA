public class Categorie {
    //Atribut
    private int id;
    private String nom;
    //Constructeur

    public Categorie(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    //Get&Set
    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
