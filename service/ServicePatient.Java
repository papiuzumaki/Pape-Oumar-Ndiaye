package services;

import entity.Patient;
import entity.Medecin;
import entity.RendezVous;
import java.time.LocalDateTime;

public class ServicePatient {

    public void demanderRendezVous(Patient patient, Medecin medecin, LocalDateTime dateHeure) {
        if (medecin != null && dateHeure != null) {
            RendezVous rdv = new RendezVous(patient, medecin, dateHeure);
            patient.ajouterRendezVous(rdv);
            medecin.ajouterRendezVous(rdv);
            System.out.println("Rendez-vous demandé avec le médecin " + medecin.getNom() + " à " + dateHeure);
        }
    }

    public void annulerRendezVous(Patient patient, RendezVous rdv) {
        patient.annulerRendezVous(rdv);
        rdv.annuler();
        System.out.println("Rendez-vous annulé.");
    }

    public void afficherRendezVous(Patient patient) {
        patient.getRendezVous().forEach(rdv -> System.out.println(rdv));
    }

    public void afficherRendezVous(Medecin medecin) {
        medecin.getRendezVous().forEach(rdv -> System.out.println(rdv));
    }
}
