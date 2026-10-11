package mediatheque;

public class DocumentIndisponibleException extends MediathequeException {
    /** Cas principal : le document est déjà emprunté. */
    protected DocumentIndisponibleException(String titre) {
        super("Document déjà emprunté : " + titre);
    }

    /** Autre cas  */
    protected DocumentIndisponibleException(String titre, String motif) {
        super("Document indisponible à l'emprunt (" + motif + ") : " + titre);
    }
}
