package entity;

import java.util.ArrayList;
import java.util.List;
import entity.RendezVous;

public class Patient {
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private List<RendezVous> rendezVous;
    private static int nbPatient;

    public Patient(String nom, String prenom, String email) {
        nbPatient++;
        this.id = nbPatient;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
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

    public String getEmail() {
        return email;
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
        return "Patient [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + "]";
    }
}
