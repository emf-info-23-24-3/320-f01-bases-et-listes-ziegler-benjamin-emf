package app;
import java.util.ArrayList;
 
public class Application {
 
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();
 
        personnes.add(new Personne("Benjamin", "Ziegler", "rue des fontanettes", "Avry", 1633));
        personnes.add(new Personne("Lebron", "James", "rue des fontanettes2", "Los Angeles", 16332));
 
        for (Personne personne : personnes) {
            System.out.println(personne.getNom());
        }
 
    }
 
}