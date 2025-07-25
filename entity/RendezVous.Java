package entity;

import java.time.LocalDateTime;
import entity.Patient;

public class RendezVous {
    private int id;
    private Patient patient;
    private Medecin medecin;
    private LocalDateTime dateHeure;
    private String statut;
    private static int nbRdv;

    public RendezVous(Patient patient, Medecin medecin, LocalDateTime dateHeure) {
        nbRdv++;
        this.id = nbRdv;
        this.patient = patient;
        this.medecin = medecin;
        this.dateHeure = dateHeure;
        this.statut = "Demande";
    }

    public int getId() {
        return id;
    }

    public Patient getPatient() {
        return patient;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public LocalDateTime getDateHeure() {
        return dateHeure;
    }

    public String getStatut() {
        return statut;
    }

    public void confirmer() {
        this.statut = "Confirmé";
    }

    public void annuler() {
        this.statut = "Annulé";
    }

    @Override
    public String toString() {
        return "Rendez-vous{" +
                "id=" + id +
                ", patient=" + patient +
                ", medecin=" + medecin +
                ", dateHeure=" + dateHeure +
                ", statut='" + statut + '\'' +
                '}';
    }
}
