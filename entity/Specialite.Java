package entity;

public class Specialite {
    private String nom;

    public Specialite(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
