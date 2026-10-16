package mediatheque;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class Catalogue<T extends Document> implements Iterable<T> {
    private final List<T> documents = new ArrayList<>();

    public void ajouter(T doc) { documents.add(doc); }

    public Optional<T> rechercherParTitre(String titre) {
        return documents.stream()
                .filter(d -> d.getTitre().equalsIgnoreCase(titre))
                .findFirst();
    }
    public Iterator<T> iterator() { return Collections.unmodifiableList(documents).iterator(); }

    /* public void afficherTout() {
        documents.forEach(d -> System.out.println(d.descriptionCourte()));
    } */

    public static <T extends Comparable<T>> T max(List <T> liste) {
        T m = liste.get(0);
        for (T e : liste) if (e.compareTo(m) > 0) m = e;{ return m; }
    }

}
