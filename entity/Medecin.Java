package entity;

import java.util.List;

public class Medecin {
    private int id;
    private String nom;
    private String prenom;
    private Specialite specialite;
    private List<RendezVous> rendezVous;
    private static int nbMedecin;

    public Medecin(String nom, String prenom, Specialite specialite) {
        nbMedecin++;
        this.id = nbMedecin;
        this.nom = nom;
        this.prenom = prenom;
        this.specialite = specialite;
        this.rendezVous = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Specialite getSpecialite() {
        return specialite;
    }

    public List<RendezVous> getRendezVous() {
        return rendezVous;
    }

    public void ajouterRendezVous(RendezVous rendezVous) {
        this.rendezVous.add(rendezVous);
    }

    public void annulerRendezVous(RendezVous rendezVous) {
        this.rendezVous.remove(rendezVous);
    }

    @Override
    public String toString() {
        return "Medecin{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", specialite=" + specialite +
                '}';
    }
}
