package mediatheque;

public class DocumentIntrouvableException extends MediathequeException {
    protected DocumentIntrouvableException(String titre) {
        super("Aucun document au titre : " + titre);
    }
}
