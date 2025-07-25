import entity.*;
import services.ServiceMedecin;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Création d'exemples de données
        Specialite specialiteGeneraliste = new Specialite("Généraliste");
        Medecin medecin = new Medecin("Durand", "Pierre", specialiteGeneraliste);
        Patient patient = new Patient("Dupont", "Jean", "jean.dupont@mail.com");

        ServiceMedecin serviceMedecin = new ServiceMedecin();

        boolean continuer = true;
        while (continuer) {
            System.out.println("Menu :");
            System.out.println("1. Ajouter un rendez-vous pour le médecin");
            System.out.println("2. Afficher les rendez-vous du médecin");
            System.out.println("3. Vérifier la disponibilité du médecin");
            System.out.println("4. Quitter");
            System.out.print("Choix : ");
            
            int choix = scanner.nextInt();
            scanner.nextLine();  

            switch (choix) {
                case 1:
                    System.out.println("Entrez la date et l'heure du rendez-vous (yyyy-MM-ddTHH:mm) :");
                    String date = scanner.nextLine();
                    LocalDateTime dateHeure = LocalDateTime.parse(date);
                    RendezVous rdv = new RendezVous(patient, medecin, dateHeure);
                    serviceMedecin.ajouterRendezVous(medecin, rdv);
                    break;
                case 2:
                    serviceMedecin.afficherRendezVous(medecin);
                    break;
                case 3:
                    System.out.println("Entrez la date et l'heure pour vérifier la disponibilité du médecin (yyyy-MM-ddTHH:mm) :");
                    String dateVerification = scanner.nextLine();
                    LocalDateTime dateVerificationHeure = LocalDateTime.parse(dateVerification);
                    boolean disponible = serviceMedecin.estDisponible(medecin, dateVerificationHeure);
                    if (disponible) {
                        System.out.println("Le médecin est disponible à cette date.");
                    } else {
                        System.out.println("Le médecin n'est pas disponible à cette date.");
                    }
                    break;
                case 4:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }

        scanner.close();
    }
}
